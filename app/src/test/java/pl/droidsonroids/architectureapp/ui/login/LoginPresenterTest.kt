package pl.droidsonroids.architectureapp.ui.login

import com.nhaarman.mockito_kotlin.*
import org.junit.Test

import org.junit.Before
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import pl.droidsonroids.architectureapp.model.AuthService
import pl.droidsonroids.architectureapp.model.LoginServiceCallback
import pl.droidsonroids.architectureapp.model.Validator

class LoginPresenterTest {

    @Mock private lateinit var view: LoginView
    @Mock private lateinit var validator: Validator
    @Mock private lateinit var service: AuthService

    @InjectMocks private lateinit var loginPresenter: LoginPresenter

    @Before
    fun setUp() {
//        view = mock()
//        validator = mock()
//        service = mock()
//        loginPresenter = LoginPresenter(view, validator, service)

        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun enableLoginButtonWhenCredentialsIsValid() {
        //given
        whenever(validator.areCredentialsValid(any(), any())).thenReturn(true)      // odpowiednik when w Javie

        //when
        loginPresenter.onCredentialsChanged("", "")

        //then
        verify(view).enableLoginButton()
        verify(view, never()).disableLoginButton()
    }

    @Test
    fun disableLoginButtonWhenCredentialsIsInvalid() {
        whenever(validator.areCredentialsValid(any(), any())).thenReturn(false)

        loginPresenter.onCredentialsChanged("", "")

        verify(view).disableLoginButton()
    }

    @Test
    fun behaveWhenLoginClicked() {
        loginPresenter.onLoginClick("", "")

        inOrder(view) {
            verify(view).disableLoginButton()
            verify(view).hideKeyboard()
            verify(view).showProgressBar()
        }

//        verify(view).disableLoginButton()
//        verify(view).hideKeyboard()
//        verify(view).showProgressBar()
    }

    @Test
    fun goToMainScreenWhenLoginIsSuccess() {
        whenever(service.login(any(), any(), any()))
                .doAnswer { (it.arguments[2] as LoginServiceCallback).onLoginSuccess() }

        loginPresenter.onLoginClick("", "")

        verify(view).goToMainScreen()
    }

    @Test
    fun behaveWhenLoginIsNotSuccess() {
        whenever(service.login(any(), any(), any()))
                .doAnswer { (it.arguments[2] as LoginServiceCallback).onLoginFailure() }

        loginPresenter.onLoginClick("", "")

        verify(view).enableLoginButton()
        verify(view).hideProgressBar()
        verify(view).showLoginError()
    }
}
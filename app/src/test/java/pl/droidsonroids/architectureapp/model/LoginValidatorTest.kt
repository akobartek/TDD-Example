package pl.droidsonroids.architectureapp.model

import org.junit.Assert.*
import org.junit.Test

class LoginValidatorTest {

    private val loginValidator = LoginValidator()

    private fun areCredentialsValid(login: String = "Login", password: String = "Password123")
            = loginValidator.areCredentialsValid(login, password)

    @Test
    fun isLoginAndPasswordValid() {
        assertTrue(areCredentialsValid())
    }

    @Test
    fun isPasswordTooShort() {
        assertFalse(areCredentialsValid(password = "Pas"))
    }

    @Test
    fun isLoginTooShort() {
        assertFalse(areCredentialsValid(login = "lo"))
    }

    @Test
    fun isDigitInLogin() {
        assertFalse(areCredentialsValid(login = "login3"))
    }

    @Test
    fun isWhiteSpaceInLogin() {
        assertFalse(areCredentialsValid(login = "log in"))
    }

    @Test
    fun isDigitInPassword() {
        assertTrue(areCredentialsValid(password = "Password1"))
    }

    @Test
    fun isUpperCaseLetterInPassword() {
        assertFalse(areCredentialsValid(password = "password1"))
    }
}
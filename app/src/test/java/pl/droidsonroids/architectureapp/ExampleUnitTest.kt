package pl.droidsonroids.architectureapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {

    @Test
    fun returnOneWhenGetOne() {
        val fizzBuzz = FizzBuzz()
        val actualValue = fizzBuzz.getNumber(1)

        assertEquals(1, actualValue)
    }

    @Test
    fun returnTwoWhenGetTwo() {
        val fizzBuzz = FizzBuzz()
        val actualValue = fizzBuzz.getNumber(2)

        assertEquals(2, actualValue)
    }

    @Test
    fun returnThreeWhenGetThree() {
        val fizzBuzz = FizzBuzz()
        val actualValue = fizzBuzz.getNumber(3)

        assertEquals("Fizz", actualValue)
    }
}
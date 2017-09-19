package pl.droidsonroids.architectureapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {

    private val fizzBuzz = FizzBuzz()

    @Test
    fun returnOneWhenGetOne() {
        val actualValue = fizzBuzz.getMsg(1)

        assertEquals(1.toString(), actualValue)
    }

    @Test
    fun returnTwoWhenGetTwo() {
        val actualValue = fizzBuzz.getMsg(2)

        assertEquals(2.toString(), actualValue)
    }

    @Test
    fun returnFizzWhenGetThree() {
        val actualValue = fizzBuzz.getMsg(3)

        assertEquals("Fizz", actualValue)
    }

    @Test
    fun returnBuzzWhenGet5() {
        val actualValue = fizzBuzz.getMsg(5)

        assertEquals("Buzz", actualValue)
    }

    @Test
    fun returnFizzBuzzWhenGet15() {
        val actualValue = fizzBuzz.getMsg(15)

        assertEquals("FizzBuzz", actualValue)
    }
}
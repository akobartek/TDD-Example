package pl.droidsonroids.architectureapp

class FizzBuzz {

    fun getMsg(value: Int): String = when {
        value % 15 == 0 -> "FizzBuzz"
        value % 5 == 0 -> "Buzz"
        value % 3 == 0 -> "Fizz"
        else -> value.toString()
    }
}

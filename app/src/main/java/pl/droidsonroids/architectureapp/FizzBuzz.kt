package pl.droidsonroids.architectureapp

class FizzBuzz {

    fun getMsg(value: Int): String {
        if (value % 15 == 0)
            return "FizzBuzz"
        else if (value % 3 == 0)
            return "Fizz"
        else if (value % 5 == 0)
            return "Buzz"
        return value.toString()
    }


}

package pl.droidsonroids.architectureapp

class FizzBuzz() {
    fun getNumber(value: Int): String {
        if (value % 3 == 0)
            return "Fizz"
        return value.toString()
    }


}

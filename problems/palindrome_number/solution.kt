class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x >= 0) {
            val z = x.toString()
            val numbers = z.map { it.toString().toInt() }
            val numbersReversed = numbers.reversed()
            if (numbers == numbersReversed) {
                return true
            } else {
                return false
            }
        }
        return false
    }
}
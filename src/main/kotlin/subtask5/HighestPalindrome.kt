package subtask5

// https://www.hackerrank.com/challenges/richie-rich/forum

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var lives = k
        val mod = Array(n) { _ -> false }
        val temp = digitString.toCharArray()

        for (i in 0..n / 2) {
            if (temp[i] != temp[n - i - 1]) {
                mod[i] = true
                lives--
            }
            if (temp[i] < temp[n - i - 1]) {
                temp[i] = temp[n - i - 1]
            } else if (temp[i] > temp[n - i - 1]) {
                temp[n - i - 1] = temp[i]
            }
            if (lives < 0) return "-1"
        }

        var j = 0;
        while ((lives > 0) && (j < n / 2)) {
            if (temp[j] != '9') {
                if (mod[j]) lives++
                if (lives > 1) {
                    temp[j] = '9'
                    temp[n - j - 1] = '9'
                    lives -= 2
                }
            }
            j++
        }

        if (n % 2 == 1) {
            if (lives > 0) temp[n / 2] = '9'
        }

        return temp.joinToString("")
    }
}

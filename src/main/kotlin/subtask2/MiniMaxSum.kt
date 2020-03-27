package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        val min = input.min()
        val max = input.max()

        if (min == null || max == null) {
            throw Exception("array must be an array of positive integers")
        }

        val sum = input.sum()
        return intArrayOf(sum - max, sum - min)
    }
}


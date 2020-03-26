package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyArray = sadArray
        var length = happyArray.size
        while (true) {
            happyArray = happyArray.filterIndexed { index, s ->
                (index == 0) || (index == length - 1) || (happyArray[index - 1] + happyArray[index + 1] >= s)
            }.toIntArray()
            val newLength = happyArray.size
            if (length == newLength) return happyArray
            length = newLength
        }
    }
}

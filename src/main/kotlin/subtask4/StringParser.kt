package subtask4

val startBrackets: HashMap<Char, Char> = hashMapOf(
    '(' to ')',
    '[' to ']',
    '<' to '>'
)

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val result = mutableListOf<String>()
        val lastIndex = inputString.length - 1

        inputString.slice(0 until lastIndex).forEachIndexed loop@{ startIndex, startBracket ->

            if (startBracket in startBrackets) {
                val endBracket = startBrackets[startBracket]
                var count = 1

                inputString.slice(startIndex + 1..lastIndex).forEachIndexed { endIndex, bracket ->
                    when (bracket) {
                        startBracket -> count += 1
                        endBracket -> count -= 1
                    }
                    if (count == 0) {
                        result.add(inputString.substring(startIndex + 1, startIndex + 1 + endIndex))
                        return@loop
                    }
                }
            }
        }

        return result.toTypedArray()
    }
}

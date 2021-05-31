package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val list = mutableListOf<String>()
        var startIndex = 0
        var endIndex = 0
        var openCount = 0
        var closeCount = 0
        val size = inputString.length

        for (i in 0 until size) {
            val bracket = inputString[i]
            var mutableStr = ""

            when (bracket) {
                '[' -> {
                    startIndex = i + 1
                    openCount += 1

                    for (j in startIndex until size) {
                        if (inputString[j] == '[') {
                            openCount += 1
                        }
                        if (inputString[j] == ']') {
                            closeCount += 1
                            if (closeCount == openCount) {
                                endIndex = j
                                break
                            }
                            endIndex = j
                        }
                    }
                    mutableStr = inputString.substring(startIndex, endIndex)
                    list.add(mutableStr)
                }

                '<' -> {
                    startIndex = i + 1
                    openCount += 1

                    for (j in startIndex until size) {
                        if (inputString[j] == '<') {
                            openCount += 1
                        }
                        if (inputString[j] == '>') {
                            closeCount += 1
                            if (closeCount == openCount) {
                                endIndex = j
                                break
                            }
                            endIndex = j
                        }
                    }
                    mutableStr = inputString.substring(startIndex, endIndex)
                    list.add(mutableStr)
                }
                '(' -> {
                    startIndex = i + 1
                    openCount += 1

                    for (j in startIndex until size) {
                        if (inputString[j] == '(') {
                            openCount += 1
                        }
                        if (inputString[j] == ')') {
                            closeCount += 1
                            if (closeCount == openCount) {
                                endIndex = j
                                break
                            }
                            endIndex = j
                        }
                    }
                    mutableStr = inputString.substring(startIndex, endIndex)
                    list.add(mutableStr)
                }
            }
        }
        return list.toTypedArray()
    }
}

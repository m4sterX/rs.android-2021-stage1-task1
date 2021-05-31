package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var needCheck = true
        val sadList = sadArray.toMutableList()
        var happyList = toHappy(sadList)

        while (needCheck) {
            val tryHappy = toHappy(happyList)

            if (happyList == tryHappy) {
                needCheck = false
            } else {
                happyList = tryHappy
            }
        }

        return happyList.toIntArray()
    }

    private fun checkElement(first: Int, mid: Int, last: Int): Boolean {
        return first + last > mid
    }

    private fun toHappy(sadList: MutableList<Int>): MutableList<Int> {

        val happyList = mutableListOf<Int>()
        val lastIndex = sadList.lastIndex

        for (i in 0..lastIndex) {
            when (i) {
                0 -> happyList.add(sadList[i])
                lastIndex -> happyList.add(sadList[lastIndex])
            }
            if (i in 1 until lastIndex) {
                if (checkElement(sadList[i - 1], sadList[i], sadList[i + 1])) {
                    happyList.add(sadList[i])
                }
            } else {
                continue
            }
        }

        return happyList
    }
}

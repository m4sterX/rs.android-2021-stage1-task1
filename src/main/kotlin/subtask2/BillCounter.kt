package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = 0
        val allergicMeal = bill[k]

        for (i in bill) {
            if (i == allergicMeal) {
                continue
            }
            sum += i

            if (i == bill[bill.size-1]) {
                sum /= 2
            }
        }

        return if (sum == b) {
            "Bon Appetit"
        } else {
            (b - sum).toString()
        }
    }
}

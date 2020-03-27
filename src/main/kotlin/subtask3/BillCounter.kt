package subtask3

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val fairPayment = (bill.sum() - bill[k]) / 2

        if (b == fairPayment) {
            return "Bon Appetit"
        }

        return (b - fairPayment).toString()
    }
}

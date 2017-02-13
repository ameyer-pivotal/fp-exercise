object ListProcessor {
    /*
     * Can 'process' be rewritten using functional programming concepts?
     */

    private var s = 0
    private var i = 0

    fun process(list: List<String>): Int {
        val ints = IntArray(list.size)
        convertToInts(list, ints)
        return sumInts(ints)
    }

    private fun convertToInts(strs: List<String>, ints: IntArray) {
        s = 0
        i = 0

        while (s < strs.size) {
            try {
                val intValue = strs[s].toInt()
                ints[i] = intValue
                i++
            } catch (ex: Exception) {
                // Skip element
            } finally {
                s++
            }
        }
    }

    private fun sumInts(ints: IntArray): Int {
        var sum = 0

        for (x in 0 until i) {
            sum += ints[x]
        }

        return sum
    }
}
object ListProcessor {
    fun process(list: List<String>): Int {
        val converted = convertToInts(list)
        return sumInts(converted)

        // Can be further simplified to the following,
        // eliminating the need for helper functions:
        //
        //     return list
        //         .mapNotNull {
        //             try { it.toInt() }
        //             catch (ex: Exception) { null }
        //         }.sum()
    }

    private fun convertToInts(strs: List<String>): List<Int> {
        return strs.mapNotNull {
            try { it.toInt() }
            catch (ex: Exception) { null }
        }
    }

    private fun sumInts(ints: List<Int>): Int {
        return ints.sum()
    }
}
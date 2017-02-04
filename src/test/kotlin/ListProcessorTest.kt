import junit.framework.TestCase

class ListProcessorTest : TestCase() {
    fun testEmptyList() {
        val list: List<String> = emptyList()
        assertEquals(0, ListProcessor.process(list))
    }

    fun testIgnoresNonIntegers() {
        val list = listOf(
            "1",
            "X",
            "1.5",
            "-3"
        )
        assertEquals(-2, ListProcessor.process(list))
    }
}
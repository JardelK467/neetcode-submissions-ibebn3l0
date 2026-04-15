class DynamicArray(private val capacity: Int) {

    var array = IntArray(capacity)
    var length = 0

    fun get(i: Int): Int {
        return array[i]
    }

    fun set(i: Int, n: Int) {
        array[i] = n
    }

    fun pushback(n: Int) {
        if (length == array.size) resize()
        array[length] = n
        length++
    }

    fun popback(): Int {
        val value = array[length - 1]
        length--
        return value
    }

    private fun resize() {
        array = array.copyOf(array.size * 2)
    }

    fun getSize(): Int {
        return length
    }

    fun getCapacity(): Int {
        return array.size
    }
}
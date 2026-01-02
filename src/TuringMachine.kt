class TuringMachine {
    val actions: MutableMap<String, MutableMap<Int, TuringMachineAction>> = mutableMapOf()

    fun process(lst: List<String>, firstIndex: Int = 0, firstQ: Int = 0): List<String> {
        val newList = lst.toMutableList()

        var i = when(firstIndex){
            -1 -> lst.size - 1
            else -> firstIndex
        }

        var q = firstQ

        while (true) {
            val (newChar, action, newQ) = actions.getValue(lst[i]).getValue(q)

            newList[i] = newChar
            q = newQ
            when (action) {
                0 -> break
                1 -> i--
                2 -> i++
            }
        }

        return newList
    }

    fun process(st: String, firstIndex: Int = 0, firstQ: Int = 0): String{
        return process(st.map { it.toString() }, firstIndex, firstQ).joinToString("")
    }

    fun addAction(action: TuringMachineAction, q: Int, c: String) {
        if (actions[c] == null) actions[c] = mutableMapOf(q to action)
        else actions.getValue(c)[q] = action
    }
}
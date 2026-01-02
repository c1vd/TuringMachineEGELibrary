object TuringMachineActionFactory {
    fun action(c: String, a: Int, q: Int): TuringMachineAction {
        return TuringMachineAction(c, a, q)
    }

    fun action(c: String, a: String, q: Int): TuringMachineAction {
        return action(
            c, when (a) {
                "S" -> 0
                "L" -> 1
                "R" -> 2
                "N" -> 3
                else -> throw Exception()
            }, q
        )
    }
}
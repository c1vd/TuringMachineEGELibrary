object TuringMachineActionFactory {
    fun action(c: String, a: Int, q: Int): () -> TuringMachineResponse {
        return {
            TuringMachineResponse(c, a, q)
        }
    }

    fun action(c: String, a: String, q: Int): () -> TuringMachineResponse {
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
fun main() {
    val tm = TuringMachine()

    tm.addAction(TuringMachineActionFactory.action("N", "L", 1), 0, "N")
    tm.addAction(TuringMachineActionFactory.action("N", "S", 1), 1, "N")
    tm.addAction(TuringMachineActionFactory.action("0", "S", 1), 1, "1")
    tm.addAction(TuringMachineActionFactory.action("1", "L", 1), 1,"0")

    println(tm.process("100100N".map { it.toString() }, 6))
}
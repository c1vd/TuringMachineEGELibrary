import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TuringMachineTest {
    @Test
    fun testProcess(){
        val tm = TuringMachine()

        tm.addAction(TuringMachineActionFactory.action("N", "L", 1), 0, "N")
        tm.addAction(TuringMachineActionFactory.action("N", "S", 1), 1, "N")
        tm.addAction(TuringMachineActionFactory.action("0", "S", 1), 1, "1")
        tm.addAction(TuringMachineActionFactory.action("1", "L", 1), 1, "0")

        assertEquals("100011N", tm.process("100100N", -1))
        assertEquals("100111N", tm.process("101000N", -1))
        assertEquals("101111N", tm.process("110000N", -1))
        assertEquals("011111N", tm.process("100000N", -1))
    }
}
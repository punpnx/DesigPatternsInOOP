import java.util.HashMap;
import java.util.Map;

class RemoteControl {
    private Map<Integer, Command> slots = new HashMap<>();

    public void assignSlot(int slotNumber, Command command) {
        slots.put(slotNumber, command);
    }

    public void pressButton(int slotNumber) {
        Command command = slots.get(slotNumber);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command is assigned to this slot.");
        }
    }
}

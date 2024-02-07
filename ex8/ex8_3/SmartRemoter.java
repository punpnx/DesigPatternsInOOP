// Command Pattern
public class SmartRemoter {
    public static void main(String[] args) {
        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");
        Airconditioner bedroomAc = new Airconditioner("Bedroom");

        Command turnOnBedroomLight = new TurnOnLight(bedroomLight);
        Command turnOffBedroomLight = new TurnOffLight(bedroomLight);
        Command turnOnKitchenLight = new TurnOnLight(kitchenLight);
        Command turnOffKitchenLight = new TurnOffLight(kitchenLight);
        Command turnOnBedroomAc = new TurnOnAc(bedroomAc);
        Command turnOffBedroomAc = new TurnOffAc(bedroomAc);

        RemoteControl remote = new RemoteControl();
        remote.assignSlot(0, turnOnBedroomLight);
        remote.assignSlot(1, turnOffBedroomLight);
        remote.assignSlot(2, turnOnKitchenLight);
        remote.assignSlot(3, turnOffKitchenLight);
        remote.assignSlot(4, turnOnBedroomAc);
        remote.assignSlot(5, turnOffBedroomAc);

        remote.pressButton(0); // Bedroom light on
        remote.pressButton(1); // Bedroom light off
        System.out.println("--------------------------------");
        remote.pressButton(2); // Kitchen light on
        remote.pressButton(3); // Kitchen light off
        System.out.println("--------------------------------");
        remote.pressButton(4); // Bedroom AC on and temp set to  25
        remote.pressButton(5); // Bedroom AC off
        System.out.println("--------------------------------");
        remote.pressButton(6); // unavailable slot
    }
}

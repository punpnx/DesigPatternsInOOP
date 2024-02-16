public class AlarmMediator implements Mediator {
    @Override
    public void notify(Device device) {
        if (device != null) {
            System.out.println("Alarm event ended from " + device.getName());
        }
    }
}


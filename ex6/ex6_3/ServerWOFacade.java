public class ServerWOFacade {
    public static void main(String[] args) {
        ScheduleServer scheduleServer = new ScheduleServer();
		ScheduleServerFacade scheduleServerFacade = new ScheduleServerFacade(scheduleServer);

		scheduleServerFacade.startServer();
		scheduleServerFacade.stopServer();
    }
    
}

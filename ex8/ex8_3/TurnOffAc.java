class TurnOffAc implements Command {
    private Airconditioner ac;

    public TurnOffAc(Airconditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.off();
    }
}

class TurnOnAc implements Command {
    private Airconditioner ac;

    public TurnOnAc(Airconditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.on();
        ac.setTemp(25);
    }
}
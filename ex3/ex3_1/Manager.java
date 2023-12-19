package ex3.ex3_1;

public class Manager implements IManager {
    @Override
    public void salary() {
        System.out.println("Getting the salary...");
    }

    @Override
    public void hire() {
        System.out.println("Hiring new employees...");
    }

    @Override
    public void train() {
        System.out.println("Training employees...");
    }
}

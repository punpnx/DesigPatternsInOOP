import java.util.Scanner;

public class Foot {
    private FootShape shape;

    public Foot(FootShape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("What to draw? 1. Ellipse, 2. Rectangle");
    int draw = scanner.nextInt();

    FootShape shape;
    if(draw == 1) {
        shape = new Ellipse();
    } else if(draw == 2) {
        shape = new Rectangle();
    } else {
        System.out.println("Invalid choice. Please enter 1 or 2.");
        return;
    }

    Foot foot = new Foot(shape);
    foot.draw();
    }
}

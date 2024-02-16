public class VectorImageSaver implements ShapeVisitor {
    @Override
    public void visitCircle(Circle circle) {
        System.out.printf("Saving the circle... with radius= %.1f at position %d, %d as vector%n",
                          circle.getRadius(), circle.getxPos(), circle.getyPos());
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.printf("Saving the rectangle... with width=%d height=%d at position %d, %d as vector%n",
                          rectangle.getWidth(), rectangle.getHeight(), rectangle.getxPos(), rectangle.getyPos());
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        System.out.printf("Saving the triangle... with base=%d height=%d at position %d, %d as vector%n",
                          triangle.getBase(), triangle.getHeight(), triangle.getxPos(), triangle.getyPos());
    }
}

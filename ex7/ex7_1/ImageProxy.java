public class ImageProxy implements IImage {
    private Image image;
    private String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new Image(fileName);
        }
        image.display();
    }
}

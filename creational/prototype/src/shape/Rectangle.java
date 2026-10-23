package shape;

public class Rectangle extends Shape{

    int width;
    int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        if(rectangle != null) {
            this.width = rectangle.width;
            this.height = rectangle.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}

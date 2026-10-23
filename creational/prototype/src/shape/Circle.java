package shape;

public class Circle extends Shape{
    int radius;

    public Circle() {

    }

    public Circle(Circle shape) {
        super(shape);
        if (shape != null) {
            this.radius = shape.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}

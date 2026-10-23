package shape;

public abstract class Shape implements Prototype<Shape> {

    public int x;
    public int y;
    public String color;

    public Shape() {

    }

    public Shape(Shape shape) {
        if (shape != null) {
            this.x = shape.x;
            this.y = shape.y;
            color = shape.color;
        }
    }


    public abstract Shape clone();

}

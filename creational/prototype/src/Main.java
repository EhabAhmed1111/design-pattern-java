import shape.Rectangle;
import shape.Shape;

void main() {

    Shape shape = new Rectangle();
    shape.x = 5;
    shape.y = 5;

    Shape shape1 = shape.clone();

    System.out.println(shape1.x == shape.x);

}

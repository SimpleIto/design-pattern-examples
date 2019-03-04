package creational.simplefactory.shape;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("draw Triangle");
    }

    @Override
    public void erase() {
        System.out.println("erase Triangle");
    }
}

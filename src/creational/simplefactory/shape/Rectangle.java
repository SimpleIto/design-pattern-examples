package creational.simplefactory.shape;

public class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("draw Rectangle");
    }

    @Override
    public void erase() {
        System.out.println("erase Rectangle");
    }
}

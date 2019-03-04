package creational.simplefactory.shape;

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("draw Circle");
    }

    @Override
    public void erase() {
        System.out.println("erase Circle");
    }
}

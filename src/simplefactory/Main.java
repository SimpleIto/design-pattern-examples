package simplefactory;

public class Main {
    public static void main(String[] args){
        Shape shape = ShapeFactory.createShape("circle");
        shape.draw();
    }
}

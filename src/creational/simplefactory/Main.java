package creational.simplefactory;

import creational.simplefactory.factory.ShapeFactory;
import creational.simplefactory.shape.Shape;

public class Main {
    public static void main(String[] args){
        Shape shape = ShapeFactory.createShape("circle");
        shape.draw();
    }
}

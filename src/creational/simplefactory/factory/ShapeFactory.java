package creational.simplefactory.factory;

import creational.simplefactory.shape.Circle;
import creational.simplefactory.shape.Rectangle;
import creational.simplefactory.shape.Shape;
import creational.simplefactory.shape.Triangle;

public class ShapeFactory {

    public static Shape createShape(String type){
        if(type.equals("circle"))
            return new Circle();
        else if(type.equals("rectangle"))
            return new Rectangle();
        else if(type.equals("triangle"))
            return new Triangle();
        else
            throw new UnsupportedShapeException("There is no shape of "+type);
    }
}

class UnsupportedShapeException extends RuntimeException{
    public UnsupportedShapeException(String desc){
        super(desc);
    }
}
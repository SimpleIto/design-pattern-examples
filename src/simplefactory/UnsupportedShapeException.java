package simplefactory;

public class UnsupportedShapeException extends RuntimeException{
    public UnsupportedShapeException(String desc){
        super(desc);
    }
}

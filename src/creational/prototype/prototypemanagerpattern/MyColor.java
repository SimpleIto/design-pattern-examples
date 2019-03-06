package creational.prototype.prototypemanagerpattern;

public abstract class MyColor implements Cloneable{
    public abstract void display();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

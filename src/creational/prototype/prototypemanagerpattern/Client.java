package creational.prototype.prototypemanagerpattern;

/**
 * 带原型管理器的原型模式
 */
public class Client {
    public static void main(String[] agrs) throws CloneNotSupportedException {
        MyColorPrototypeManager prototypeManager = new MyColorPrototypeManager();
        prototypeManager.getColor("red").display();
    }

}

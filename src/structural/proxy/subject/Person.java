package structural.proxy.subject;

public class Person implements Animal {
    @Override
    public void breath() {
        System.out.println("人类开始了呼吸...");
    }

    @Override
    public void eat() {
        System.out.println("人类开始了思考...");
    }
}

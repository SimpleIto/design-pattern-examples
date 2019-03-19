package structural.proxy.staticproxy;

import structural.proxy.subject.Animal;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalProxy implements Animal {
    private Animal animal;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public AnimalProxy(Animal animal){
        this.animal = animal;
    }

    @Override
    public void breath() {
        System.out.println("(Static) Invoke Time："+dateFormat.format(new Date(System.currentTimeMillis())).toString());
        animal.breath();
    }

    @Override
    public void eat() {
        System.out.println("(Static) Invoke Time："+dateFormat.format(new Date(System.currentTimeMillis())).toString());
        animal.eat();
    }
}

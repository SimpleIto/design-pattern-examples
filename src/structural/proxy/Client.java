package structural.proxy;

import structural.proxy.dynamicproxy.LogHandler;
import structural.proxy.staticproxy.AnimalProxy;
import structural.proxy.subject.Animal;
import structural.proxy.subject.Person;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args){
        //动态代理
        //优点：从命名上都可以看出动态代理的优点，不用为每个接口都定义一个代理类（这里没体现，因为只写了一个接口）
        // 而是可以以面向功能的形式直接定义一个日志处理类即可
        LogHandler log = new LogHandler(new Person());
        Animal animal = (Animal) Proxy.newProxyInstance(Animal.class.getClassLoader(),new Class[]{Animal.class},log);
        animal.breath();
        animal.eat();
        System.out.println("--------------------------------");

        //静态代理
        Animal animal2 = new AnimalProxy(new Person());
        animal2.breath();
        animal2.eat();

/* Console:
        Invoke Time：2019-03-19 20:46:52
        人类开始了呼吸...
        Invoke Time：2019-03-19 20:46:52
        人类开始了思考...
        --------------------------------
        (Static) Invoke Time：2019-03-19 20:46:52
        人类开始了呼吸...
        (Static) Invoke Time：2019-03-19 20:46:52
        人类开始了思考...
*/
    }
}

package structural.decorator;

public class Client {
    public static void main(String[] args){
        Phone phone = new SimplePhone();
        phone.noticeCall();
        System.out.println("------------------------");

        phone = new ComplexPhone(new JarPhone(phone));  // 或者添加一个构造方法再利用instance of，对客户来说也可以从SimplePhone直接装饰到ComplexPhone
        phone.noticeCall();
    }
}

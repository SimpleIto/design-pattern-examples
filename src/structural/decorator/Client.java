package structural.decorator;

/**
 * 透明装饰模式
 */
public class Client {
    public static void main(String[] args){
        Phone phone = new SimplePhone();
        phone.noticeCall();
        System.out.println("------------------------");

        phone = new JarPhone(phone);
        phone.noticeCall();
    }
}

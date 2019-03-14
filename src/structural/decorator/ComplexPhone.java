package structural.decorator;

public class ComplexPhone implements Phone {
    private JarPhone jarPhone;

    public ComplexPhone(JarPhone jarPhone){
        this.jarPhone = jarPhone;
    }

    @Override
    public void noticeCall() {
        jarPhone.noticeCall();
        System.out.println("（这是发光提醒）");
    }
}

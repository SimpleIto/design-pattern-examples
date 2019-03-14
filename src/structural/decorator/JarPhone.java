package structural.decorator;

public class JarPhone implements Phone{
    private Phone phone;
    public JarPhone(Phone phone){
        this.phone = phone;
    }

    @Override
    public void noticeCall() {
        phone.noticeCall();
        System.out.println("（这是震动提醒）");
    }

}

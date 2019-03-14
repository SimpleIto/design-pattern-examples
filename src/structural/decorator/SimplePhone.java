package structural.decorator;

public class SimplePhone implements Phone {
    @Override
    public void noticeCall() {
        System.out.println("（来电声音提醒）");
    }
}

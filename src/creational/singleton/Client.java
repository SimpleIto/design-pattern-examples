package creational.singleton;

public class Client {
    public static void main(String[] args){
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(instance == LazySingleton.getInstance());    // true
    }
}

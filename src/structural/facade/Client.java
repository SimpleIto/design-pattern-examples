package structural.facade;

/**
 * 外观模式，提供一个类整合各接口条用，方便客户使用
 */
public class Client {
    public static void main(String[] args){
        EncryptFacade.fileEncrypt("src.txt","target.txt");
    }
}

package structural.facade;

public class FileReader {
    public static String read(String fileName){
        System.out.println("读取"+fileName+"内容");
        return "content";
    }
}

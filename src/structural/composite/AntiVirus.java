package structural.composite;

import structural.composite.component.AbstractFile;
import structural.composite.composite.Folder;
import structural.composite.leaf.ImageFile;
import structural.composite.leaf.TextFile;
import structural.composite.leaf.VideoFile;

public class AntiVirus {
    public static void main(String[] args){

        AbstractFile file = new TextFile("outside.txt");
        Folder folder = new Folder("MuLu",
                new ImageFile("11.jpg"),new VideoFile("cry.mp4"),new TextFile("word.txt"));

        //客户可以一致对待叶子构件和容器构件
        antivirus(file);
        antivirus(folder);
    }

    public static void antivirus(AbstractFile file) {
        for (String content : file.getContent())
            System.out.println("正在查杀：" + content);
    }
}

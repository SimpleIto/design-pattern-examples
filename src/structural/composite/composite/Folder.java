package structural.composite.composite;

import structural.composite.component.AbstractFile;

import java.util.ArrayList;

/**
 * 安全组合模式，因为含有额外的addFile方法
 * 但因此客户无法透明一致对待叶子与容器构件，两者含有不同的方法
 */
public class Folder extends AbstractFile {
    private ArrayList<AbstractFile> fileList = new ArrayList<>();

    public Folder(String filename,AbstractFile... files) {
        super(filename);
        for(AbstractFile file:files)
            fileList.add(file);
    }

    public void addFile(AbstractFile file){
        fileList.add(file);
    }
    @Override
    public String[] getContent() {
        ArrayList<String> contents = new ArrayList<>();
        for(AbstractFile file:fileList)
            for(String content:file.getContent())
                contents.add(content);

        String[] result = new String[contents.size()];
        for(int i=0;i<contents.size();i++)
            result[i] = contents.get(i);
        return result;
    }
}

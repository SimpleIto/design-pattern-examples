package structural.composite.component;

public abstract class AbstractFile {
    protected String filename;

    public AbstractFile(){}

    public AbstractFile(String filename){
        this.filename = filename;
    }

    public String[] getContent(){
        return new String[]{filename};
    }
}

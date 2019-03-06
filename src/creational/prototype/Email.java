package creational.prototype;

import java.io.*;

public class Email implements Cloneable,Serializable{
    private Attachment attachment;
    private String title;
    private int level;

    public Email(String title, int level) {
        this.attachment = new Attachment();
        this.title = title;
        this.level = level;
    }

    public void read(){
        System.out.println("Email:"+title+" "+level+" "+this);
    }
    // 通过输出输入，复制比特流的方式实现深克隆
    public Email deepClone() throws IOException, ClassNotFoundException {

        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bai);
        return (Email) ois.readObject();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Attachment getAttachment() {
        return attachment;
    }
    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

}

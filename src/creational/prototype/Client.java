package creational.prototype;

import java.io.IOException;

/**
 * 原型模式
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Email prototype = new Email("Hello",3);
        Email cloneObject = (Email)prototype.clone();

        System.out.println("after clone()，is same object?");
        prototype.read();
        cloneObject.read();
        System.out.println("Attachment(object):"+(prototype.getAttachment() == cloneObject.getAttachment()));
        System.out.println("Title(String)："+(prototype.getTitle()==cloneObject.getTitle())+"\n");

        Email deepCloneObject = prototype.deepClone();
        System.out.println("after deepClone()，is same object?");
        prototype.read();
        deepCloneObject.read();
        System.out.println("Attachment(object):"+(prototype.getAttachment() == deepCloneObject.getAttachment()));
        System.out.println("Title(String)："+(prototype.getTitle()==deepCloneObject.getTitle()));
    }
}

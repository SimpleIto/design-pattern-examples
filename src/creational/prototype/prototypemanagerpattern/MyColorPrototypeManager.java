package creational.prototype.prototypemanagerpattern;

import java.util.Hashtable;

public class MyColorPrototypeManager {
    private Hashtable<String,MyColor> ht = new Hashtable();

    public MyColorPrototypeManager(){
        ht.put("red",new Red());
        ht.put("blue",new Blue());
    }

    public MyColor getColor(String key) throws CloneNotSupportedException {
        return (MyColor) ht.get(key).clone();
    }
}

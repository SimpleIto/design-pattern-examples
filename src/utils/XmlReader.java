package utils;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class XmlReader{

    private Document document;
    private Element root;

    public XmlReader(String path) throws DocumentException {
        document = new SAXReader().read(path);
        root = document.getRootElement();
    }

    public List<Element> getElements(String name){
        return root.elements(name);
    }

    public String getAttribute(Element element, String name) {
        Attribute attr = element.attribute(name);
        if(attr==null)
            return null;
        else
            return attr.getValue();
    }
    public String getFirstElementValue(String name){
        return root.element(name).getStringValue();
    }
    public List<Element> getChildElements(Element element,String name){
        return element.elements(name);
    }
    public Element getElementById(String id) {
        for(Element e:root.elements()) {
            if(getAttribute(e, "id").equals(id))
                return e;
        }
        return null;
    }
}

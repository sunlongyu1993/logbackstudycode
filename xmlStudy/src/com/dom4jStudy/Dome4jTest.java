package com.dom4jStudy;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

/**
 * @author 孙珑瑜
 * @version 220307
 */
public class Dome4jTest {
    @Test
    public void  MainTest() throws Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(Dome4jTest.class.getResourceAsStream("/Contacts2.xml"));
        List<Node> nodes = document.selectNodes("/contactList/contact/name");
        for (Node node : nodes) {
           Element nameele= (Element)node;
            System.out.println(nameele.getTextTrim());
        }
    }
}

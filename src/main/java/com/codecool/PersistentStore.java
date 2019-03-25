package com.codecool;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersistentStore extends Store {
    
    protected List<Product> loadProducts() throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document = docBuilder.parse(getClass().getResource("/products.xml").toExternalForm());
        document.getDocumentElement().normalize();
        NodeList productList = document.getElementsByTagName("Products");
        
        List<Product> products = new ArrayList<>();
        
        for (int i = 0; i < productList.getLength(); i++) {
            Node current = productList.item(i);
    
            if (current.getNodeType() == current.ELEMENT_NODE){
                Element cseszdMeg = (Element) current;
                String type = cseszdMeg.getAttribute("type");
                String name = cseszdMeg.getAttribute("name");
                int price = Integer.parseInt(cseszdMeg.getAttribute("price"));
                int size = Integer.parseInt(cseszdMeg.getAttribute("size"));
                products.add(createProduct(type, name, price, size));
            }
        }
        return products;
    }
}

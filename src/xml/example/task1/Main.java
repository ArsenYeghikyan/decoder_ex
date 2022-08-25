package xml.example.task1;

import org.w3c.dom.Document;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import javax.xml.parsers.DocumentBuilderFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        Root root = new Root();


        Node rootNode = buildDocument().getFirstChild();


        NodeList rootChild = rootNode.getChildNodes();

        String mainName = null;
        Node nodePeople = null;

        for (int i = 0; i < rootChild.getLength(); i++) {

            if (rootChild.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }

            switch (rootChild.item(i).getNodeName()) {
                case "name": {
                    mainName = rootChild.item(i).getTextContent();
                    System.out.println("mainName: " + mainName);
                    break;
                }
                case "people": {
                    nodePeople = rootChild.item(i);
                    System.out.println("nodePeople: " + nodePeople);
                    break;
                }
            }


        }



        if (nodePeople == null) {

            return;
        }
        List<People> peopleList = new ArrayList<>();
        NodeList peopleChildes = nodePeople.getChildNodes();

        for (int i = 0; i < peopleChildes.getLength(); i++) {

            if (peopleChildes.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            if (!peopleChildes.item(i).getNodeName().equals("element")) {
                continue;
            }

            String name = "";
            int age = 0;

            NodeList elementChildes = peopleChildes.item(i).getChildNodes();
            for (int j = 0; j < elementChildes.getLength(); j++) {

                if (elementChildes.item(j).getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }

                switch (elementChildes.item(j).getNodeName()) {

                    case "name": {
name = elementChildes.item(j).getTextContent();
break;

                    }
                    case "age": {
age = Integer.valueOf(elementChildes.item(j).getTextContent());
break;

                    }


                }


            }
            People people = new People(age,name);
            peopleList.add(people);

        }
        root.setName(mainName);
        root.setPeople(peopleList);
        System.out.println("Root "+root);
    }

    public static Document buildDocument() throws Exception {
        File file = new File("C:\\Users\\User\\Desktop\\decoder_ex\\src\\xml\\example\\task1\\task1.xml");

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc = null;

        doc = dbf.newDocumentBuilder().parse(file);

        return doc;
    }
}

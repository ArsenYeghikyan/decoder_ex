package xml.example.dom_parser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {


        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        DocumentBuilder db = dbf.newDocumentBuilder();

        Document doc = db.newDocument();


        Element rootElement = doc.createElement("catalog");

        doc.appendChild(rootElement);

        Element book1 = doc.createElement("book");
        rootElement.appendChild(book1);
        Element author = doc.createElement("author");
        author.setTextContent("Bruce Eckel");
        book1.appendChild(author);
        Element title1 = doc.createElement("title");
        title1.setTextContent("Thinking in java 4th Edition");
        book1.appendChild(title1);
        Element price = doc.createElement("price");
        price.setTextContent("30");
        price.setAttribute("currency","$");
        book1.appendChild(price);




        Element book2 = doc.createElement("book");
        rootElement.appendChild(book2);
        Element author2 = doc.createElement("author");
        author2.setTextContent("Bob Martin");
        book2.appendChild(author2);
        Element title2 = doc.createElement("title");
        title2.setTextContent("Clean Code");
        book2.appendChild(title2);
        Element price2 = doc.createElement("price");
        price2.setTextContent("20");
        price2.setAttribute("currency","$");
        book2.appendChild(price2);


        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = tf.newTransformer();

        DOMSource source = new DOMSource(doc);
        StreamResult sr = new StreamResult(new File("C:\\Users\\Best\\IdeaProjects\\decoder_ex\\src\\xml\\example\\dom_parser\\my_build.xml"));

        t.transform(source, sr);

    }
}

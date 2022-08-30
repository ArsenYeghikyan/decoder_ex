package xml.example.SAXParser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
final String fileName = "C:\\Users\\Best\\IdeaProjects\\decoder_ex\\src\\xml\\example\\SAXParser\\phonebook.xml";


        SAXParserFactory  spFactory = SAXParserFactory.newInstance();

        SAXParser parser = spFactory.newSAXParser();

        DefaultHandler handler = new DefaultHandler(){
            boolean name = false;

            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
               if (qName.equalsIgnoreCase("name")){
                   name = true;
               }
            }

            @Override
            public void characters(char[] ch, int start, int length) throws SAXException {
                if (name){

                    System.out.println("Name: "+new String(ch, start, length));

                    name=false;
                }
            }
        };



parser.parse(fileName,handler);



    }


}

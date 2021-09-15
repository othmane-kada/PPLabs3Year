package lab1;

import lab1.classes.Group;
import lab1.classes.Student;
import lab1.classes.Subject;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.Scanner;

/**
 * @author Aydar Rafikov
 */
public class Main {

    private static final String DIRECTORY = "Labs/Lab1/";

    public static void main(String[] args) throws IOException, JAXBException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input name on input xml file");
        String inputFile = scan.nextLine();
        FileReader reader = new FileReader(DIRECTORY+inputFile);
        System.out.println("Input name of output xml file");
        String outputFile = scan.nextLine();

        JAXBContext context = JAXBContext.newInstance(Group.class, Subject.class, Student.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Group group = (Group)unmarshaller.unmarshal(reader);

        fixXMLClass(group);

        FileWriter writer = new FileWriter(DIRECTORY+outputFile);
        context = JAXBContext.newInstance(Group.class, Subject.class, Student.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(group, writer);
    }

    public static void fixXMLClass(Group group) {
        for (Student student : group.student) {
            int sumMarks = 0;
            int countMarks = 0;
            for (Subject subject : student.subject) {
                sumMarks += subject.mark;
                countMarks += 1;
            }
            if (countMarks != 0) {
                student.average = (double) sumMarks / countMarks;
            }
        }
    }
}

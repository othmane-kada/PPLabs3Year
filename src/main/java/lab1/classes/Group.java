package lab1.classes;

import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aydar Rafikov
 */
@XmlType(name = "group")
@XmlRootElement
@NoArgsConstructor
public class Group {
    public List<Student> student = new ArrayList<>();
}

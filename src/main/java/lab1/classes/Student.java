package lab1.classes;


import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aydar Rafikov
 */
@XmlType(name = "student")
@NoArgsConstructor
public class Student {
    public String firstname;
    public String lastname;
    public String groupnumber;
    public List<Subject> subject = new ArrayList<>();
    public Double average;
}

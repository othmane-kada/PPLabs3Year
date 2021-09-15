package lab1.classes;


import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlType;

/**
 * @author Aydar Rafikov
 */
@XmlType(name = "subject")
@NoArgsConstructor
public class Subject {
    public String title;
    public int mark;
}

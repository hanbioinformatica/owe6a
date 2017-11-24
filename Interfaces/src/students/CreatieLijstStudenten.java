package students;


import java.util.*;

public class CreatieLijstStudenten {
    
    public static List<Student> getStudents() {
        
        List<Student> lijst = new ArrayList<>();
        
        lijst.add(new Student(5, "Roel", 18));
        
        
        return lijst;
    }
}
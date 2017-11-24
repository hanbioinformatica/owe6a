// Voorbeeld 0804  Student en Comparator

import java.util.*;

public class Vb0804 {

    public static void main(String args[]) {
        SortedMap<Student, String> map = new TreeMap<Student, String>(new VergelijkNaam());

        // Maak vier studenten
        Student s1 = new Student("Natasha", 2345);
        Student s2 = new Student("Ana", 3456);
        Student s3 = new Student("Zoe", 1234);
        Student s4 = new Student("Natasha", 4567);

        // Stop ze met hun studie in de map
        map.put(s1, "Frans");
        map.put(s2, "Informatica");
        map.put(s3, "Engels");
        map.put(s4, "Engels");

        print(map);
    }

    public static <K, V> void print(Map<K, V> map) {
        Set<Map.Entry<K, V>> set = map.entrySet();
        for (Map.Entry e : set) {
            System.out.println(e.getKey() + ", studie "
                    + e.getValue());
        }
    }
}

class VergelijkNaam implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return s1.getNaam().compareTo(s2.getNaam());
    }
}

/*
class VergelijkNaam implements Comparator<Student> {
  public int compare( Student s1, Student s2 ) {
    int result = s1.getNaam().compareTo( s2.getNaam() );
    if( result == 0 )
      result = s1.compareTo( s2 ); // natuurlijke ordening
    return result;
  }
}
*/

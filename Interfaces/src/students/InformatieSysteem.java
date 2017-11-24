package students;

import java.util.*;

public class InformatieSysteem {

    public static void main(String[] args) {
        List coll = CreatieLijstStudenten.getStudents();  
      
        printList(coll);
        Collections.sort(coll,Collections.reverseOrder()); // sort method
        System.out.println("Na sortering");
        printList(coll);




    }

    private static void printList(List<Student> list) {
        System.out.println("StudentId\tName\tAge");
        for (Student e : list) {
            System.out.println(e.getStudentId() + "\t" + e.getName() + "\t" + e.getAge());
        }
        System.out.println("StudentId\tName\tAge");
        for (Student e : list) {
            System.out.println(e.getStudentId() + "\t" + e.getName() + "\t" + e.getAge());
        }
    }


    static void printListAuto(List<Auto> list) {
        System.out.println("Merk\tType\tJaar\tPrijs");
        for (Auto a : list) {
            System.out.println(a.merk + "\t" + a.type + "\t" + a.jaartal + "\t" + a.prijs);
        }
    }
}


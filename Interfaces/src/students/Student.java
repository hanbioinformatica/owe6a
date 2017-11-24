package students;

public class Student implements Comparable<Student> {

    private int studentId;
    private String naam;
    private int leeftijd;

    public int compareTo(Student o) {
        if (this.studentId < o.studentId) {
            return -1;
        } else {
            return 1;
        }
    }

    public Student(int id, String name, int leeftijd) {
        setEmpId(id);
        setName(name);
        setAge(leeftijd);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setEmpId(int empId) {
        this.studentId = empId;
    }

    public String getName() {
        return naam;
    }

    public void setName(String name) {
        this.naam = name;
    }

    public int getAge() {
        return leeftijd;
    }

    public void setAge(int age) {
        this.leeftijd = age;
    }
}

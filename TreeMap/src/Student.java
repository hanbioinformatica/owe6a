
public class Student implements Comparable<Student> {
  private String naam;
  private int studnr;
  
  public Student( String naam, int studnr ) {
    this.naam = naam;
    this.studnr = studnr;
  }

  public String getNaam() {
    return naam;
  }

  public String toString() {
    return String.format( "%10s, studnr%5d", naam, studnr );
  }
  
  // Implementeer Comparable interface
  public int compareTo( Student andere ) {
    return this.studnr - andere.studnr;
  }
  
  // Herdefinieer equals()
  public boolean equals( Object o ) {
    Student andere = (Student) o;
    return this.studnr == andere.studnr;
  }
}

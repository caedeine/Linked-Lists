package p1;

public class Link {
    private Student student;
    private Link next;


    //Overloaded constructors
    public Link(String name, double gpa) {
        super();
        this.student = new Student (name, gpa);
        this.next = null;
    }

    public Link(Student student) {
        super();
        this.student = student;
        this.next = null;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Link{" +
                "student=" + student +
                '}';
    }
    public void displayLink(){
        System.out.println(student);
    }
}

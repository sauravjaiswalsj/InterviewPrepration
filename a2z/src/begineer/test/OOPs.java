package begineer.test;
class Person{
    private String name;
    private String email;
    private int id;

    public Person(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person() {

    }

    public void display(){
        System.out.println("Person.display");
    }
}
class Students extends Person{
    private double gpa;
    public Students(){}
    public Students(double gpa) {
        super();
        this.gpa = gpa;
    }
    public void display(){
        super.display();
        System.out.println("Student.display");
    }
}
class UnderGraduate extends Students{
    private int year;

    public UnderGraduate(int year){
        super();
        this.year = year;
    }

    public void display() {
        super.display();
        System.out.println("UnderGraduate.display");
    }
}
public class OOPs {
    public static void main(String[] args) {
        UnderGraduate s = new UnderGraduate(3);
        s.setName("Saurav");
        System.out.println(s.getName());
        s.display();

        String one = "hello";
        String two = "hello";

        if (one.equals(two))
            System.out.println("h");

        System.out.println("@" + Integer.toHexString(System.identityHashCode(one)) );
        System.out.println("@" + Integer.toHexString(System.identityHashCode(two)) );

        Object o = one;
        Object b = two;
        System.out.println("@" + Integer.toHexString(System.identityHashCode(o)) );
        System.out.println("@" + Integer.toHexString(System.identityHashCode(b)) );

        if (o.equals(b))
            System.out.println("hm");

        System.out.println(k(6,8));
        System.out.println(k(1,3));
        System.out.println(k(6,6));
        System.out.println(k(2,0));

    }
    private static int k (int a, int b) {
        if (a < b) {
            if (b > 4) {
                return 0 ;
            }
            else {
                return 1;
            }
        }
        else {
            if (a > 4) {
                return 2;
            }
            else {
                return 3;
            }
        }
    }
}

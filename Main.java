
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is "+ age;

    }


}
class PrimarySchoolStudent extends Student{
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}
public class Main {
    
    public static void main(String[] args) {
        Student student1 = new Student("Mark", 21);
        Student student2 = new Student("Jane", 29);
        Student student3 = new Student("Peter", 30);

        //System.out.println(student1);
        //System.out.println(student2);
        //System.out.println(student3);

        //Java.lang.object
        //a class created in java extends a special java class named Object
        //the class is in java.lang.package

        //System.out.println(student1.equals(student2));

        //Without toString the following hashCodes are
        //printed
        //Student@1b28cdfa
        //Student@eed1f14
        //Student@7229724f
        //Class name and a hexadecimal number

        PrimarySchoolStudent student = new PrimarySchoolStudent("Janeth", 16, "Paul");

        System.out.println(student);

    }
}

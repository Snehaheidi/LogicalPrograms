import java.util.Scanner;

public class Student
{
    private String name;
    private String age;
    private String sex;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public Student() {

        Scanner n = new Scanner(System.in);

        System.out.print("First Name: ");

        this.setName(n.next());


        System.out.print("Age: ");

        this.setAge(n.next());


        System.out.print("Gender: ");

        this.setSex(n.next());

    }
}

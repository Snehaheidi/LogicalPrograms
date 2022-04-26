import java.util.Collections;
import java.util.Comparator;

public class StudentInfo
{
    public static  void main(String[] args) {
        Student[] studentArray = new Student[3];
        //Add Students to Array
        for (int i=0; i<3; i++) {
            Student s = new Student();
            studentArray[i] = s;
        }
        //Display Students from Array
        for(int i=0; i<3; i++)
        {
            Student s = studentArray[i];
            System.out.println(s.getName() +" ," + s.getAge() +","+s.getSex());
        }
    }
}

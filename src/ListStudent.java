import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListStudent
{
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        //Add Students to List
        Student s1 = new Student();
        studentList.add(s1);
        Student s2 = new Student();
        studentList.add(s2);
        Student s3 = new Student();
        studentList.add(s3);
        //Display Students from List
        System.out.println("    Student List  \n");
        for (int i = 0; i < 3; i++)
        {
            Student s = studentList.get(i);
            System.out.println(s.getName() +" , " + s.getAge() +" , "+s.getSex());
        }
        System.out.println("*********************************************************");
       Comparator<Student> compare = Comparator.comparing(Student::getAge);
       Collections.sort(studentList,compare);
        System.out.println("    Student Sorted List\n");
        for(Student st:studentList)
        {
            System.out.println(st.getName()+" "+st.getAge()+" "+st.getSex());
        }
    }
}
//Output:
/*
First Name: sneha
Age: 20
Gender: female
First Name: chitra
Age: 19
Gender: female
First Name: varnika
Age: 18
Gender: female
    Student List

sneha , 20 , female
chitra , 19 , female
varnika , 18 , female
*********************************************************
    Student Sorted List

varnika 18 female
chitra 19 female
sneha 20 female
 */

import java.util.*;
import java.lang.reflect.*;
    class Name{
        private int age=20;
        public Name() {

        }
        public void dsplay() {
            System.out.println("Hello Narendran ");
        }
        public String dateofbirth(String s) {
            System.out.print("Birth date is : ");
            return s;
        }
        public int getage() {
            return age;
        }
    }
    public class Reflection {

        public static void main(String[] args) throws Exception{
            Scanner in=new Scanner(System.in);
            Name n=new Name();
            Class cls=n.getClass();
            Constructor c=cls.getConstructor();
            System.out.println(cls.getName());
            System.out.println(c.getName());
            Method[] m=cls.getMethods();
            for (Method s:m) {
                System.out.println(s.getName());
            }
            Method che=cls.getDeclaredMethod("dateofbirth", String.class);
            System.out.println(che.invoke(n, "05-04-1999"));
            System.out.println(n.getage());
            Field f=cls.getDeclaredField("age");
            f.setAccessible(true);
            f.set(n,in.nextInt());
            System.out.println(n.getage());
        }
    }

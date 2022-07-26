
package Assignment_5;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationTest {
    public static void main(String[] args) {

        try{
            Student s1 = new Student("Ram","05/07/2002","Indore","MP","India",452018);
            Student s2 = new Student("Rohan","28/09/2002","Indore","MP","India",452018);
            Student s3 = new Student("Krishna","12/12/2002","Indore","MP","India",452018);
            
            FileOutputStream fout = new FileOutputStream("C:\\Core_Java_Assignments\\Assignment_5\\Output2.ser");
            try (ObjectOutputStream out = new ObjectOutputStream(fout)) 
            {
                ArrayList<Student> lis = new ArrayList<>();
                    lis.add(s1);
                    lis.add(s2);
                    lis.add(s3);

                for(int i=0;i<lis.size();i++){
                    out.writeObject(lis.get(i));
                }
            }
        } catch (Exception e) {
            System.out.println("Some Error occured....!");
            e.printStackTrace();
        }

    }
}


/*package Assignment_5;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class SerializationTest {
    public static void main(String[] args) {
        Student one = new Student("Ram","05/07/2002","Indore","MP",452018,"India");
        Student two = new Student("Rohan","28/09/2002","Indore","MP",452018,"India");
        Student three = new Student("Karan","16/10/2002","Indore","MP",452018,"India");
        Student four = new Student("Krishna","12/12/2002","Indore","MP",452018,"India");

        ArrayList<Student> lis = new ArrayList<>();
        lis.add(one);
        lis.add(two);
        lis.add(three);
        lis.add(four);

        try {
            FileOutputStream file = new FileOutputStream("C:\\Core_JavaAssignments\\Assignment_5\\output2.ser");
            ObjectOutputStream ob = new ObjectOutputStream(file);

            for(int i=0;i<lis.size();i++){
                ob.writeObject(lis.get(i));
            }

        }catch(IOException e){
            System.out.println("Error!!");
            e.printStackTrace();
        }
    }
} */
    


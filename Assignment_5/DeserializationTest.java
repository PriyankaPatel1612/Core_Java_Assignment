package Assignment_5;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializationTest{
    public static void main(String[] args){
        
        ArrayList<Student> info = new ArrayList<>();
try{
            ObjectInputStream ob = new ObjectInputStream(new FileInputStream("C:\\Core_Java_Assignments\\Assignment_5\\Output1.ser"));
          
            for(int i=0;i<3;i++){
                Student stud = (Student)ob.readObject();
                info.add(stud);
                System.out.println(stud.FirstName+"\n"+stud.DateOfBirth);
                System.out.println(stud.Address);
            }
            
            ob.close();
        }catch(Exception e){
            e.printStackTrace();
        }
}
}

/*package Assignment_5;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class DeserializationTest {
    public static void main(String[] args) {
        ArrayList<Object> lis = new ArrayList<>();

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Assignment_5\\Output1.ser"));
            for(int i=0;i<lis.size();i++){
                Student ob = (Student)in.readObject();
                System.out.println(ob);
                lis.add(ob);
            }
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Error!!");
            e.printStackTrace();
        }
    }
} */
    

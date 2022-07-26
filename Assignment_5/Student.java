package Assignment_5;

import java.io.Serializable;

public class Student implements Serializable {
    public String FirstName;
    public String DateOfBirth;
    public Address Address;

    Student(String N, String string, String a, String b, String c, int d ){
        this.FirstName = N;
        this.DateOfBirth = string;

        Address = new Address(a ,b ,c ,d);
    }
}
/*package Assignment_5;


    public class Student implements java.io.Serializable
     {
        String firstName;
        String dateOfBirth;
        Address address = null;
    
        Student(String n,String d,String ci,String st,int pi,String co){
            firstName = n;
            dateOfBirth = d;
            address = new Address(ci,st,pi,co);
        }
    }
    */


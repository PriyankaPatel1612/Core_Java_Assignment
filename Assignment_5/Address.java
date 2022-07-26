package Assignment_5;

import java.io.Serializable;

public class Address implements Serializable{
    public String city;
    public String state;
    public String country;
    public Integer pincode;

    public Address(String a, String b, String c, int d) {
        this.city = a;
        this.state = b;
        this.country = c;
        this.pincode = d;
    }
    
    
}

/* 
package Assignment_5;

    public class Address implements java.io.Serializable {
        String city;
        String state;
        int pinCode;
        String country;
    
        Address(String ci,String st,int pi,String co){
            city = ci;
            state = st;
            pinCode = pi;
            country = co;
        }
    } 
    */


package Assignment_2;

import java.util.Scanner;
    public class Circle
    {
        float circle()
        {
            
            Scanner scan = new Scanner(System.in);
            float pie = 3.14f;
            System.out.println("You choosed circle " );
            System.out.print("Enter the radius : ");
            float radius = scan.nextFloat();
            float area = pie * radius * radius;
            float circumference = 2*pie*radius;
            System.out.println("Area of circle is : " + area);
            System.out.println("Circumference of circle : "+ circumference);
            return area;
            
        }
    }
    


package Assignment_2;

import java.util.Scanner;

public class Cone 
    {
        float cone()
        {
            float pie = 3.14f;
            Scanner scan = new Scanner(System.in);
            System.out.println("You choosed cone ");
            System.out.print("Enter the radius of cone : ");
            float radius = scan.nextFloat();
            System.out.print("Enter the length of the cone : " );
            float length = scan.nextFloat();
            float area = pie*radius*(radius+length);
            float curvedsurfacearea = pie*radius*length;
            float volume = 4/3*pie*radius*radius*radius;
            System.out.println("Total surface area of cone is : " + area);
            System.out.println("Curved surface area of cone is : " + curvedsurfacearea);
            System.out.println("Volume of cone is : " + volume );
            return area;
            
        }
    }


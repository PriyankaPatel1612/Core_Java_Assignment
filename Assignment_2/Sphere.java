package Assignment_2;

import java.util.Scanner;

public class Sphere {

    float sphere()
    {
        float pie = 3.14f;
        Scanner scan = new Scanner(System.in);
        System.out.println("You choosed sphere ");
        System.out.print("Enter the radius of sphere : ");
        float radius = scan.nextFloat();
        float area = 4*pie*radius*radius;
        float volume = 4/3*pie*radius*radius*radius;
        System.out.println("Surface area of sphere is : " + area);
        System.out.println("Volume of sphere is : " + volume);
        return area;
    }
    
}

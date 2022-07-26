package Assignment_2;

import java.util.Scanner;

public class Cylinder {

    float cylinder()
        {
            float pie = 3.14f;
            Scanner scan = new Scanner(System.in);
            System.out.println("You choosed cylinder ");
            float height = scan.nextFloat();
            System.out.print("Enter the radius of the cylinder");
            float radius = scan.nextFloat();
            float area = 2*pie*radius*(radius+height);
            float volume = pie*radius*radius*height;
            float curvedsurfacearea = 2*pie*radius*height;
            System.out.println("Total surface area of cylinder is : " + area);
            System.out.println("Volume of cylinder is : " + volume);
            System.out.println("Curved surface area of cylinder is : " + curvedsurfacearea );
            return area;
        }
}

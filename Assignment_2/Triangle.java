package Assignment_2;

import java.util.Scanner;

public class Triangle 
    {
        float triangle()
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("You choosed triangle ");
            System.out.print("Enter the breadth of triangle");
            float breadth = scan.nextFloat();
            System.out.print("Enter the height of triangle");
            float height = scan.nextFloat();
            float area = 1/2*breadth*height;
            System.out.println("Area of triangle is : " + area);
            return area;
        }
    
}

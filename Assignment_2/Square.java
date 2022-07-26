package Assignment_2;

import java.util.Scanner;

public class Square {
    
    float square()
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("You choosed square ");
            System.out.print("Enter the side of square a : ");
            float a = scan.nextFloat();
            float area = a*a;
            float perimeter = 4*a;
            System.out.println("Area of square is : " + area);
            System.out.println("Perimeter of aquare is : " + perimeter);
            return area;
        }
}

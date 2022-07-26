package Assignment_2;

import java.util.Scanner;
public class Rectangle {

    float rectangle()
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("You choosed rectangle " );
            System.out.print("Enter the length of rectangle : ");
            float length = scan.nextFloat();
            System.out.print("Enter the breadth of rectangle : ");
            float breadth = scan.nextFloat();
            float area = length * breadth;
            float perimeter = 2 * (length + breadth);
            System.out.println("Area of rectangle is : " + area);
            System.out.println("Perimeter of rectangle is : " + perimeter);
            return area;
    
}
}

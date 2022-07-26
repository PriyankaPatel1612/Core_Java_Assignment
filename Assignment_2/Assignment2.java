package Assignment_2;

import java.util.Scanner;

public class Assignment2 {



        public static void main(String[] args) throws Exception
        {

            Scanner scan = new Scanner(System.in);
            boolean flag = true;
            

            System.out.println("Choose the number to find the area and perimeter of any shape : ");
            System.out.println("1. Circle ");
            System.out.println("2. Rectangle ");
            System.out.println("3. Triangle");
            System.out.println("4. Square ");
            System.out.println("5. Sphere ");
            System.out.println("6. Cylinder ");
            System.out.println("7. Cone ");
            System.out.println("8. Exit ");



            Circle obj1 = new Circle();
            Rectangle obj2 = new Rectangle();
            Triangle obj3 = new Triangle();
            Square obj4 = new Square();
            Sphere obj5 = new Sphere();
            Cylinder obj6 = new Cylinder();
            Cone obj7 = new Cone();



            while( flag == true) {
                System.out.print("Enter your Choice : ");
                int choose = scan.nextInt();

                switch (choose) {
                    
                    case 1:
                        obj1.circle();
                        break;

                    case 2:
                        obj2.rectangle(); 
                        break;

                    case 3:
                        obj3.triangle();
                        break;
                         
                    case 4:
                        obj4.square();
                        break;

                    case 5:
                        obj5.sphere();
                        break;

                    case 6:
                        obj6.cylinder();
                        break;

                    case 7:
                        obj7.cone();
                        break;

                    case 8:
                        System.out.println("thankyou !");
                        flag=false;
                        break;
                }
            }
        }
    }

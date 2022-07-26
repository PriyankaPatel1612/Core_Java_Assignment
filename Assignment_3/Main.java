package Assignment_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import Assignment_3.employee;




public class Main {

    public static String filename = "database.txt";
      
    //main method
    public static void main(String[] args) {
        
        createNewFileWithHeaders();
        displayServices();
        


    }

    public static void createNewFileWithHeaders(){
        File database = new File(filename);

        try {

            if( database.createNewFile()==true){

        try{
            FileWriter writer = new FileWriter(filename,true);
            writer.append("Name"+","+"Email Address"+","+"Age"+","+"DOB");
            writer.append("\n");
            writer.close();
            System.out.println("file created succesfully");

        }catch(IOException e){
            System.out.println(e);
        }
    }

    else {

          }

        } catch (IOException e) {
        e.printStackTrace();
      }
}


        public static void createAddNewemployee(Scanner input) {
            System.out.println("Enter employee's name :  ");
            String name = input.next();
            System.out.println("Enter your email address :  ");
            String email = input.next();
            System.out.println("Enter your age :  ");
            String age = input.next();
            System.out.println("Enter your date of birth :  ");
            String dob = input.next();

            employee Employee = new employee(name,email,age,dob);
            
            

        try{
            FileWriter writer = new FileWriter(filename,true);
            writer.append(Employee.getUserData());
            writer.append("\n");
            writer.close();
        
            System.out.println("employee added succesfully");

          }catch(IOException e){

            System.out.println(e);
        }
    } 


    public static void deleteDecordById(ArrayList<String> arrayList,Scanner input){

        System.out.println("enter any email to delete a record");
        String searchKey = input.next();
        String Line;

        try{
             BufferedReader reader = new BufferedReader(new FileReader(filename));
             while((Line = reader.readLine())!=null){
                if(Line.contains(searchKey)){
                    System.out.println(Line);
                    continue;
                }else{
                    arrayList.add(Line);
                }

            }reader.close();
        }catch(Exception e){

        } 
         try{
            FileWriter writer = new FileWriter(filename);
            for (int i = 0 ; i<arrayList.size() ; i++){
                writer.append(arrayList.get(i));
                writer.append("\n");


            }
            writer.close();
         }catch(Exception e){
            System.out.println(e);
         }finally{
            System.out.println("done");
         }
        }

        public static void updateRecord(ArrayList<String>arrayList,Scanner input){
            try{
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                System.out.println("Please enter any number to update");
                String searchkey=input.next();
                String Line;
                
                while((Line=reader.readLine())!=null){
                    if(Line.contains(searchkey)){
                        System.out.println("enter the text you want to change");
                        String oldValue= input.next();
                        System.out.println("enter the new text you to change");
                        String newValue = input.next();
                        arrayList.add(Line.replace(oldValue,newValue));

                    }else{
                        arrayList.add(Line);
                    }
                } reader.close();
            }catch(Exception e){
                System.out.println(e);
             }

             
                try{
                
                    FileWriter writer = new FileWriter(filename);
                    for (int i = 0 ; i<arrayList.size() ; i++){
                        writer.append(arrayList.get(i));
                        writer.append("\n");
                    }

                    writer.close();
             }
             
                catch(Exception e){
                    System.out.println(e);
                 }
             }

             public static void getEmployeeByID(Scanner input){
                try{
                    BufferedReader reader = new BufferedReader(new FileReader(filename));
                    System.out.println(("enter the number to get records"));
                    String searchKey=input.next();
                    String Line;
                    while((Line = reader.readLine())!=null){
                        if(Line.contains(searchKey)){
                            System.out.println(Line);
                        }
                    }reader.close();
                }catch (Exception e){
                    System.out.println(e);
                }
        
        
            }

                    public static void getAllEmployee(){
                        try{
                            BufferedReader reader =new BufferedReader(new FileReader(filename));

                            String Line;
                            while((Line=reader.readLine())!=null){
                                System.out.println(Line);
                            }
                         reader.close();
                        }catch(Exception e){
                            System.out.println(e);
                         }

                        }

                         
                    public static void displayServices(){
                        Scanner input = new Scanner(System.in).useDelimiter("\n");
                        while(true){
                            ArrayList<String> arrayList=new ArrayList<>();

                            System.out.println("---------------------------------------------------------");
                            System.out.println("Employee's Record");
                            System.out.println("---------------------------------------------------------");

                            System.out.println("1. Add new employee's records.");
                            System.out.println("2. Delete employee's records");
                            System.out.println("3. Update employee's records");
                            System.out.println("4. View employee's records");
                            System.out.println("5. Quit");

                            System.out.println("---------------------------------------------------------------");

                            System.out.println("select the number : ");
                            int x = input.nextInt();
                        if(x==5)
                        {
                            System.out.println("thank you!!!");
                            break;
                        }

                        else if (x==1)
                        {
                            createAddNewemployee(input);
                        }

                        else if(x==2)
                        {
                            deleteDecordById(arrayList, input);
                        }

                        else if(x==3)
                        {
                            updateRecord(arrayList, input);
                        }

                        else if(x==4)
                        {
                            getEmployeeByID(input);
                        }

                        else{
                            System.out.println("enter a valid number!");
                        }
                    
                       
                        
                    }
                    
                }
             }
        
            
        



    


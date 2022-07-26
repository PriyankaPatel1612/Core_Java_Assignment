package Assignment_4;

public class Assignment_4 {

   public static void main(String[] args)
   {
     
     AccountOverDrawDemo obj2 = new AccountOverDrawDemo();
     Thread one = new Thread(obj2);
        Thread two = new Thread(obj2);
        one.setName("Pratham");
        two.setName("Prachi");
        two.setPriority(10);
        one.start();
        two.start();
     
    }
}

    


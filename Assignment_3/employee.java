package Assignment_3;

public class employee {
  
        
        public String name;
        public String email;
        public  String age;
        public   String dob;
    
        public employee(String name , String email,String age, String dob)
        {
            this.name=name;
            this.email=email;
            this.age=age;
            this.dob=dob;
    
        }

        public  String getUserData()
        {

            return   name+"," + email +","  + ","+age+"," +dob;
        }
    
    
}

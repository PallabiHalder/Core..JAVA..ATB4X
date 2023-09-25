package Sept.sept17.Encapsulation;

public class ecap001 {  //runner class

    public static void main(String[] args) {

        VWOLoginClass  vwoLoginClass  = new VWOLoginClass("Lucky", "Hacker") ;


        vwoLoginClass.setPassword("Kuchi");

       String pass =  vwoLoginClass.getPassword(); // for security purpose can inactive getPassword().

        System.out.println(pass);



      //  checking at backend

        boolean  isLoggedIn = vwoLoginClass.isLoggedIn("admin","admin") ;

        System.out.println(isLoggedIn);




    }


}

  class VWOLoginClass {    // Creating a class is a encapsulation. Here we are binding variables
                           // and methods.


    // Attributes

      private String username ;

      private String password ;


      // generate getter and setter


      public String getUsername() {
          return username;
      }

      public void setUsername(String username) {
          this.username = username;
      }

     public String getPassword() {    // for security purpose can inactive getPassword().

        return password;

     }





      public void setPassword(String password) {
          this.password = password;
      }


      //methods / Constructor

      VWOLoginClass (String u, String p) {

          this.username = u;

          this.password = p;


      }


       boolean isLoggedIn (String username, String password){

       if(this.username.equals(username) && this.password.equals(password))

       {
           System.out.println("Yes you are valid user");

           return true ;

       }

       else{

           System.out.println("invalid user");

           return false ;
       }


       }





  }
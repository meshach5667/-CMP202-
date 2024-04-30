public class Userr {
 String name;
 String password;
 String login(){
    return "Logged in";

    
 }
    String Register(){
      if (name.equals("")|| password.equals("")) {
        return "can't be empty";

        
      }
      else{
        return "Success";
      }

    }
}

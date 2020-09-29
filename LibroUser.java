package biblioteca;

public class LibroUser {
	String userName;
    String password;
 
    int userID;
	int type;
  
    int getUserID(){
        return userID;
    }

    boolean login(String userName, String password){
    
			if((userName.equals(this.userName) && password.equals(this.password))){
				return true;
			}
			else{
				System.out.println("The username or password entered was not correct!");
				return false;
			}
		}


    boolean logout() {

        return true;
    }
}

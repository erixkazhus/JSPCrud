package swish.java.entity;



public class User {
    private int userid;
    private String username; 
    private String Email;
    
    public User(int userid, String username, String email) {
        this.userid = userid;
        this.username = username;
        this.Email = email;
    }
    
    public User(String username, String email) {        
        this.username = username;
        this.Email = email;
    }


   
   
    public int getUserid() {
		return userid;
	}



	public void setUserid(int userid) {
		this.userid = userid;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	// toString method
  //  @Override
   /// public String toString() {
    //    return "User{" +
   //             "userID=" + userid +
    //            ", username='" + username + '\'' +              
    //            ", email='" + Email + '\'' +               
    //            '}';
   //}
}

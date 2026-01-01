public class User{
    private String UserID;
    private String name;
    private String email;
    public User(String name, String email){
        this.name = name;
        this.email = email;
    }
    public String getName(){
        return this.name;
    }

    public String getEmailId(){
        return this.email;
    }
}
public class User{
    private String userID;
    private String name;
    private String email;
    private String mobno;
    public User(String userId, String name, String email, String mobno){
        this.userID = userId;
        this.name = name;
        this.email = email;
        this.mobno = mobno;
    }
    public String getName(){
        return this.name;
    }

    public String getEmailId(){
        return this.email;
    }

    public String getMobNo() { return this.mobno; }

    public String getUserID() { return this.userID; }
}
package Behavioral_Patterns.Observer;

public class User implements Subscriber{
    private int userId;
    private String userName;

    private String message;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }


    public String getUserName() {
        return userName;
    }


    public String getMessage() {
        return message;
    }


    @Override
    public String toString() {
        return STR."User{userId=\{userId}, userName='\{userName}\{'\''}\{'}'}";
    }

    @Override
    public void update(Publishers p,String data) {
        message=data;
    }
}

package exercise04;

public class User {
    //attribut
    private String userName;
    private String password;
    private String typeOfUser;

    //Konstruktor
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.typeOfUser = "normal";
    }
    //Metod
    public String getUserName() {
        return userName;
    }
    //Metod
    public String getPassword() {
        return password;
    }
    //Metod
    public void setUserName(String newUserName) {
        if(newUserName.length()>= 4) {
            this.userName = newUserName;
        }
    }
    //Metod
    public String getTypeOfUser() {
        return typeOfUser;
    }
    //Metod
    public void setTypeOfUser(String newTypeOfUser) {
        if (newTypeOfUser.equals("normal") || newTypeOfUser.equals("admin") || newTypeOfUser.equals("super")) {
            this.typeOfUser = newTypeOfUser;
        }
    }

    public void setPassword(String newPassword) {
        if ((newPassword.contains("!")
                || newPassword.contains("#")
                || newPassword.contains("$")
                || newPassword.contains("&"))
                && (newPassword.length() >= 7
                && newPassword.length() <= 20)){
            this.password = newPassword;
        }
    }


}

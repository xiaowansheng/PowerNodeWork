package day27;

public class UserService {
    private String username;
    private String password;

    public UserService() {
    }

    public void register(String username, String password) throws FormatErrorException {
        if(username==null||username.length()<6||username.length()>14){
            throw new FormatErrorException("用户名格式错误!(用户名长度必须在6-14个字符之间)");
        }
        this.username=username;
        this.password=password;
    }
}

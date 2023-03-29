package day27;

import java.util.Scanner;

public class RegisterTest {
    public static void main(String[] args) {
        UserService userService=new UserService();
        System.out.println("请输入注册信息：");
        Scanner scanner=new Scanner(System.in);
        System.out.print("用户名：");
        String username=scanner.next();
        System.out.print("密码：");
        String password=scanner.next();
        try {
            userService.register(username,password);
            System.out.println("注册成功！");
        } catch (FormatErrorException e) {
            e.printStackTrace();
        }
    }
}

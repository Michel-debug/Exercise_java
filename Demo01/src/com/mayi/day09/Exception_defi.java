package com.mayi.day09;

import java.util.Scanner;

/**
 * @author Michel
 * @create 2022-08-22-10:42
 * @contact 724915929@qq.com
 */
public class Exception_defi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户的名称");
        String Username = sc.nextLine();
        System.out.println("输入用户的密码");
        String pwd = sc.nextLine();
        try {
            login(Username,pwd);
        }
        catch (login e){
            System.out.println(e.getMessage());
        }

    }
    public static void login(String userName, String pwd) throws login{
        if(!("mayikt".equals(userName) && "12345".equals(pwd))){
                throw new login("用户输入名称和密码不正确");
        }
    }
}
class login extends Exception{
    public login(String message){
        super(message);
    }
}

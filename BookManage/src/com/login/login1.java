package com.login;
import com.book.bookManageList;
import com.book.bookBorrowList;
import com.bookPeople.bookUsers;
import com.bookPeople.bookAdministrator;
import com.bookPeople.bookUsersList;
import com.bookPeople.bookAdministratorList;
import com.book.book;


import java.util.ArrayList;
import java.util.Scanner;
public class login1 {

    //注册一个管理员账户
    bookAdministrator ad = new bookAdministrator("ad_qwer", "123789");

    bookUsers bu = new bookUsers("zqq","0123");
    book bk = new book("1","天下","新华","12","hh",false);

    public bookAdministrator getAd() {
        return ad;
    }

    public bookUsers getBu() {
        return bu;
    }

    public book getBk() {
        return bk;
    }

    public void AdShow() {
        System.out.println("欢迎使用读书管理系统！");
        System.out.print("添加用户请按 1           ");
        System.out.println("删除用户请按 2 ");
        System.out.print("修改用户借书情况请按 3    ");
        System.out.println("查找用户请按 4 ");
        System.out.print("添加图书请按 5           ");
        System.out.println("删除图书请按 6 ");
        System.out.print("修改图书请按 7          ");
        System.out.println("查找图书请按 8 ");
        System.out.print("注册管理员请按 9         ");
        System.out.println("修改用户密码请按 10 ");
        System.out.print("退出登录请按 11        ");
        System.out.println("关闭请按 0 ");
        System.out.print("查看所有用户的状态请按 12 ");
        System.out.println("查看所有书籍状态请按 13 ");
        System.out.print("查看书籍borrow请按 14 ");
        System.out.println("查看所有数据汇总请按 15");
    }

    public void AdFun()
    {
        //---------管理员-----------------------------------------
        while (true) {

            //界面显示  管理员
            //login1 lo = new login1();
            Scanner sc = new Scanner(System.in);
            int a = 0;

            AdShow();
            a = sc.nextInt();
            switch (a) {
                case 0:
                    return;
                case 1:
                    System.out.println("输入添加的用户的id和密码");
                    String id = sc.next();
                    String password = sc.next();
                    bu=getAd().addBookUsers(id, password);
                    break;
                case 2:
                    System.out.print("请输入用户的ID：");
                    String userId2 = sc.next();
                    getAd().deleteBookUsers(userId2);
                    break;
                case 3:
                    System.out.print("请输入用户的ID：");
                    String userId3 = sc.next();
                    getAd().setBookUsers(userId3);
                    break;
                case 4:
                    System.out.print("请输入用户的ID：");
                    String userId4 = sc.next();
                    getAd().examineBookUsers(userId4);
                    break;
                case 5:
                    System.out.print("请输入书的ID：");
                    String bookId5 = sc.next();
                    System.out.print("请输入书名：");
                    String bookName5 = sc.next();
                    System.out.print("请输入出版社：");
                    String publishing5 = sc.next();
                    System.out.print("请输入价格：");
                    String price5 = sc.next();
                    System.out.print("请输入作者：");
                    String author5 = sc.next();
                    System.out.print("该书是否被借出（true/false）：");
                    String isBorrowed5 = sc.next();
                    book tt = getAd().addBook(bookId5, bookName5, publishing5, price5, author5, Boolean.parseBoolean(isBorrowed5));
                    break;
                case 6:
                    System.out.print("请输入书的ID：");
                    String bookId6 = sc.next();
                    getAd().deleteBook(bookId6);
                    break;
                case 7:
                    System.out.print("请输入书的ID：");
                    String bookId7 = sc.next();
                    getAd().setBook(bookId7);
                    break;
                case 8:
                    System.out.print("请输入书的ID：");
                    String bookId8 = sc.next();
                    getAd().examineBook(bookId8);
                    break;
                case 9:
                    zhuce111();
                    break;
                case 10:
                    System.out.print("请输入用户的ID：");
                    String userId10 = sc.next();
                    getAd().reviseBookUsersPassword(userId10);
                    break;
                case 11:
                    loginShow();
                    break;
                case 12:
                    bookUsersList.listBookUsers();
                    break;
                case 13:
                    bookManageList.listBook();
                    break;
                case 14:
                    bookBorrowList.listBook();
                    break;
                case 15:
                    bookBorrowList.listBook();
                    bookManageList.listBook();
                    bookUsersList.listBookUsers();
                    bookAdministratorList.listBookAdmin();
                    break;
                default:
                    break;
            }
        }
    }


    public void usShow()
    {
        System.out.println("欢迎使用读书管理系统！");
        bookBorrowList.listBook();
        System.out.print("查看密码请按 1  ");
        System.out.println("借书请按 2");
        System.out.print("还书请按 3     ");
        System.out.println("续借请按 4");
        System.out.print("查看自己当前状态请按 5  ");
        System.out.println("修改密码请按 6 ");
        System.out.print("关闭请按 0    ");
        System.out.println("退出登录请按 7");
    }
    public void usFun()
    {
        //---------------用户------------------------------

        Scanner sc = new Scanner(System.in);

        while(true)
        {

            //界面显示用户
            int a = 0;
            usShow();
            a = sc.nextInt();
            switch(a)
            {
                case 0:
                    return;

                case 1:
                    System.out.println(bu.getPassword());
                    break;
                case 2:
                    //借书
                    System.out.print("请输入要借的书的name：");
                    String userId2 = sc.next();
                    bu.borrowBooks(userId2);
                    break;
                case 3:
                    //还书
                    System.out.print("请输入要还的书的name：");
                    String userId3 = sc.next();
                    bu.returnBooks(userId3);
                    break;
                case 4:
                    //延迟
                    if(bu.getIsRenew()==false)
                    {
                        bu.setIsRenew(!bu.getIsRenew());
                    }
                    else {
                        System.out.println("已经延迟了，不能再延迟了");
                    }
                    //
                    break;
                case 5:
                    System.out.println(bu.toString());
                    break;
                case 6:
                    System.out.println("请输入要修改的密码");
                    String t=sc.next();
                    bu.setPassword(t);
                    break;
                case 7:
                    loginShow();
                    break;
                default:
                    System.out.println("请重新输入");
                    break;
            }

        }
    }

    public void loginShow() {
        Scanner sc = new Scanner(System.in);
        boolean isLoginSuccess = false;//记录状态的

        while(!isLoginSuccess)
        {
            System.out.print("请输入用户名:");
            String id = sc.next();
            System.out.print("请输入密码:");
            String password = sc.next();

            if (id.startsWith("ad_")) {
                // 输入的ID以 "ad_" 开头，表示管理员
                    ArrayList<bookAdministrator>  ba=bookAdministratorList.getInstance();
                for (int i = 0; i < ba.size(); i++) {
                        ad=ba.get(i);

                    if (id.equals(ad.getAdmin_id()) && password.equals(ad.getAdmin_password())) {
                        //System.out.println("管理员登录成功！");
                        isLoginSuccess = true;
                        //displayAdminMenu(); // 管理员菜单
                        AdFun();
                    } else {
                        if(ad==ba.get(ba.size()-1))
                        {
                            System.out.println("管理员用户名或密码错误！");
                        }
                    }

                }


                //
//                if (id.equals(ad.getAdmin_id()) && password.equals(ad.getAdmin_password())) {
//                    //System.out.println("管理员登录成功！");
//                    isLoginSuccess = true;
//                    //displayAdminMenu(); // 管理员菜单
//                    AdFun();
//                } else {
//                    System.out.println("管理员用户名或密码错误！");
//                }

            }
            else {

                ArrayList<bookUsers>  ttt=bookUsersList.getInstance();
                for (int i = 0; i < ttt.size(); i++) {
                    bu=ttt.get(i);

                    if (id.equals(bu.getId()) && password.equals(bu.getPassword())){
                        //System.out.println("普通用户登录成功！");
                        isLoginSuccess = true;
                        //displayUserMenu(); // 用户菜单
                        usFun();
                    } else {
                        if(bu==ttt.get(ttt.size()-1))
                        {
                            System.out.println("普通用户用户名或密码错误！");
                        }


                    }
                }


//                if (id.equals(bu.getId()) && password.equals(bu.getPassword())){
//                    //System.out.println("普通用户登录成功！");
//                    isLoginSuccess = true;
//                    //displayUserMenu(); // 用户菜单
//                    usFun();
//                } else {
//                    System.out.println("普通用户用户名或密码错误！");
//                }
            }
        }

    }


    // 根据用户身份显示不同的界面
    public void displayAdminMenu() {
        AdShow();
    }

    public void displayUserMenu() {
        usShow();
    }

    public bookUsers zhuce()
    {

        boolean temp=false;
        while(!temp)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入注册的id：");
            String newId = sc.next();
            System.out.print("请输入注册的密码：");
            String newPassword = sc.next();
            bu = new bookUsers(newId, newPassword);

            System.out.println("继续注册请按 Y");
            String t=sc.next();
            if(t!="Y")
            {
                temp=true;
            }
        }
        return bu;
    }

    public bookAdministrator zhuce111()
    {

        boolean temp=false;
        while(!temp)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入注册的id：");
            String newId = sc.next();
            System.out.print("请输入注册的密码：");
            String newPassword = sc.next();
            ad = new bookAdministrator(newId, newPassword);

            System.out.println("继续注册请按 Y");
            String t=sc.next();
            if(t!="Y")
            {
                temp=true;
            }
        }
        return ad;
    }




    public void isZhuce()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("注册请按 1 ，不注册请按 2 ");
        String temp = sc.next();
        if(temp.equals("1"))
        {
            bu=zhuce();

        }
        else if (temp.equals("2"))
        {
            System.out.println("跳转到登录界面");

        }
        else {
            System.out.println("输入了不为 1 和 2，则视为不注册,跳转到登录界面");

        }

    }

    public static void main(String[] args) {
        login1 lo = new login1();
        Scanner sc = new Scanner(System.in);
        lo.ad.addBook("2","天上","新华","12","hh",false);
        lo.ad.addBook("3","白云","新华","12","hh",false);
        lo.ad.addBook("4","蓝天","新华","12","hh",false);

        lo.isZhuce();//
        lo.loginShow();
    }
}

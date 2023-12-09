package com.bookPeople;
import com.book.book;
import com.book.bookManageList;
import com.book.bookBorrowList;

import java.util.ArrayList;
import java.util.Scanner;

public class bookAdministrator {
    private String Admin_id;//用户名

    private String Admin_password;//密码

    public bookAdministrator(String admin_id, String admin_password) {
        Admin_id = admin_id;
        Admin_password = admin_password;
        bookAdministratorList.getInstance().add(this);
//
    }

    public bookUsers addBookUsers(String id, String password) {//加人
        bookUsers newBookUsers=new bookUsers(id,password);
        return newBookUsers;
    }



    public void deleteBookUsers(String id){//销户
        ArrayList<bookUsers> userList = bookUsersList.getInstance();
        for(bookUsers user : userList){//bookUsers
            if(user.getId().equals(id)){
                userList.remove(user);
                break;
            }
        }
    }




public void setBookUsers(String id) { //修改人的状态
    ArrayList<bookUsers> userList = bookUsersList.getInstance();
    Scanner sc = new Scanner(System.in);

    while (true) {
        System.out.println("修改人状态：是否借书按1，续借按2，归还按3，退出按0");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("退出修改状态");
            break;
        }

        for (bookUsers user : userList) {
            if (user.getId().equals(id)) {
                switch (num) {
                    case 1:
                        user.setIsBorrowBooks(!user.getIsBorrowBooks());
                        break;
                    case 2:
                        user.setIsRenew(!user.getIsRenew());
                        break;
                    case 3:
                        user.setIsReturn(!user.getIsReturn());
                        break;
                    default:
                        System.out.println("输入的值无效");
                        break;
                }
                break;
            }
        }
    }
}

    public bookUsers examineBookUsers(String id)//查
    {
        ArrayList<bookUsers> userList = bookUsersList.getInstance();
        for(bookUsers user : userList){//bookUsers
            if(user.getId().equals(id)){
                System.out.println(user.toString());
                return user;
            }
        }
        System.out.println("出无此人");
        return null;
    }


    public void reviseBookUsersPassword(String id){//修改用户密码
        bookUsers temp=examineBookUsers(id);
        temp.setPassword("123456");
    }

    //------------------书-------------------------------
    //加书
    public book addBook(String id, String name,String publishing,String price,String author,boolean isBorrow) {
        book newBook=new book(id,name,publishing,price,author,isBorrow);
        return newBook;
    }

    //删书
    public void deleteBook(String id){//删书
        ArrayList<book> bookList = bookManageList.getInstance();
        for(book bk : bookList){//bookUsers
            if(bk.getId().equals(id)){
                bookList.remove(bk);
                break;
            }
        }
    }


    //改书
    public void setBook(String id) { //修改书的状态
        ArrayList<book> bookList = bookManageList.getInstance();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("修改书属性：修改编号按1，书名按2，出版社按3，价格按4，作者按5，是否被借阅按6，退出按0");
            int num = sc.nextInt();

            if (num == 0) {
                System.out.println("退出修改状态");
                break;
            }

            for (book bk : bookList) {
                if (bk.getId().equals(id)) {
                    String re=sc.next();
                    switch (num) {
                        case 1:
                            bk.setId(re);
                            break;
                        case 2:
                            bk.setName(re);
                            break;
                        case 3:
                            bk.setPublishing(re);
                            break;
                        case 4:
                            //bk.setPrice(re);
                            break;
                        case 5:
                            bk.setAuthor(re);
                            break;
                        case 6:
                            //bk.setIsBorrow();
                            break;
                        default:
                            System.out.println("输入的值无效");
                            break;
                    }
                    break;
                }
            }
        }
    }

    public book examineBook(String id)//查书
    {
        ArrayList<book> bookList = bookManageList.getInstance();

        for(book bk : bookList){//bookUsers
            if(bk.getId().equals(id)){
                System.out.println(bk.toString());
                return bk;
            }
        }
        System.out.println("出无此书");
        return null;
    }





    public String getAdmin_id() {
        return Admin_id;
    }

    public void setAdmin_id(String admin_id) {
        Admin_id = admin_id;
    }

    public String getAdmin_password() {
        return Admin_password;
    }

    public void setAdmin_password(String admin_password) {
        Admin_password = admin_password;
    }














}

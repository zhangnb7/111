package com.bookPeople;

import java.util.ArrayList;

public class bookUsersList {
    private static ArrayList <bookUsers> usersList=new ArrayList();

    private bookUsersList(){}
    public static ArrayList getInstance(){
        return usersList;
    }

    public static void listBookUsers() {
        for (bookUsers bs : usersList) {
            System.out.print("用户ID：" + bs.getId()+",");
            System.out.print("是否借书：" + bs.getIsBorrowBooks()+",");
            System.out.print("是否续借：" + bs.getIsRenew()+",");
            System.out.print("是否归还：" + bs.getIsReturn()+".");

            System.out.println();
        }
    }
}

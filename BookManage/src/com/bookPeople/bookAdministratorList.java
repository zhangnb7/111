package com.bookPeople;

import java.util.ArrayList;

public class bookAdministratorList {
    private static ArrayList<bookAdministrator> adminsBook=new ArrayList();

    private bookAdministratorList(){}
    public static ArrayList getInstance(){
        return adminsBook;
    }

    public static void listBookAdmin() {
        for (bookAdministrator ab : adminsBook) {
            System.out.print("管理员ID：" + ab.getAdmin_id()+",");
            System.out.print("密码：" + ab.getAdmin_password());
            System.out.println();
        }
    }


}

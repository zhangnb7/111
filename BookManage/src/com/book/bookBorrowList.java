package com.book;

import java.util.ArrayList;

public class bookBorrowList {


    //好多要改的

    private static ArrayList<book> book_Borrow_List =new ArrayList();

    private bookBorrowList(){
    }

    public static ArrayList<book> getInstance() {
        return book_Borrow_List;
    }

    public static void listBook() {
        for (book bk : book_Borrow_List) {
            System.out.print("书名:"+bk.getName()+",");
            System.out.print("是否被借阅:"+bk.getIsBorrow()+",");
            if(bk.getIsBorrow()!=false)
            {
                System.out.print("借阅时间"+bk.toTimeString() );
            }

            System.out.println();
        }
    }













}

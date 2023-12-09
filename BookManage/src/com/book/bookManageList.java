package com.book;

import java.util.ArrayList;
import java.util.Scanner;

public class bookManageList {
    private static ArrayList <book> book_Manage_List =new ArrayList();

    private bookManageList(){
    }

    public static ArrayList getInstance(){
        return book_Manage_List;
    }



    public static void listBook() {
        for (book bk : book_Manage_List) {
            bk.showToString();
        }
    }


}

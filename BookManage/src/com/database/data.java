//package com.database;
//import com.book.bookManageList;
//import com.book.bookBorrowList;
//import com.bookPeople.bookUsersList;
//import com.bookPeople.bookAdministratorList;
//
//import java.util.ArrayList;
//
//public class data {
//    private static ArrayList<bookBorrowList> bookBorrowLists = new ArrayList<>();
//    private static ArrayList<bookManageList> bookManageLists = new ArrayList<>();
//    private static ArrayList<bookAdministratorList> bookAdministratorLists = new ArrayList<>();
//    private static ArrayList<bookUsersList> bookUsersLists = new ArrayList<>();
//
//    public static void addBookBorrowList(bookBorrowList bookBorrowList) {
//        bookBorrowLists.add(bookBorrowList);
//    }
//
//    public static void addBookManageList(bookManageList bookManageList) {
//        bookManageLists.add(bookManageList);
//    }
//
//    public static void addBookAdministratorList(bookAdministratorList bookAdministratorList) {
//        bookAdministratorLists.add(bookAdministratorList);
//    }
//
//    public static void addBookUsersList(bookUsersList bookUsersList) {
//        bookUsersLists.add(bookUsersList);
//    }
//
//    public static void listAll() {
//        System.out.println("Book Borrow Lists:");
//        for (bookBorrowList bookBorrowList : bookBorrowLists) {
//            bookBorrowList.listBook();
//        }
//
//        System.out.println("Book Manage Lists:");
//        for (bookManageList bookManageList : bookManageLists) {
//            bookManageList.listBook();
//        }
//
//        System.out.println("Book Administrator Lists:");
//        for (bookAdministratorList bookAdministratorList : bookAdministratorLists) {
//            bookAdministratorList.listBookAdmin();
//        }
//
//        System.out.println("Book Users Lists:");
//        for (bookUsersList bookUsersList : bookUsersLists) {
//            bookUsersList.listBookUsers();
//        }
//    }
//}

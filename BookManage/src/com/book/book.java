package com.book;
import java.text.SimpleDateFormat;

import java.util.Date;

public class book {
    public String id;//书编号
    public String name;//书名
    public String publishing;//出版社
    public String price;//价格
    public String author;//作者

    public boolean isBorrow;//是否被借阅

    private Date time;//属于借阅

    public book(){
        bookManageList.getInstance().add(this);
        bookBorrowList.getInstance().add(this);

        this.time=new Date();
    }
    public book(String id, String name, String publishing, String price, String author, boolean isBorrow) {
        this.id = id;
        this.name = name;
        this.publishing = publishing;
        this.price = price;
        this.author = author;
        this.isBorrow = isBorrow;
        bookManageList.getInstance().add(this);
        bookBorrowList.getInstance().add(this);

        this.time=new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean getIsBorrow() {
        return isBorrow;
    }



    public void setIsBorrow(boolean borrow) {
        isBorrow = borrow;
    }

    @Override
    public String toString() {
        return "book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", publishing='" + publishing + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", isBorrow=" + isBorrow +
                '}';
    }

    public void showToString()
    {
        System.out.println(toString());
    }



    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


    public String toTimeString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        return dateFormat.format(this.time);

    }





}

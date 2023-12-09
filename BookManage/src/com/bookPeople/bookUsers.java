package com.bookPeople;
import com.book.book;
import com.book.bookManageList;

import java.util.ArrayList;

public class bookUsers {
    private String id;//用户名
    private String password;//密码
    private boolean isBorrowBooks;//是否借书
    private boolean isRenew;//是否续借
    private boolean isReturn;//是否归还

    private String borrowBbook;//借那本书





    public bookUsers(String id, String password) {
        this.id = id;
        this.password = password;
        isBorrowBooks=false;
        isRenew=false;
        isReturn=false;
        borrowBbook=null;
        bookUsersList.getInstance().add(this);

    }

    public bookUsers(){
        isBorrowBooks=false;
        isRenew=false;
        isReturn=false;
        borrowBbook=null;
        bookUsersList.getInstance().add(this);
    }




    //借书
    public void borrowBooks(String name)
    {
        ArrayList<book> bookttt=bookManageList.getInstance();

        for(int i=0 ;i<bookttt.size() ;i++ )
        {
            book temp=bookttt.get(i);
            if(temp.getName().equals(name))
            {
                if(borrowBbook==null)//未借书，则能借书
                {
                    setBorrowBbook(temp.name);
                    setIsBorrowBooks(!getIsBorrowBooks());
                    setBorrowBbook(name);
                    temp.setIsBorrow(true);
                    if(getIsReturn()==true)
                    {
                       setIsReturn(false);
                    }
                    break;
                }
                else {
                    System.out.println("您现在不能借书！");
                    break;
                }
            }

            if(i==bookttt.size()-1)
            {
                System.out.println("没有这个书！");
            }

        }

    }
    //还书
    public void returnBooks(String name)
    {
        ArrayList<book> bookttt=bookManageList.getInstance();

        for(int i=0 ;i<bookttt.size() ;i++ )
        {
            book temp=bookttt.get(i);
            if(temp.getName().equals(name))
            {
                if(borrowBbook!=null)
                {
                    borrowBbook=null;
                    setBorrowBbook(null);
                    temp.setIsBorrow(!temp.getIsBorrow());
                    setIsBorrowBooks(!getIsBorrowBooks());
                    setIsReturn(!getIsReturn());
                    temp.setIsBorrow(false);
                    if(getIsRenew()==true)
                    {
                        setIsRenew(false);
                    }

                    break;
                }
                else {
                    System.out.println("没有书要还");
                    break;
                }
            }
            if(i==bookttt.size()-1)
            {
                System.out.println("还错书了");
            }
        }
    }





    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getIsBorrowBooks() {
        return isBorrowBooks;
    }

    public void setIsBorrowBooks(boolean borrowBooks) {
        isBorrowBooks = borrowBooks;
    }

    public boolean getIsRenew() {
        return isRenew;
    }

    public void setIsRenew(boolean renew) {
        isRenew = renew;
    }

    public boolean getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(boolean aReturn) {
        isReturn = aReturn;
    }

    public String getBorrowBbook() {
        return borrowBbook;
    }

    public void setBorrowBbook(String borrowBbook) {
        this.borrowBbook = borrowBbook;
    }


    @Override
    public String toString() {
        return "bookUsers{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", isBorrowBooks=" + isBorrowBooks +
                ", isRenew=" + isRenew +
                ", isReturn=" + isReturn +
                ", borrowBbook='" + borrowBbook + '\'' +
                '}';
    }
}

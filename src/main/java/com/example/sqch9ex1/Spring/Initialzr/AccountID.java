package com.example.sqch9ex1.Spring.Initialzr;


public class AccountID {
    private int id;

    //null constructor;
    public void accountID(){
        id = 0;
    }

    //parameter constructor
    public void accountID(int id){
        this.id=id;
    }

    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

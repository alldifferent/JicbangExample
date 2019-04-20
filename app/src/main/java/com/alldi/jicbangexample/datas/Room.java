package com.alldi.jicbangexample.datas;

public class Room {

    int deposit; // 보증금
    int month_pay; // 월세
    String loaction; //지역
    int floor; //몇층 만약 지하라면 음수
    String description; //설명

    public Room(int deposit, int month_pay, String loaction, int floor, String description) {
        this.deposit = deposit;
        this.month_pay = month_pay;
        this.loaction = loaction;
        this.floor = floor;
        this.description = description;
    }
}

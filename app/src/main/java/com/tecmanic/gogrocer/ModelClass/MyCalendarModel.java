package com.tecmanic.gogrocer.ModelClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyCalendarModel {
    private String monthValue;
    private String day;
    private String date, month, year;
    private int pos = 0;

    public MyCalendarModel() {
    }

    public MyCalendarModel(String day, String date, String month, String year, int i,String monthValue) {
        this.day = day;
        this.date = date;
        this.month = getMonthStr(month);
        this.year = year;
        this.pos = i;
        this.monthValue = monthValue;

    }

    private String getMonthStr(String month) {

        Calendar cal = Calendar.getInstance();

        SimpleDateFormat month_date = new SimpleDateFormat("MMM");
        int monthnum = Integer.parseInt(month);
        cal.set(Calendar.MONTH, monthnum);
        String month_name = month_date.format(cal.getTime());
        return month_name;

    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String date) {
        this.day = day;
    }

    public String getDate() {
        if (date.length()==1){
            return "0"+date;
        }
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }


    public void setYear(String year) {
        this.year = year;
    }

    public String getMonthValue() {
        if (monthValue.length()==1){
            return "0"+String.valueOf(Integer.parseInt(monthValue)+1);
        }
        return String.valueOf(Integer.parseInt(monthValue)+1);
    }

    public void setMonthValue(String monthValue) {
        this.monthValue = monthValue;
    }

    @Override
    public String toString() {
        return "MyCalendarModel{" +
                "monthValue='" + monthValue + '\'' +
                ", day='" + day + '\'' +
                ", date='" + date + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                ", pos=" + pos +
                '}';
    }
}

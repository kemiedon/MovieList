package com.example.kemie_home.customlistview;

/**
 * Created by Kemie-home on 2016/7/31.
 */
public class Movie {
    public int pic;
    public String name;
    public String date;
    public String intro;
    public Movie(int pic, String name, String date, String intro){
        this.pic = pic;
        this.name = name;
        this.date = date;
        this.intro = intro;
    }
    public int getPic(){
        return pic;
    }
    public void setPic(int pic){
        this.pic = pic;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getIntro(){
        return intro;
    }
    public void setIntro(String intro){
        this.intro = intro;
    }
}

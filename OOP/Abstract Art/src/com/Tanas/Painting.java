package com.Tanas;

public class Painting extends Art{
 public String paintType;

    public Painting(String title, String author, String description, String paintType) {
        super(title, author, description);
        this.paintType = paintType;
    }
    public void viewArt(){
        String result="";
        result+="Title: "+getTitle();
        result+="\nAuthor: "+getAuthor();
        result+="\nDescription: "+getDescription();
        result+="\nPaint Type: "+paintType;
        System.out.println(result);
        System.out.println("________________________________________");
    }

}

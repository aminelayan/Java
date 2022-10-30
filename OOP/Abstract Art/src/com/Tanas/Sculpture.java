package com.Tanas;

public class Sculpture extends Art{
    public String material;


    public Sculpture(String title, String author, String description, String material) {
        super(title, author, description);
        this.material = material;
    }

    public void viewArt(){
        String result="";
        result+="Title: "+getTitle();
        result+="\nAuthor: "+getAuthor();
        result+="\nDescription: "+getDescription();
        result+="\nMaterial: "+material;
        System.out.println(result);
        System.out.println("________________________________________");
    }
}

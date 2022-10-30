package com.Tanas;

public class Museum {
    public static void main(String[] args) {
        Painting MonaLisa= new Painting("Mona Lisa","Leonardo da Vinci","Mona","Oil");
        MonaLisa.viewArt();
        Painting Sura = new Painting("Sura","Sura","Sura","Sura");
        Sura.viewArt();
        Painting Amin=new Painting("Amin","Amin","Amin","Amin");
        Amin.viewArt();
        Sculpture SuraS =new Sculpture("Sura","Sura","Sura","Sura");
        SuraS.viewArt();
        Sculpture AminS =new Sculpture("Amin","Amin","Amin","Amin");
        AminS.viewArt();
    }
}

package com.example.henry.listasciudades;

public class Ciudades {

    private String name;
    private int image;
    private String information;


    public Ciudades(String name, int image, String information) {
        this.name = name;
        this.image = image;
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getInformation() {
        return information;
    }

    public void setInformacion(String information) {
        this.information = information;
    }
}


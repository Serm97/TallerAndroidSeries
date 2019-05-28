package com.practice.tallerandroidseries;

import java.io.Serializable;

public class Serie implements Serializable {

    private String nameSerie;
    private int imageSerie;

    public Serie(String nameSerie, int imageSerie) {
        this.nameSerie = nameSerie;
        this.imageSerie = imageSerie;
    }

    public String getNameSerie() {
        return nameSerie;
    }

    public void setNameSerie(String nameSerie) {
        this.nameSerie = nameSerie;
    }

    public int getImageSerie() {
        return imageSerie;
    }

    public void setImageSerie(int imageSerie) {
        this.imageSerie = imageSerie;
    }
}

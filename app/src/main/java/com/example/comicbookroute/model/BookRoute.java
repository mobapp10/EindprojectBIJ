package com.example.comicbookroute.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import java.io.Serializable;

@Entity
public class BookRoute implements Serializable {

    @PrimaryKey (autoGenerate = true)
    private long id;
    private String photo;
    private String personnage;
    private String auteur;
    private Double latitude;
    private Double longitude;
    private String annee;
    private boolean isFavorite;

    public BookRoute() {
    }

    @Ignore
    public BookRoute(String photo, String personnage, Double latitude, Double longitude, String auteur, String annee, boolean isFavorite) {

        this.photo = photo;
        this.personnage = personnage;
        this.auteur = auteur;
        this.latitude = latitude;
        this.longitude = longitude;
        this.annee = annee;
        this.isFavorite = isFavorite;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPersonnage() {
        return personnage;
    }

    public void setPersonnage(String personnage) {
        this.personnage = personnage;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}



package com.xendacentral.darkcatalog.models;

/**
 * Created by angelvelasquez on 6/26/15.
 */
public class Person {
    String firstName;
    String lastName;
    String pictureUrl;
    String shortBio;

    public Person(String firstName, String lastName, String pictureUrl, String shortBio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pictureUrl = pictureUrl;
        this.shortBio = shortBio;
    }
}

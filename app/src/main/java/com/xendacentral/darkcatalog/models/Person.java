package com.xendacentral.darkcatalog.models;

/**
 * Created by angelvelasquez on 6/26/15.
 */
public class Person {
    String firstName;
    String lastName;
    String pictureUrl;

    public Person(String firstName, String lastName, String pictureUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pictureUrl = pictureUrl;
    }
}

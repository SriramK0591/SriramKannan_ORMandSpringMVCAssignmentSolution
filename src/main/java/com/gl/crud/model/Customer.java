package com.gl.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Country table in database
 */
@Entity
@Table(name="customer")
public class Customer {

    @Id
    @Column(name="CUSTOMER_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;

    @Column(name="CUSTOMER_FNAME")
    String firstname;

    @Column(name="CUSTOMER_lNAME")
    String lastname;

    @Column(name="EMAIL")
    String email;



    public Customer() {
        super();
    }
    public Customer(int id, String firstname, String lastname, String email) {
        super();
        this.id = id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
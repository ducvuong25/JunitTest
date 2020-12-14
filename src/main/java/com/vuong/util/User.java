/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuong.util;

/**
 *
 * @author Admin
 */
public class User {

    private int Id;
    private String name;
    private int age;
    // day la ot dependecy
    private HackNASA hackNASA;

    public User() {
    }

    public User(int Id, String name, int age) {
        this.Id = Id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return hackNASA.getPassword();
    }

}

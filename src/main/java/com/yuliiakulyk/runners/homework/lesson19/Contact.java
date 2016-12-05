package com.yuliiakulyk.runners.homework.lesson19;

/**
 * Created by Yuliia Kulyk on 05.12.2016.
 */
public class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return this.name + ": " + this.phone;
    }
}

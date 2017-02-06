package com.yuliiakulyk.runners.use_enum;

/**
 * Created by Yuliia Kulyk on 26.11.2016.
 */
public enum Company {
    EBAY(30, "Ebay Inc") {
        @Override
        int getIncome() {
            return 5;
        }
    }, GOOGLE(15, "Google Inc") {
        @Override
        int getIncome() {
            return 0;
        }
    };

    private int value;
    private String fullName;
    private Company(int value, String fullName) {
        this.value = value;
        this.fullName = fullName;
    }


    abstract int getIncome();

    public int getValue() { return value; }

    public static void main(String[] args) {
        for (Company cName: Company.values()) {
            System.out.println("Company value: " + cName.getValue() + " - Company Name: " + cName);
        }
    }
}

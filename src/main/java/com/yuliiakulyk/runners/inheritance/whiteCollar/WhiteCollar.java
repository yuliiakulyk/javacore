package com.yuliiakulyk.runners.inheritance.whiteCollar;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 17.11.2016.
 */
public class WhiteCollar extends Human {
    String companyName;

    public WhiteCollar(int age, String name, String companyName) {
        super(age, name);
        this.companyName = companyName;
    }

    public void setCompanyName (String companyName) {
        if (isValidCompanyName(companyName)) {
            this.companyName = companyName;
            out.println("New company name \"" + companyName + "\" is set.");
        } else {
            out.println("Invalid company name \"" + companyName + "\".");
        }
    }

    public boolean isValidCompanyName (String companyName) {
        char c;
        for (int i = 0; i < companyName.length(); i++) {
            c = companyName.charAt(i);
            if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c == ' ' || c == ',' || c == '-')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WhiteCollar whiteCollar1 = new WhiteCollar(25, "Ed", "gsk");
        whiteCollar1.setCompanyName("Одесский дворик");
        whiteCollar1.setCompanyName("Philip Morris");
        whiteCollar1.setCompanyName("Coca-cola");
        whiteCollar1.setCompanyName("Pepsi, KLM");
    }

}

package me.groupproject.forms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.format.DateTimeParseException;

public class Birthday {

    private String bday1;
    private String formattedbirthday;
    private String male;
    private String female;


////    public Birthday(String bday1) {
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Please enter your birthday? in this way yyyy-mm-dd");
//        bday1 = keyboard.nextLine();
////    }

    public Birthday(String formattedDate) {
        this.bday1=formattedDate;

    }
    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getFemale() {
        return female;
    }

    public void setFemale(String female) {
        this.female = female;
    }


    public String getBday1() {
        return bday1;
    }

    public void setBday1(String bday1) {
        this.bday1 = bday1;
    }

    public String getFormattedbirthday() {
        //Date from the user
        LocalDate birthday;
        birthday = LocalDate.parse(bday1);

        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter E = DateTimeFormatter.ofPattern("EEEE");
        String formattedbirthday = birthday.format(E);

        switch (formattedbirthday) {
            case "Monday":
                this.setMale("Kojo");
                this.setFemale("Adjoa:  Calm,peaceful");
                break;
            case "Tuesday":
                this.setFemale("Abena");
                this.setMale("Kwaben:Warrior, fierce, compassionate");
                //System.out.println("Your Ghana Birthday name is  FKwabena & Abena – Warrior, fierce, compassionate");
                break;
            case "Wednesday":
                this.setFemale(" Akua");
                this.setMale(" Your Ghana Birthday name for  Kwaku:Your Ghana Birthday name is  Kwaku");
               // System.out.println("Your Ghana Birthday name is  Kwaku & Akua – Your Ghana Birthday name is  Kwaku");
                break;
            case "Thursday":
                this.setFemale(" Yaa");
                this.setMale("  Yaw  Your Ghana Birthday name is – Confrontational, aggressive");
               // System.out.println(" Yaw & Yaa Your Ghana Birthday name is – Confrontational, aggressive");
                break;
            case "Friday":
                this.setFemale(" Afua");
                this.setMale("  Kofi Your Ghana Birthday name is – Adventurous, creative, innovative");
               // System.out.println(" Kofi & Afua Your Ghana Birthday name is – Adventurous, creative, innovative");
                break;
            case "Saturday":
                this.setFemale(" Ama ");
                this.setMale("  Kwame Your Ghana Birthday info is– The ancient wise one");
                //System.out.println(" Kwame & Ama  Your Ghana Birthday info is– The ancient wise one.");
                break;
            case "Sunday":
                this.setFemale(" Akosua ");
                this.setMale("  Kwesi Akosua Your Ghana Birthday info is – Born leader, guide, protector");
                //System.out.println("  Kwesi & Akosua Your Ghana Birthday info is – Born leader, guide, protector");
                break;
        }

        return formattedbirthday;
    }

    public void setFormattedbirthday(String formattedbirthday) {
        this.formattedbirthday = formattedbirthday;
    }





    }


package com.mycompany.behappy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AKASH BARANWAL & ROHIT KUMAR GUPTA
 */

    
public class Therapist {

    private int id;
    private String name;

    private String experience;
    private String contactNumber;
    private String city;
    private String address;
    private String fees;
    private String website;
    private String[] availDay;
    
    public Therapist(){
        
    }
    public Therapist(String id,String name,String experience,String contactNumber,String city,String address,
            String fees,String website,String availDay) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.experience = experience;
        this.contactNumber = contactNumber;
        this.city = city;
        this.address = address;
        this.fees = fees;
        this.website = website;
        this.availDay = availDay.split(" ");
    }

    public String[] getAvailDay() {
        return availDay;
    }
    public void printAvailDay(){
     for(int i=0;i<this.availDay.length;i++){
         System.out.println(i+" "+this.availDay[i]+" ");
     }   
    }

    public void setAvailDay(String[] availDay) {
        this.availDay = availDay.clone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    
    public static void main(String[] args) {
        Therapist Data = new Therapist();
        Data.setAddress("Nirsha,Dhanbad");
        String[] S={"Monday","","Wed"};
        Data.setAvailDay(S);
        Data.setCity("Dhanbad");
        Data.setWebsite("ddd");
        System.out.println(Data.getId()+" "+Data.getName()+" "+Data.getWebsite());
        Data.printAvailDay();
    }

}

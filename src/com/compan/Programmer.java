package com.compan;

public class Programmer extends Person{
    private String companyName;

    public Programmer(){

    }

    public Programmer(String companyName) {
        this.companyName = companyName;
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

     public void codding(String a){
         System.out.println(a+" coddind");
     }

    @Override
    public String toString() {
        return getName() + " "+ getDesignation() + " " + companyName;
    }
}

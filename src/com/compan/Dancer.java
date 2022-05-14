package com.compan;

public class Dancer extends Person{
    private String groupName;

     Dancer(){

    }

    public Dancer(String groupName) {
        this.groupName = groupName;
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public void dancing(){
        System.out.println(" dancing ");
    }

    @Override
    public String toString() {
        return getName()+" "+getDesignation()+" "+getGroupName();
    }
}

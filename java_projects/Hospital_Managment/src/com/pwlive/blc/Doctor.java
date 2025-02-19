package com.pwlive.blc;

public class Doctor {
    private static int idCounter = 0;
    private int id;
    private String name;
    private String speciality;

    public Doctor(String name, String speciality){
        this.id = ++idCounter;
        this.name = name;
        this.speciality = speciality;
    }
    public int getId(){
        return id;
    }

    @Override
    public String toString(){
        return "Doctor id:"+id+", Name:"+name+", Speciality:"+speciality;
    }
}

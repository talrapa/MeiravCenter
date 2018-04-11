package com.javahelps.com.javahelps.externaldatabasedemo;

public class Patients {
     private String FirstName;
    private String Id;
    private String ZimonTime;

    public Patients(String firstName, String id, String zimonTime) {
        this.FirstName = firstName;
        this.Id = id;
        this.ZimonTime = zimonTime;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getZimonTime() {
        return ZimonTime;
    }

    public void setZimonTime(String zimonTime) {
        ZimonTime = zimonTime;
    }
}

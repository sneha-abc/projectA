package com.Exception;

public class Student {
    private int id;
    private String name;
    private String  collage;
    private String branch;

    public Student(int id, String name,String collage,String branch){
        this.id=id;
        this.name=name;
        this.collage=collage;
        this.branch=branch;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    public void setCollage(String collage){
        this.collage=collage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getBranch(){
        return branch;
    }
    public String getCollage(){
        return collage;
    }

    public String toString(){
        return "id-" + id + "name-" + name + "branch-" + branch + "collage-" + collage;
    }
}

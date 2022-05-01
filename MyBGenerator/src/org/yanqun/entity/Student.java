package org.yanqun.entity;



public class Student {
    private int stuno;

    private String stuname;

    private int stuage;

    private String graname;

    private String carid;

    private int classid;

    public int getStuno() {
        return stuno;
    }

    public void setStuno(int stuno) {
        this.stuno = stuno;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public int getStuage() {
        return stuage;
    }

    public void setStuage(int stuage) {
        this.stuage = stuage;
    }

    public String getGraname() {
        return graname;
    }

    public void setGraname(String graname) {
        this.graname = graname == null ? null : graname.trim();
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid == null ? null : carid.trim();
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuno=" + stuno +
                ", stuname='" + stuname + '\'' +
                ", stuage=" + stuage +
                ", graname='" + graname + '\'' +
                ", carid='" + carid + '\'' +
                ", classid=" + classid +
                '}';
    }
}
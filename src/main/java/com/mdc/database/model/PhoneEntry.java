package com.mdc.database.model;

public class PhoneEntry {
    private int pbid;
    private int pid;
    private String name;
    private String phone;

    public int getPbid() {
        return pbid;
    }

    public void setPbid(int pbid) {
        this.pbid = pbid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PhoneEntry{" +
                "pbid=" + pbid +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

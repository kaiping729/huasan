package com.atguigu.mybatis.bean;

import org.apache.ibatis.type.Alias;

@Alias("emp")
public class Employee {
    private int id;
    private String lastname;
    private String email;
    private String gender;

    public Employee() {
    }

    public Employee(int id, String lastname, String email, String gender) {
        this.id = id;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private  String name;
    private List<String> phone;
    private Set<String> address;
    private Map<String,String> course;

    public Employee() {
    }

    public Employee(String name, List<String> phone, Set<String> address, Map<String, String> course) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }
}

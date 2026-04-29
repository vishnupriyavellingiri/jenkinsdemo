package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeV2 {
    private  Long id;

    private  Name name;

    public EmployeeV2(Name name, Long id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeV2{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}


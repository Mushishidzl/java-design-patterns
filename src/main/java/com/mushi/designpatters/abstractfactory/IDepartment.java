package com.mushi.designpatters.abstractfactory;

public interface IDepartment {

    void insert(Department department);

    Department get(String id);
}

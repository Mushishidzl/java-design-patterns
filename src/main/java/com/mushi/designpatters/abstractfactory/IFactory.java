package com.mushi.designpatters.abstractfactory;

public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}

package com.mushi.designpatters.abstractfactory;

/**
 * @ Author     ：Mushishi
 * @ Desc       ：
 * @ Version    :
 * @ Date       ：2018/10/11 13:44
 */
public class AccessDepartment implements IDepartment{
    @Override
    public void insert(Department department) {
        Access.getInstance().addDepartment(department);
    }

    @Override
    public Department get(String id) {
        return Access.getInstance().getDepartment(id);
    }
}

package com.mushi.designpatters.abstractfactory;

/**
 * @ Author     ：Mushishi
 * @ Desc       ：
 * @ Version    :
 * @ Date       ：2018/10/11 11:16
 */
public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        SqlServer.getInstance().addDepartment(department);
    }

    @Override
    public Department get(String id) {
        return SqlServer.getInstance().getDepartment(id);
    }
}

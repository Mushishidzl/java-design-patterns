package com.mushi.designpatters.abstractfactory;

/**
 * @ Author     ：Mushishi
 * @ Desc       ：
 * @ Version    :
 * @ Date       ：2018/10/11 11:17
 */
public class SqlServerFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}

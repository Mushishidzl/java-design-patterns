package com.mushi.designpatters.abstractfactory;

/**
 * @ Author     ：Mushishi
 * @ Desc       ：
 * @ Version    :
 * @ Date       ：2018/10/11 13:45
 */
public class AccessFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}

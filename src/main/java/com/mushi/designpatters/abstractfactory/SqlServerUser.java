package com.mushi.designpatters.abstractfactory;

/**
 * @ Author     ：Mushishi
 * @ Desc       ：用户实现类
 * @ Version    :
 * @ Date       ：2018/10/11 11:14
 */
public class SqlServerUser implements IUser {

    @Override
    public void insert(User user) {
        SqlServer.getInstance().addUser(user);
    }

    @Override
    public User get(String id) {
        return SqlServer.getInstance().getUser(id);
    }
}

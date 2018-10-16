package com.mushi.designpatters.abstractfactory;

/**
 * @ Author     ：Mushishi
 * @ Desc       ：
 * @ Version    :
 * @ Date       ：2018/10/11 13:42
 */
public class AccessUser implements IUser{
    @Override
    public void insert(User user) {
        Access.getInstance().addUser(user);
    }

    @Override
    public User get(String id) {
        return Access.getInstance().getUser(id);
    }
}

package com.mushi.designpatters.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * @ Author     ：Mushishi
 * @ Desc       ：
 * @ Version    :
 * @ Date       ：2018/10/11 11:21
 */
public class AbstracFactoryTest {

    @Test
    public void test(){
        User bill = new User("1","rain");
        Department microsoft = new Department("1","office");

        User musk = new User("2","mushishi");
        Department tesla = new Department("2","Tesla");

        IFactory sqlServerFactory = new SqlServerFactory();
        IUser sqlServerUser = sqlServerFactory.createUser();
        IDepartment sqlServerDepartment = sqlServerFactory.createDepartment();

        sqlServerUser.insert(bill);
        sqlServerDepartment.insert(microsoft);

        Assert.assertEquals("rain",SqlServer.getInstance().getUser("1").getName());
        Assert.assertEquals("office",SqlServer.getInstance().getDepartment("1").getName());

        IFactory accessFactory = new AccessFactory();
        IUser user = accessFactory.createUser();
        IDepartment department = accessFactory.createDepartment();


        user.insert(musk);
        department.insert(tesla);

        Assert.assertEquals("rain",SqlServer.getInstance().getUser("1").getName());
        Assert.assertEquals("office",SqlServer.getInstance().getDepartment("1").getName());



    }

}

package com.mushi.designpatters.builde;

/**
 * @ Author     ：Mushishi
 * @ Desc       ：
 * @ Version    :
 * @ Date       ：2018/10/11 14:15
 */
public class PersonDirector {

    public void createPerson(PersonBuilder personBuilder) {
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArmLeft();
        personBuilder.buildArmRight();
        personBuilder.buildlegLeft();
        personBuilder.buildlegRight();
    }


}

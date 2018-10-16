package com.mushi.designpatters.builde;

/**
 * @ Author     ：Mushishi
 * @ Desc       ：
 * @ Version    :
 * @ Date       ：2018/10/11 14:13
 */
public abstract class PersonBuilder {

    public abstract void buildHead();

    public abstract void buildBody();

    public abstract void buildArmLeft();

    public abstract void buildArmRight();

    public abstract void buildlegLeft();

    public abstract void buildlegRight();

    public abstract Person getResult();


}

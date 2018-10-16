package com.mushi.designpatters.builde;

/**
 * @ Author     ：Mushishi
 * @ Desc       ：
 * @ Version    :
 * @ Date       ：2018/10/11 14:21
 */
public class PersonThinBuilder extends PersonBuilder{

    public static final String THIN = "thin";

    private Person person;

    public PersonThinBuilder() {
        this.person = new Person();
    }

    @Override
    public void buildHead() {
        person.drawHead(THIN);
    }

    @Override
    public void buildBody() {
        person.drawBody(THIN);
    }

    @Override
    public void buildArmLeft() {
        person.drawArmLeft(THIN);
    }

    @Override
    public void buildArmRight() {
        person.drawArmRight(THIN);
    }

    @Override
    public void buildlegLeft() {
        person.drawLegLeft(THIN);
    }

    @Override
    public void buildlegRight() {
        person.drawLegRight(THIN);
    }

    @Override
    public Person getResult() {
        return person;
    }
}

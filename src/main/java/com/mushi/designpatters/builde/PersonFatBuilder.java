package com.mushi.designpatters.builde;

/**
 * @ Author     ：Mushishi
 * @ Desc       ：
 * @ Version    :
 * @ Date       ：2018/10/11 14:17
 */
public class PersonFatBuilder extends PersonBuilder {

    public static final String FAT ="fat";

    private Person person;


    public PersonFatBuilder() {
        this.person = new Person();
    }

    @Override
    public void buildHead() {
        person.drawHead(FAT);
    }

    @Override
    public void buildBody() {
        person.drawBody(FAT);
    }

    @Override
    public void buildArmLeft() {
        person.drawArmLeft(FAT);
    }

    @Override
    public void buildArmRight() {
        person.drawArmRight(FAT);
    }

    @Override
    public void buildlegLeft() {
        person.drawLegLeft(FAT);
    }

    @Override
    public void buildlegRight() {
        person.drawLegRight(FAT);
    }

    @Override
    public Person getResult() {
        return person;
    }
}

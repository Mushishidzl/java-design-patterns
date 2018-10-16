package com.mushi.designpatters.builder;

import com.mushi.designpatters.builde.Person;
import com.mushi.designpatters.builde.PersonDirector;
import com.mushi.designpatters.builde.PersonFatBuilder;
import com.mushi.designpatters.builde.PersonThinBuilder;
import org.junit.Assert;
import org.junit.Test;

/**
 * @ Author     ：Mushishi
 * @ Desc       ：
 * @ Version    :
 * @ Date       ：2018/10/11 14:24
 */
public class BuilderTest {

    @Test
    public void test(){
        PersonDirector personDirector = new PersonDirector();
        PersonThinBuilder personThinBuilder = new PersonThinBuilder();
        PersonFatBuilder personFatBuilder = new PersonFatBuilder();

        personDirector.createPerson(personFatBuilder);
        Person personFat = personFatBuilder.getResult();

        personDirector.createPerson(personThinBuilder);
        Person personThin = personThinBuilder.getResult();

        Assert.assertEquals(Person.HEAD + PersonThinBuilder.THIN, personThin.getHead());
        Assert.assertEquals(Person.BODY + PersonFatBuilder.FAT, personFat.getBody());


    }


}

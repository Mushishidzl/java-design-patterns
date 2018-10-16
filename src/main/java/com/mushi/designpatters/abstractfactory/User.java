package com.mushi.designpatters.abstractfactory;

import lombok.Data;

/**
 * @ Author     ：Mushishi
 * @ Desc       ：entity
 * @ Version    : 1.0
 * @ Date       ：2018/10/11 10:35
 */
@Data
public class User {

    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

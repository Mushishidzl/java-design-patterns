package com.mushi.designpatters.abstractfactory;

import lombok.Data;

/**
 * @ Author     ：Mushishi
 * @ Desc       ：部门
 * @ Version    : 1.0
 * @ Date       ：2018/10/11 10:39
 */
@Data
public class Department {

    private String id;
    private String name;

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

package com.mushi.designpatters.prototype;

import lombok.Data;

/**
 * @ Author     ：Mushishi
 * @ Desc       ：
 * @ Version    :
 * @ Date       ：2018/10/11 15:07
 */
@Data
public class WorkExperience implements Cloneable{

    private String timeArea;
    private String company;

    public WorkExperience clone() throws CloneNotSupportedException {
        return (WorkExperience) super.clone();
    }
}

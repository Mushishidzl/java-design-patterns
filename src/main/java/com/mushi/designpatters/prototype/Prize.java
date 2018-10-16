package com.mushi.designpatters.prototype;

import lombok.Data;

/**
 * @ Author     ：Mushishi
 * @ Desc       ：
 * @ Version    :
 * @ Date       ：2018/10/11 15:02
 */
@Data
public class Prize implements Cloneable{

    private String name;

    public Prize(String name) {
        this.name = name;
    }


    @Override
    public Prize clone() throws CloneNotSupportedException {
        return (Prize) super.clone();
    }
}

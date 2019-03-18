package com.gupao.liusy.prototype.deep;

import java.io.Serializable;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/18 14:52
 */
public class JinGuBang implements Serializable {
    public float h = 10;
    public float d = 1;

    public void big(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /= 2;
        this.h /= 2;
    }
}
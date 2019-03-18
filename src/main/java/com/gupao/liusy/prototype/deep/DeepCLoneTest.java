package com.gupao.liusy.prototype.deep;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/18 15:03
 */
public class DeepCLoneTest {
    public static void main(String[] args) {
        SunWukong sunWukong = new SunWukong();

        SunWukong deepClone = (SunWukong) sunWukong.deepClone();

        SunWukong shallowClone = sunWukong.shallowClone(sunWukong);

        System.out.println("浅克隆金箍棒地址比较："+(sunWukong.jinGuBang == shallowClone.jinGuBang));
        System.out.println("深克隆金箍棒地址比较："+(sunWukong.jinGuBang == deepClone.jinGuBang));
    }
}
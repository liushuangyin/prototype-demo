package com.gupao.liusy.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/18 14:37
 */
public class PrototypeTest {
    public static void main(String[] args) {
        PrototypeA a = new PrototypeA();
        a.setUsername("liusy");
        List<String> hobbies = new ArrayList<String>();
        //hobbies.add("乒乓球");
        a.setHobbies(hobbies);
        a.setAge(20);
        a.setPassword("test");
        System.out.println("对象本身的地址"+a);
        System.out.println("对象中引用类型地址的值："+a.getHobbies());
        Client client = new Client();
        PrototypeA  clone = (PrototypeA) client.startClone(a);
        System.out.println("克隆对象本身的地址"+clone);
        System.out.println("克隆对象中引用类型地址的值："+clone.getHobbies());
        System.out.println(a.getHobbies() == clone.getHobbies());

        //浅克隆
    }
}
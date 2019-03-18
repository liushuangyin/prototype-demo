package com.gupao.liusy.prototype.simple;

import sun.plugin.perf.PluginRollup;

import java.util.List;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/18 14:33
 */
public class PrototypeA implements Prototype{

    private String username;

    private String password;

    private List<String> hobbies;

    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Prototype clone() {
        PrototypeA prototypeA = new PrototypeA();
        prototypeA.setAge(this.age);
        prototypeA.setUsername(this.username);
        prototypeA.setPassword(this.password);
        prototypeA.setHobbies(this.hobbies);
        return prototypeA;
    }
}
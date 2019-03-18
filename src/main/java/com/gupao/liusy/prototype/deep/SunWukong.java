package com.gupao.liusy.prototype.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/18 14:51
 */
public class SunWukong extends Monkey implements Cloneable, Serializable {
    public JinGuBang jinGuBang;

    public SunWukong(){
        this.jinGuBang = new JinGuBang();
        this.birthday = new Date();
    }

    //可能会出现单例会被破坏的问题
    //和单例模式有点唱反调的意思
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }


    /**
     * 深克隆，金箍棒和生日是不同的
     */
    public Object deepClone(){
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            SunWukong copy = (SunWukong)ois.readObject();
            copy.birthday = new Date();
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 浅克隆
     */
    public SunWukong shallowClone(SunWukong target){

        SunWukong sunWukong = new SunWukong();
        sunWukong.weight = target.weight;
        sunWukong.age = target.age;
        sunWukong.jinGuBang = target.jinGuBang;
        sunWukong.birthday = new Date();
        return  sunWukong;
    }
}
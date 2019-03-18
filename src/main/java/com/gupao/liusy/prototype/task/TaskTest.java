package com.gupao.liusy.prototype.task;

import java.util.Date;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/18 15:13
 */
public class TaskTest {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        UserEntity user = new UserEntity();
        user.setBirthday(date);
        System.out.println(user.getBirthday());

        UserCloneEntity cloneEntity = new UserCloneEntity();
        cloneEntity.setBirthday(date);
        System.out.println(cloneEntity.getBirthday());
        Thread.sleep(2000);
        date.setTime(System.currentTimeMillis());
        System.out.println(user.getBirthday());
        System.out.println(cloneEntity.getBirthday());
        //生日不变
    }
}
package com.gupao.liusy.prototype.task;

import java.util.Date;

/**
 * 说明：
 *
 * @author liusy
 * @date 2019/3/18 15:11
 */
public class UserCloneEntity {
    private String username;

    private String sex;

    private Integer age;

    private String mobile;

    private String email;

    private Date birthday;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        if(birthday != null){
            return (Date) birthday.clone();
        }
        return birthday;
    }

    public void setBirthday(Date birthday) {
        if (birthday != null) {
            this.birthday = (Date) birthday.clone();
        } else {
            birthday = null;
        }

    }
}
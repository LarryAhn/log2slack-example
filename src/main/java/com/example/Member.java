package com.example;

import java.io.Serializable;

/**
 * Created by Ahn on 2017. 4. 5..
 */
public class Member implements Serializable {

    private String name;

    private String nickName;

    public Member() {
    }

    public Member(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

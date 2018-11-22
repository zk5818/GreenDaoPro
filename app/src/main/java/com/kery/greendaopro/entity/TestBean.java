package com.kery.greendaopro.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2018/11/21.
 */
@Entity
public class TestBean {
    @Id
    private Long id;
    private String name;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Generated(hash = 1979658847)
    public TestBean(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    @Generated(hash = 2087637710)
    public TestBean() {
    }
}

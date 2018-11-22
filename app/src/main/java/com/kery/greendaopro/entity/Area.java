package com.kery.greendaopro.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class Area {
    @Id
    private Long id;
    private String code;

    private String name;

    private String parentCode;

    private String childCode;

    private boolean isSelected;

    public boolean getIsSelected() {
        return this.isSelected;
    }

    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public String getChildCode() {
        return this.childCode;
    }

    public void setChildCode(String childCode) {
        this.childCode = childCode;
    }

    public String getParentCode() {
        return this.parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Generated(hash = 1329520238)
    public Area(Long id, String code, String name, String parentCode,
                String childCode, boolean isSelected) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.parentCode = parentCode;
        this.childCode = childCode;
        this.isSelected = isSelected;
    }

    @Generated(hash = 179626505)
    public Area() {
    }


}

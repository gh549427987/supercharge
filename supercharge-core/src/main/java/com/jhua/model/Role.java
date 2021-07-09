package com.jhua.model;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
    private Long role_id;

    private String name;

    private Integer level;

    private String description;

    private String data_scope;

    private String create_by;

    private String update_by;

    private Date create_time;

    private Date update_time;

    private static final long serialVersionUID = 1L;

    public Role(Long role_id, String name, Integer level, String description, String data_scope, String create_by, String update_by, Date create_time, Date update_time) {
        this.role_id = role_id;
        this.name = name;
        this.level = level;
        this.description = description;
        this.data_scope = data_scope;
        this.create_by = create_by;
        this.update_by = update_by;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public Role() {
        super();
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getData_scope() {
        return data_scope;
    }

    public void setData_scope(String data_scope) {
        this.data_scope = data_scope == null ? null : data_scope.trim();
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by == null ? null : create_by.trim();
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by == null ? null : update_by.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
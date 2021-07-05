package com.jhua.model;

import java.io.Serializable;
import java.util.Date;

public class Sequence implements Serializable {
    private Long id;

    private String name;

    private Long value;

    private Long max_value;

    private Integer step;

    private Integer version;

    private Date create_time;

    private Date update_time;

    private static final long serialVersionUID = 1L;

    public Sequence(Long id, String name, Long value, Long max_value, Integer step, Integer version, Date create_time, Date update_time) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.max_value = max_value;
        this.step = step;
        this.version = version;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public Sequence() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Long getMax_value() {
        return max_value;
    }

    public void setMax_value(Long max_value) {
        this.max_value = max_value;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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
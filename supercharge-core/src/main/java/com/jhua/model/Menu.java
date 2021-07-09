package com.jhua.model;

import java.io.Serializable;
import java.util.Date;

public class Menu implements Serializable {
    private Long menu_id;

    private Long pid;

    private Integer sub_count;

    private Integer type;

    private String title;

    private String name;

    private String component;

    private Integer menu_sort;

    private String icon;

    private String path;

    private Boolean i_frame;

    private Boolean cache;

    private Boolean hidden;

    private String permission;

    private String create_by;

    private String update_by;

    private Date create_time;

    private Date update_time;

    private static final long serialVersionUID = 1L;

    public Menu(Long menu_id, Long pid, Integer sub_count, Integer type, String title, String name, String component, Integer menu_sort, String icon, String path, Boolean i_frame, Boolean cache, Boolean hidden, String permission, String create_by, String update_by, Date create_time, Date update_time) {
        this.menu_id = menu_id;
        this.pid = pid;
        this.sub_count = sub_count;
        this.type = type;
        this.title = title;
        this.name = name;
        this.component = component;
        this.menu_sort = menu_sort;
        this.icon = icon;
        this.path = path;
        this.i_frame = i_frame;
        this.cache = cache;
        this.hidden = hidden;
        this.permission = permission;
        this.create_by = create_by;
        this.update_by = update_by;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public Menu() {
        super();
    }

    public Long getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(Long menu_id) {
        this.menu_id = menu_id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Integer getSub_count() {
        return sub_count;
    }

    public void setSub_count(Integer sub_count) {
        this.sub_count = sub_count;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component == null ? null : component.trim();
    }

    public Integer getMenu_sort() {
        return menu_sort;
    }

    public void setMenu_sort(Integer menu_sort) {
        this.menu_sort = menu_sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Boolean getI_frame() {
        return i_frame;
    }

    public void setI_frame(Boolean i_frame) {
        this.i_frame = i_frame;
    }

    public Boolean getCache() {
        return cache;
    }

    public void setCache(Boolean cache) {
        this.cache = cache;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
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
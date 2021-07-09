package com.jhua.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Long id;

    private String user_id;

    private Long dept_id;

    private String username;

    private String nickname;

    private String gender;

    private String phone;

    private String email;

    private String avatar_name;

    private String avatar_path;

    private String password;

    private Boolean is_admin;

    private Long enabled;

    private String create_by;

    private String update_by;

    private Date pwd_reset_time;

    private Date create_time;

    private Date update_time;

    private static final long serialVersionUID = 1L;

    public User(Long id, String user_id, Long dept_id, String username, String nickname, String gender, String phone, String email, String avatar_name, String avatar_path, String password, Boolean is_admin, Long enabled, String create_by, String update_by, Date pwd_reset_time, Date create_time, Date update_time) {
        this.id = id;
        this.user_id = user_id;
        this.dept_id = dept_id;
        this.username = username;
        this.nickname = nickname;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.avatar_name = avatar_name;
        this.avatar_path = avatar_path;
        this.password = password;
        this.is_admin = is_admin;
        this.enabled = enabled;
        this.create_by = create_by;
        this.update_by = update_by;
        this.pwd_reset_time = pwd_reset_time;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    public Long getDept_id() {
        return dept_id;
    }

    public void setDept_id(Long dept_id) {
        this.dept_id = dept_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAvatar_name() {
        return avatar_name;
    }

    public void setAvatar_name(String avatar_name) {
        this.avatar_name = avatar_name == null ? null : avatar_name.trim();
    }

    public String getAvatar_path() {
        return avatar_path;
    }

    public void setAvatar_path(String avatar_path) {
        this.avatar_path = avatar_path == null ? null : avatar_path.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Boolean getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(Boolean is_admin) {
        this.is_admin = is_admin;
    }

    public Long getEnabled() {
        return enabled;
    }

    public void setEnabled(Long enabled) {
        this.enabled = enabled;
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

    public Date getPwd_reset_time() {
        return pwd_reset_time;
    }

    public void setPwd_reset_time(Date pwd_reset_time) {
        this.pwd_reset_time = pwd_reset_time;
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
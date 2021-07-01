package com.jhua.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
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

    public User(String user, String host, String select_priv, String insert_priv, String update_priv, String delete_priv, String create_priv, String drop_priv, String reload_priv, String shutdown_priv, String process_priv, String file_priv, String grant_priv, String references_priv, String index_priv, String alter_priv, String show_db_priv, String super_priv, String create_tmp_table_priv, String lock_tables_priv, String execute_priv, String repl_slave_priv, String repl_client_priv, String create_view_priv, String show_view_priv, String create_routine_priv, String alter_routine_priv, String create_user_priv, String event_priv, String trigger_priv, String create_tablespace_priv, String ssl_type, Integer max_questions, Integer max_updates, Integer max_connections, Integer max_user_connections, String plugin, String password_expired, Date password_last_changed, Short password_lifetime, String account_locked, String create_role_priv, String drop_role_priv, Short password_reuse_history, Short password_reuse_time, String password_require_current) {
    }

}
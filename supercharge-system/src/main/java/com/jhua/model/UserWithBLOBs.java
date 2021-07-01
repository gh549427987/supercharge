package com.jhua.model;

import java.io.Serializable;
import java.util.Date;

public class UserWithBLOBs extends User implements Serializable {
    private byte[] ssl_cipher;

    private byte[] x509_issuer;

    private byte[] x509_subject;

    private String authentication_string;

    private String user_attributes;

    private static final long serialVersionUID = 1L;

    public UserWithBLOBs(String user, String host, String select_priv, String insert_priv, String update_priv, String delete_priv, String create_priv, String drop_priv, String reload_priv, String shutdown_priv, String process_priv, String file_priv, String grant_priv, String references_priv, String index_priv, String alter_priv, String show_db_priv, String super_priv, String create_tmp_table_priv, String lock_tables_priv, String execute_priv, String repl_slave_priv, String repl_client_priv, String create_view_priv, String show_view_priv, String create_routine_priv, String alter_routine_priv, String create_user_priv, String event_priv, String trigger_priv, String create_tablespace_priv, String ssl_type, Integer max_questions, Integer max_updates, Integer max_connections, Integer max_user_connections, String plugin, String password_expired, Date password_last_changed, Short password_lifetime, String account_locked, String create_role_priv, String drop_role_priv, Short password_reuse_history, Short password_reuse_time, String password_require_current, byte[] ssl_cipher, byte[] x509_issuer, byte[] x509_subject, String authentication_string, String user_attributes) {
        super(user, host, select_priv, insert_priv, update_priv, delete_priv, create_priv, drop_priv, reload_priv, shutdown_priv, process_priv, file_priv, grant_priv, references_priv, index_priv, alter_priv, show_db_priv, super_priv, create_tmp_table_priv, lock_tables_priv, execute_priv, repl_slave_priv, repl_client_priv, create_view_priv, show_view_priv, create_routine_priv, alter_routine_priv, create_user_priv, event_priv, trigger_priv, create_tablespace_priv, ssl_type, max_questions, max_updates, max_connections, max_user_connections, plugin, password_expired, password_last_changed, password_lifetime, account_locked, create_role_priv, drop_role_priv, password_reuse_history, password_reuse_time, password_require_current);
        this.ssl_cipher = ssl_cipher;
        this.x509_issuer = x509_issuer;
        this.x509_subject = x509_subject;
        this.authentication_string = authentication_string;
        this.user_attributes = user_attributes;
    }

    public byte[] getSsl_cipher() {
        return ssl_cipher;
    }

    public void setSsl_cipher(byte[] ssl_cipher) {
        this.ssl_cipher = ssl_cipher;
    }

    public byte[] getX509_issuer() {
        return x509_issuer;
    }

    public void setX509_issuer(byte[] x509_issuer) {
        this.x509_issuer = x509_issuer;
    }

    public byte[] getX509_subject() {
        return x509_subject;
    }

    public void setX509_subject(byte[] x509_subject) {
        this.x509_subject = x509_subject;
    }

    public String getAuthentication_string() {
        return authentication_string;
    }

    public void setAuthentication_string(String authentication_string) {
        this.authentication_string = authentication_string == null ? null : authentication_string.trim();
    }

    public String getUser_attributes() {
        return user_attributes;
    }

    public void setUser_attributes(String user_attributes) {
        this.user_attributes = user_attributes == null ? null : user_attributes.trim();
    }
}
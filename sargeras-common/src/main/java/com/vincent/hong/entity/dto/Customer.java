package com.vincent.hong.entity.dto;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by vincent.hong on 2017/9/2.
 */
@Entity
@Table(name = "CUSTOMER")
@SQLDelete(sql = "")
@Where(clause = "")
public class Customer {
    @Id
    @Column(name = "CUS_CODE")
    private String cusCode;

    @Column(name = "CUS_NAME")
    private String cusName;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "NICKNAME")
    private String nickname;

    @Column(name = "IDN")
    private String idn;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "MPHONE")
    private String mphone;

    @Column(name = "ADDR")
    private String addr;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CREATE_DT")
    private Date createDt;

    public String getCusCode() {
        return cusCode;
    }

    public void setCusCode(String cusCode) {
        this.cusCode = cusCode;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIdn() {
        return idn;
    }

    public void setIdn(String idn) {
        this.idn = idn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "cusCode='" + cusCode + '\'' +
                ", cusName='" + cusName + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", idn='" + idn + '\'' +
                ", status='" + status + '\'' +
                ", mphone='" + mphone + '\'' +
                ", addr='" + addr + '\'' +
                ", email='" + email + '\'' +
                ", createDt=" + createDt +
                '}';
    }
}

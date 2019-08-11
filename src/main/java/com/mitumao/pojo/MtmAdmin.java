package com.mitumao.pojo;

import javax.persistence.*;

@Table(name = "mtm_admin")
public class MtmAdmin {
    @Id
    private Short id;

    private String uuid;

    private String username;

    private String password;

    @Column(name = "pwd_expiry_date")
    private String pwdExpiryDate;

    @Column(name = "failed_logins")
    private String failedLogins;

    private String authority;

    private String description;

    @Column(name = "contact_way")
    private String contactWay;

    private String address;

    /**
     * @return id
     */
    public Short getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return pwd_expiry_date
     */
    public String getPwdExpiryDate() {
        return pwdExpiryDate;
    }

    /**
     * @param pwdExpiryDate
     */
    public void setPwdExpiryDate(String pwdExpiryDate) {
        this.pwdExpiryDate = pwdExpiryDate;
    }

    /**
     * @return failed_logins
     */
    public String getFailedLogins() {
        return failedLogins;
    }

    /**
     * @param failedLogins
     */
    public void setFailedLogins(String failedLogins) {
        this.failedLogins = failedLogins;
    }

    /**
     * @return authority
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * @param authority
     */
    public void setAuthority(String authority) {
        this.authority = authority;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return contact_way
     */
    public String getContactWay() {
        return contactWay;
    }

    /**
     * @param contactWay
     */
    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
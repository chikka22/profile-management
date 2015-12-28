package com.sample.dao;

import javax.persistence.*;

/**
 * Created by vgandsa on 12/21/15.
 */
@Entity
@Table(name="account")
public class Account {


    public Account(String accountName, long accountId, String value) {
        this.accountName = accountName;
        this.accountId = accountId;
        this.value = value;
    }

    long id;
    String value;
    String accountName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",
            unique = true,
            nullable = false,
            scale = 0)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "value",
            nullable = false
            )
    public Long getValue() {
        return this.id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @OneToOne(fetch = FetchType.LAZY, targetEntity = Order.class, cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "account_id", nullable = true)
    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    long accountId;
    @Column(name = "account_name",
            nullable = true )
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", value='" + value + '\'' +
                ", accountId=" + accountId +
                '}';
    }

}

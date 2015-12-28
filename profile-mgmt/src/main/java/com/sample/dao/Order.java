package com.sample.dao;

import javax.persistence.*;

/**
 * Created by vgandsa on 12/21/15.
 */
@Entity
@Table(name="order")
public class Order {

    long id;
    long accountId;

    @Id
    @Column(name = "order_id",
            unique = true,
            nullable = false
            )
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.LAZY, targetEntity = Account.class, cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "account_id", nullable = true)
    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }


}

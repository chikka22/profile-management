package com.sample.dao;

import com.sample.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by vgandsa on 12/21/15.
 */
public class AccountDAO {
  Session session=  HibernateUtil.currentSession();

    @SuppressWarnings("unchecked")
    public Account findAccount(Long id) {
        return (Account) HibernateUtil.currentSession().get(Account.class, id);

    }

    @SuppressWarnings("unchecked")
    public List<Account> searchEmployee(String id) {
        Query query = HibernateUtil.currentSession().createQuery("SELECT e from Account a where a.id=: id");
        query.setString("id", id);
        List<Account> e=(List<Account>)query.list();
        return e;
    }

    public void addAccount(Account account){

       session.save(account);
    }
    public void changeAccount(Account account){

        Query query = HibernateUtil.currentSession().createQuery("update  Account a set a.account_name=: name");
        query.setString("name", account.accountName);


    }
    public void deleteAccount(Account a){

           session.delete(a);

    }
}

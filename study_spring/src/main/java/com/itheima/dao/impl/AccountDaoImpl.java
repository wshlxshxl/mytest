package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

public class AccountDaoImpl implements AccountDao {

    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public List<Account> findAll() {
        try{
            return runner.query("select * from account",new BeanListHandler<Account>(Account.class));
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}

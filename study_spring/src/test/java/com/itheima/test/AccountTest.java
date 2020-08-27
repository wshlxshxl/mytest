package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AccountTest {
    @Autowired
    private AccountService as;

    @Test
    public void testFindAll(){
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        AccountService as = ac.getBean("accountService",AccountService.class);
        List<Account> accounts = as.findAll();
        for(Account account:accounts){
            System.out.println(account);
        }
    }
}

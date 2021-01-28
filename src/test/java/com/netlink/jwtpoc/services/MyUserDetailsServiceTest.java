package com.netlink.jwtpoc.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(MockitoJUnitRunner.class)
public class MyUserDetailsServiceTest {


    @InjectMocks
    MyUserDetailsService myUserDetailsService;


    @Test
    public void loadUserByUsernameTestPositive(){
       // user=new User("abc", "cds", null);

       UserDetails response= myUserDetailsService.loadUserByUsername("Thomas");

        Assert.assertTrue(response.getPassword()=="Medhi");

    }

    @Test
    public void loadUsernameTestNegative(){
        UserDetails response= myUserDetailsService.loadUserByUsername("aaaa");
        Assert.assertFalse(response==null);
    }
}

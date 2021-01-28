package com.netlink.jwtpoc.security;

import com.netlink.jwtpoc.filters.JwtrequestFilter;
import com.netlink.jwtpoc.services.MyUserDetailsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SecurityConfigurerTest {

    @Mock
    MyUserDetailsService myUserDetailsService;

    @Mock
    JwtrequestFilter jwtrequestFilter;

    @InjectMocks
    SecurityConfigurer securityConfigurer;


    @Test
    public void configureTestPositive(){

    }

}

package com.netlink.jwtpoc.filters;

import com.netlink.jwtpoc.services.MyUserDetailsService;
import com.netlink.jwtpoc.util.JwtUtil;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.mock.web.MockFilterChain;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//@RunWith(MockitoJUnitRunner.class)
public class JwtRequestFilterTest {

    private MockHttpServletRequest request;
    private MockHttpServletResponse response;
    private MockFilterChain chain;
    private OncePerRequestFilter filter;
    private HttpServlet servlet;

    private List<OncePerRequestFilter> invocations;
    @Mock
    MyUserDetailsService myUserDetailsService;

    @Mock
    JwtUtil jwtUtil;

    @Before
    @SuppressWarnings("serial")
    public  void setUp(){
        this.servlet=new HttpServlet() {
        };
        this.response=new MockHttpServletResponse();
        this.response=new MockHttpServletResponse();
        this.chain=new MockFilterChain();
        this.invocations=new ArrayList<>();
        this.filter=new OncePerRequestFilter(){

            @Override
            protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
                JwtRequestFilterTest.this.invocations.add(this);
                filterChain.doFilter(httpServletRequest, httpServletResponse);
            }
        };
    }



/*    @Test
    public void doFilterOnce() throws ServletException, IOException {
        this.filter.doFilter(this.request, this.response, this.chain);

        Assertions.assertThat(this.invocations).containsOnly(this.filter);
    }*/

}

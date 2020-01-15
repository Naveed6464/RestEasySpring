/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naveed.demo.spring.web.controller;

import com.naveed.demo.spring.domain.services.HelloService;
import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 14, 2020
 */
@Path("/api")
public class HelloController {

    @Autowired
    HelloService helloService;

    @GET
    public String getFoo(@Context ServletContext context) {
        return "Hello Rest Easy";
    }

    @GET
    @Path("/hello")
    public String hello() {
        return helloService.hello();
    }
}

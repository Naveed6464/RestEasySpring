/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naveed.demo.spring.domain.services;

import org.springframework.stereotype.Component;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 14, 2020
 */
@Component
public class HelloService {

    public String hello() {
        return "Hello, world from Spring !";
    }
}

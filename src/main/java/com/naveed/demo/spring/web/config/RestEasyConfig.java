/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naveed.demo.spring.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import javax.ws.rs.Path;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 14, 2020
 */
@Configuration
@ComponentScan(basePackages = {"com.naveed.demo.spring.web.controller", "com.naveed.demo.spring.domain.services"}, includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Path.class))
public class RestEasyConfig {

}

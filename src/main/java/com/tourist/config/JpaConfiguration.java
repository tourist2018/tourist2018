package com.tourist.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
//@EnableJpaRepositories(basePackages = {"smartdev.vn.user.dao.repository", "smartdev.vn.sheet.dao.repository"})
//@EntityScan(basePackages = {"smartdev.vn.user.dao.entity", "smartdev.vn.sheet.dao.entity"})
//@ComponentScan(basePackages = {"smartdev.vn.user.manager", "smartdev.vn.sheet.manager"})
//@PropertySource("classpath:application.properties")


public class JpaConfiguration {
}

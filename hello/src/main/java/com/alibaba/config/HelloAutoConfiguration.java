package com.alibaba.config;


import com.alibaba.bean.HelloBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloAutoConfigProperties.class)
@ConditionalOnClass(HelloBean.class)
public class HelloAutoConfiguration {

    @Autowired
    private HelloAutoConfigProperties helloAutoConfigProperties;

    @Bean
    @ConditionalOnMissingBean
    public HelloBean helloBean() {
        HelloBean helloBean = new HelloBean();
        helloBean.setName(helloAutoConfigProperties.getName());
        return helloBean;
    }

}

package com.jabre.sfgdi.config;

import com.jabre.sfgdi.examples.FakeDataSource;
import com.jabre.sfgdi.examples.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Author : Jabre
 * Created : 12/10/2021, Friday
 **/
@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties" })
public class PropertyConfig {

    @Value("${jabre.user}")
    String user;

    @Value("${jabre.password}")
    String password;

    @Value("${jabre.url}")
    String url;

    @Value("${jabre.jms.user}")
    String jmsUser;

    @Value("${jabre.jms.password}")
    String jmsPassword;

    @Value("${jabre.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        //fakeDataSource.setUser(environment.getProperty("USER"));
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        //fakeJmsBroker.setUser(environment.getProperty("USER"));
        fakeJmsBroker.setUser(jmsUser);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }




//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
//        return propertySourcesPlaceholderConfigurer;
//    }

}

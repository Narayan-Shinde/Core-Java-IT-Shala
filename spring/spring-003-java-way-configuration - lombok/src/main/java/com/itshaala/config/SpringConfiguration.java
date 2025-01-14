package com.itshaala.config;

import com.itshaala.controller.CourseController;
import com.itshaala.dao.CourseDao;
import com.itshaala.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
public class SpringConfiguration {

    @Bean
    public CourseDao getCourseDao() {
        return new CourseDao();
    }

    @Bean
    public CourseService getCourseService() {
        return new CourseService(getCourseDao());
    }

    @Bean
    public CourseController getCourseController() {
        return new CourseController(getCourseService());
    }

}

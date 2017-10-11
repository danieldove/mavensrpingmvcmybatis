package com.example.service;

import com.example.domain.TeacherEntity;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml",
        "classpath:spring/spring-mybatis.xml" })
public class TestTeacherService4Mybatis {
    private static final Logger logger = Logger
            .getLogger(TestTeacherService4Mybatis.class);

    @Autowired
    private TeacherService teacherService;

    @Test
    public void get() {
        TeacherEntity teacherEntity = teacherService.get(1);
       logger.info(teacherEntity.getTname());
    }
}

package com.example.dao;

import com.example.domain.TeacherEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {
    TeacherEntity selectByPrimaryKey(long id);
}

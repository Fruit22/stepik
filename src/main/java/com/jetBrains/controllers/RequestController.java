package com.jetBrains.controllers;

import com.jetBrains.dao.LessonDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @Autowired
    LessonDaoImpl lessonDao;

    @RequestMapping("lessons={lessonId}")
    public String requestForStepik(@PathVariable int lessonId) {
        return lessonDao.getSteps(lessonId);
    }
}

package com.jetBrains.controllers;

import com.jetBrains.dao.LessonDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @Autowired
    LessonDaoImpl lessonDao;

    /**
     * Обрабатывает GET запрос типа: /lesson=n, где n это id урока (lesson)
     *
     * @param lessonId идентификатор урока (lesson)
     * @return возвращает список шагов (steps) в формате JSON
     */
    @RequestMapping(value = "lessons={lessonId}", method = RequestMethod.GET)
    public String requestForStepik(@PathVariable int lessonId) {
        return lessonDao.getSteps(lessonId);
    }
}
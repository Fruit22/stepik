package com.jetBrains.model;

import org.springframework.stereotype.Service;

@Service
public class LessonSimpleBuilder {
    public Lesson build() {
        Lesson lesson = new Lesson();
        return lesson;
    }
}
package com.jetBrains.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LessonBuilder {
    private int lessonId;
    private List<Integer> stepsId;

    public LessonBuilder setId(int lessonId) {
        this.lessonId = lessonId;
        return this;
    }

    public LessonBuilder setStepsId(List<Integer> stepsId) {
        this.stepsId = stepsId;
        return this;
    }

    public Lesson build() {
        Lesson lesson = new Lesson(lessonId, stepsId == null ? new ArrayList<>() : stepsId);
        resetValues();
        return lesson;
    }

    private void resetValues() {
        this.lessonId = 0;
        this.stepsId = null;
    }
}

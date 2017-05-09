package com.jetBrains.model;

import java.util.List;

public class Lesson {
    private int id;
    private List<Integer> stepsId;

    public Lesson(int lessonId, List<Integer> stepsId) {
        this.id = lessonId;
        this.stepsId = stepsId;
    }

    public List<Integer> getSteps() {
        return stepsId;
    }

    public void setSteps(List<Integer> stepsId) {
        this.stepsId = stepsId;
    }

    public void addStep(int stepId) {
        this.stepsId.add(stepId);
    }
}

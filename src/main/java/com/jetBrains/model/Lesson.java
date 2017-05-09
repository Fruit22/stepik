package com.jetBrains.model;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private List<Integer> stepsId = new ArrayList<>();

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
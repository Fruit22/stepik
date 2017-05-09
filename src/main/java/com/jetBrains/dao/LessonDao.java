package com.jetBrains.dao;

import java.io.IOException;

/**
 * Created by fruit on 09.05.2017.
 */
public interface LessonDao {

    /**
     *
     * @param id - идентификатор урока (lesson)
     * @return возвращает список шагов (steps) в формате JSON
     */
    public String getSteps(int id) throws IOException;
}

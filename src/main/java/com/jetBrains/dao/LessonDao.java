package com.jetBrains.dao;

import java.io.IOException;

/**
 * Промежуточный слой для получения данных в формате JSON при взаимодействии со Stepik API
 */
public interface LessonDao {

    /**
     *
     * @param id - идентификатор урока (lesson)
     * @return возвращает список шагов (steps) в формате JSON
     */
    public String getSteps(int id) throws IOException;
}
package com.jetBrains.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jetBrains.model.Lesson;
import com.jetBrains.model.LessonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


@Service
public class LessonDaoImpl implements LessonDao {

    @Autowired
    ObjectMapper mapper;

    @Autowired
    LessonBuilder lessonBuilder;

    @Override
    @Cacheable("lessons")
    public String getSteps(int id) {
        JsonNode jsonNode;
        try {
            URL url = new URL("https://stepik.org/api/lessons/" + id);
            jsonNode = mapper.readValue(url, JsonNode.class).get("lessons")
                    .get(0).get("steps");
            Lesson lesson = lessonBuilder.build();
            for (JsonNode step : jsonNode) {
                lesson.addStep(step.asInt());
            }
            return mapper.writeValueAsString(lesson);
        } catch (MalformedURLException e) {
            return "URL is incorrect";
        } catch (JsonProcessingException e) {
            return "JSON processing error";
        } catch (FileNotFoundException e) {
            return "Not found";
        } catch (IOException e) {
            return "IO error";
        }
    }
}

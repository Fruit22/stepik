package com.jetBrains;

import com.jetBrains.dao.LessonDaoImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StepikApplicationTests {

	@Autowired
	LessonDaoImpl lessonDao;

	Logger log = Logger.getLogger(StepikApplicationTests.class.getName());

	@Test
	public void performanceTest() {
		long start = System.nanoTime();
		lessonDao.getSteps(1);
		long end = System.nanoTime();
		log.info("Time of the first request: " + (end - start));

		start = System.nanoTime();
		lessonDao.getSteps(1);
		end = System.nanoTime();
		log.info("Time of the second request: " + (end - start));
	}

}

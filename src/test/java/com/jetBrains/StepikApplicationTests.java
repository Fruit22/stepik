package com.jetBrains;

import com.jetBrains.dao.LessonDaoImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StepikApplicationTests {

	@Autowired
	LessonDaoImpl lessonDao;

	@Test
	public void performanceTest() {
		long start = System.nanoTime();
		lessonDao.getSteps(1);
		long end = System.nanoTime();
		System.out.println("Time of the first request: " + (end - start));

		start = System.nanoTime();
		lessonDao.getSteps(1);
		end = System.nanoTime();
		System.out.println("Time of the second request: " + (end - start));
	}

}

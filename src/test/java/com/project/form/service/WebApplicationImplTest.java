package com.project.form.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import com.project.form.util.WebApplicationUtil;

@RunWith(SpringRunner.class)

@SpringBootTest

class WebApplicationImplTest {

	@MockBean
	private WebApplicationBean conversion;

	@Autowired
	WebApplicationUtil convertUtil;

	@Test
	void testToWords_0() {
		int number = 0;
		String expected = "Zero";
		String actual = convertUtil.convertToWords(Long.valueOf(number));
		assertEquals(expected, actual);

	}

	@Test
	void testToWords_1() {
		int number = 1;
		String expected = "One";
		String actual = convertUtil.convertToWords(Long.valueOf(number));
		assertEquals(expected, actual);
	}

	@Test
	void testToWords_31() {
		int number = 31;
		String expected = "Thirty One";
		String actual = convertUtil.convertToWords(Long.valueOf(number));
		assertEquals(expected, actual);
	}

	@Test
	void testName() {
		String actual = convertUtil.name("name");
		String expected = "name";
		assertEquals(expected, actual);
	}

}
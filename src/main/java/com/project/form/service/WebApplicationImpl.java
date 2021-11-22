package com.project.form.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.form.util.WebApplicationUtil;

/**
 * Service class
 * 
 * @author Kanika
 *
 */
@Service
public class WebApplicationImpl implements WebApplication {

	@Autowired
	WebApplicationUtil convertUtil;

	/*
	 * (non-Javadoc)
	 * 
	 *
	 */
	@Override
	public String convertIntoWords(Long number) {
		return convertUtil.convertToWords(number);
	}

	@Override
	public String name(String name) {
		return convertUtil.name(name);
	}

}

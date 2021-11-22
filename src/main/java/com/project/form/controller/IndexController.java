package com.project.form.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.form.service.WebApplication;
import com.project.form.service.WebApplicationBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Index controller
 * 
 * @author Kanika
 *
 */
@RestController
public class IndexController {

	@Autowired
	WebApplication conversion;
	
	
	@RequestMapping("convert/number={number}&name={name}")
	@ResponseBody
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<WebApplicationBean> index(@PathVariable(value = "number") Long number,
			@PathVariable(value = "name") String name) {

		WebApplicationBean akqaTestBean = new WebApplicationBean();
		akqaTestBean.setNumber(conversion.convertIntoWords(number));
		akqaTestBean.setName(name);
		return new ResponseEntity<>(akqaTestBean, HttpStatus.OK);

	}

}

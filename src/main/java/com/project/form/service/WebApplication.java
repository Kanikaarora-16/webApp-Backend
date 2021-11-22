package com.project.form.service;

/**
 * 
 * 
 * @author Kanika
 *
 */
public interface WebApplication {
	/**
	 * Convert English number into Words
	 * 
	 * @param number
	 * @return number in words as string
	 */
	public String convertIntoWords(Long number);

	public String name(String name);

}

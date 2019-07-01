package com.passencoderdecoderwebservice.vo;

import org.springframework.stereotype.Component;

@Component
public class PassEncoderDecoderWebserviceInputVO {
	private String inputString;
	private String key;
	/**
	 * @return the inputString
	 */
	public String getInputString() {
		return inputString;
	}
	/**
	 * @param inputString the inputString to set
	 */
	public void setInputString(String inputString) {
		this.inputString = inputString;
	}
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	@Override
	public String toString() {
		return "PassEncoderDecoderWebserviceIInputVO [inputString=" + inputString + ", key=" + key + "]";
	}
	
	
}

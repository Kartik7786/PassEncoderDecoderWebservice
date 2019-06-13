package com.passencoderdecoderwebservice.vo;

import org.springframework.stereotype.Component;

@Component
public class PassEncoderDecoderWebserviceIEncryptInputVO {
	private String encryptString;
	private String decryptString;

	public String getEncryptString() {
		return encryptString;
	}

	public void setEncryptString(String encryptString) {
		this.encryptString = encryptString;
	}

	public String getDecryptString() {
		return decryptString;
	}

	public void setDecryptString(String decryptString) {
		this.decryptString = decryptString;
	}

	@Override
	public String toString() {
		return "PassEncoderDecoderWebserviceIEncryptVO [encryptString=" + encryptString + ", decryptString="
				+ decryptString + "]";
	}
}

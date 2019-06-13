package com.passencoderdecoderwebservice.vo;

public class PassEncoderDecoderWebserviceDecryptInputVO {

	private String decryptString;
	private String decryptKey;

	public String getDecryptString() {
		return decryptString;
	}

	public void setDecryptString(String decryptString) {
		this.decryptString = decryptString;
	}

	public String getDecryptKey() {
		return decryptKey;
	}

	public void setDecryptKey(String decryptKey) {
		this.decryptKey = decryptKey;
	}

	@Override
	public String toString() {
		return "PassEncoderDecoderWebserviceDecryptVO [decryptString=" + decryptString + ", decryptKey=" + decryptKey
				+ ", getDecryptString()=" + getDecryptString() + ", getDecryptKey()=" + getDecryptKey()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}

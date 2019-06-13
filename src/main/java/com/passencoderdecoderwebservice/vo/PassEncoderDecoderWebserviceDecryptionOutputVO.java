package com.passencoderdecoderwebservice.vo;

public class PassEncoderDecoderWebserviceDecryptionOutputVO {

	private String decryptedString;

	/**
	 * @return the decryptedString
	 */
	public String getDecryptedString() {
		return decryptedString;
	}

	/**
	 * @param decryptedString the decryptedString to set
	 */
	public void setDecryptedString(String decryptedString) {
		this.decryptedString = decryptedString;
	}

	@Override
	public String toString() {
		return "PassEncoderDecoderWebserviceDecryptionOutputVO [decryptedString=" + decryptedString + "]";
	}

}

/**
 * 
 */
package com.example.cxfrest.domain;

/**
 * @author Westlake
 *
 */
public class WSException extends Exception {

	/**
	 * Default SerivalversionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Http Status Code
	 */
	private String statusCode;
	
	/**
	 * Error Code
	 */
	private String code;
	
	/**
	 * Error Message
	 */
	private String messageContent;
	
	/**
	 * Constructor
	 */
	public WSException() {
		super();
	}

	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the messageContent
	 */
	public String getMessageContent() {
		return messageContent;
	}

	/**
	 * @param messageContent the messageContent to set
	 */
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	
}

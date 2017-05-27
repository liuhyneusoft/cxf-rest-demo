package com.example.cxfrest.param;

import java.util.List;
import java.util.Map;

public class WSNativeParamter {
    private Map<String, String> formParam;
    private Map<String, String> queryParam;
    private List<String> pathParam;
    private Map<String, String> headerParam;
    private Object bodyParam;
    private String sendTimeOut;
    
    /**
     * @return the formParam
     */
    public Map<String, String> getFormParam() {
        return formParam;
    }

    /**
     * @param formParam the formParam to set
     */
    public void setFormParam(Map<String, String> formParam) {
        this.formParam = formParam;
    }

    /**
     * @return the queryParam
     */
    public Map<String, String> getQueryParam() {
        return queryParam;
    }

    /**
     * @param queryParam the queryParam to set
     */
    public void setQueryParam(Map<String, String> queryParam) {
        this.queryParam = queryParam;
    }

    /**
     * @return the pathParam
     */
    public List<String> getPathParam() {
        return pathParam;
    }

    /**
     * @param pathParam the pathParam to set
     */
    public void setPathParam(List<String> pathParam) {
        this.pathParam = pathParam;
    }

    /**
     * @return the headerParam
     */
    public Map<String, String> getHeaderParam() {
        return headerParam;
    }
    
    /**
     * @param headerParam the headerParam to set
     */
    public void setHeaderParam(Map<String, String> headerParam) {
        this.headerParam = headerParam;
    }

    /**
     * @return the bodyParam
     */
    public Object getBodyParam() {
        return bodyParam;
    }

    /**
     * @param bodyParam the bodyParam to set
     */
    public void setBodyParam(Object bodyParam) {
        this.bodyParam = bodyParam;
    }

	/**
	 * @return the sendTimeOut
	 */
	public String getSendTimeOut() {
		return sendTimeOut;
	}

	/**
	 * @param sendTimeOut the sendTimeOut to set
	 */
	public void setSendTimeOut(String sendTimeOut) {
		this.sendTimeOut = sendTimeOut;
	}

}

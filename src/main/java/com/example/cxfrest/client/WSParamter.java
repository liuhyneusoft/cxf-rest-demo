package com.example.cxfrest.client;

/**
 * Created by liuhaiyang on 2017/5/27.
 */

import java.util.List;
import java.util.Map;

public class WSParamter {
    protected Map<String, String> queryParam;
    protected List<String> pathParam;
    protected Map<String, String> headerParam;
    protected String sendTimeOut;

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
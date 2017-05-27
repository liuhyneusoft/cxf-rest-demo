package com.example.cxfrest.param;

import java.util.Map;

public class WSFormParamter extends WSParamter {
    private Map<String, String> formParam;
    
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

}

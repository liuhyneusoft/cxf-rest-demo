/**
 * 
 */
package com.example.cxfrest.domain;

import com.example.cxfrest.client.WSClient;
import com.example.cxfrest.param.*;
import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;

/**
 * @author Westlake
 *
 */
public class WSClientHelper {
	/**
     * WebService parameter (AuthToken)
     */
    public static final String WS_P_AUTHTOKEN = "AuthToken";
    
	/**
	 * WebService Object
	 */
	private static WSClient wsClient;
	
	/**
	 * Retrieve WebService instance object
	 */
	public static WSClient newInstance() {
		if (null == wsClient) {
			wsClient = new WSClient();
		}
		
		return wsClient;
	}
	
	/**
	 * Convert WebService result into Object
	 * @param plainJsonString
	 * @param classOfT
	 * @return
	 */
	public static Object convertWSWithObject(String plainJsonString, Class<?> classOfT) {
		if (StringUtils.isEmpty(plainJsonString) || null == classOfT) {
			return null;
		}
		
		Gson gson = new Gson();
        return gson.fromJson(plainJsonString, classOfT);
	}
	
	/**
	 * Convert WebService result into Object
	 * @param plainJsonString
	 * @param type
	 * @return
	 */
	public static Object convertWSWithObject(String plainJsonString, Type type) {
		if (StringUtils.isEmpty(plainJsonString) || null == type) {
			return null;
		}
		
		Gson gson = new Gson();
        return gson.fromJson(plainJsonString, type);
	}
	
	/**
	 * Get Post parameter Object
	 * @return
	 */
	public static WSPostParamter newPostParam() {
		return new WSPostParamter();
	}
	
	/**
	 * Get Post parameter Object for form
	 * @return
	 */
	public static WSFormParamter newFormParam() {
		return new WSFormParamter();
	}
	
	/**
	 * Get PUt parameter Object
	 * @return
	 */
	public static WSPutParamter newPutParam() {
		return new WSPutParamter();
	}
	
	/**
	 * Get Get parameter Object
	 * @return
	 */
	public static WSGetParamter newGetParam() {
		return new WSGetParamter();
	}
	
	/**
	 * Get Delete parameter Object
	 * @return
	 */
	public static WSDeleteParamter newDeleteParam() {
		return new WSDeleteParamter();
	}
}

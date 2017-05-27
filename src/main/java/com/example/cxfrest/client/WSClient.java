package com.example.cxfrest.client;

import com.example.cxfrest.constant.WSConst;
import com.example.cxfrest.domain.*;
import com.example.cxfrest.param.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;




public class WSClient {

    /**
     * Constructor
     */
    public WSClient() {
        // do nothing
    }

    /**
     * Communicate with WebService with HTTP POST.
     * @param hostUrl
     * @param functionPath
     * @param pathValues
     * @return
     * @throws WSException
     * @throws IOException
     */
    public String post(String hostUrl, String functionPath, List<String> pathValues)
            throws WSException, IOException {
        WSNativeParamter nativeWSParam = new WSNativeParamter();

        // Create Path parameters
        if (null != pathValues && pathValues.size() > 0) {
            nativeWSParam.setPathParam(pathValues);
        }

        // Communicate with WebService
        String returnVal = handleWS(hostUrl, functionPath, nativeWSParam, WSConst.WS_HTTP_POST);
        return returnVal;
    }

    /**
     * Communicate with WebService with HTTP POST.
     * @param wsAuthToken
     * @param hostUrl
     * @param functionPath
     * @param pathValues
     * @return
     * @throws WSException
     * @throws IOException
     */
    public String post(String wsAuthToken, String hostUrl, String functionPath, List<String> pathValues)
            throws WSException, IOException {
        WSNativeParamter nativeWSParam = new WSNativeParamter();

        // Create AuthToken
        Map<String, String> headerParam = null;
        if (!StringUtils.isEmpty(wsAuthToken)) {
            headerParam = new HashMap<String, String>();
            headerParam.put(WSClientHelper.WS_P_AUTHTOKEN, wsAuthToken);

            nativeWSParam.setHeaderParam(headerParam);
        }

        // Create Path parameters
        if (null != pathValues && pathValues.size() > 0) {
            nativeWSParam.setPathParam(pathValues);
        }

        // Communicate with WebService
        String returnVal = handleWS(hostUrl, functionPath, nativeWSParam, WSConst.WS_HTTP_POST);
        return returnVal;
    }

    /**
     * Communicate with WebService with HTTP POST.
     *
     * @param hostUrl The host's URL
     * @param functionPath The mapping path
     * @param wsParam Transfer parameters
     * @return The return value from the WebService
     * @throws IOException
     * @throws WSException
     */
    public String post(String hostUrl, String functionPath, WSPostParamter wsParam) throws WSException, IOException {
        WSNativeParamter nativeWSParam = new WSNativeParamter();
        nativeWSParam.setPathParam(wsParam.getPathParam());
        nativeWSParam.setQueryParam(wsParam.getQueryParam());
        nativeWSParam.setHeaderParam(wsParam.getHeaderParam());
        nativeWSParam.setBodyParam(wsParam.getBodyParam());
        nativeWSParam.setSendTimeOut(wsParam.getSendTimeOut());

        // Communicate with WebService
        String returnVal = handleWS(hostUrl, functionPath, nativeWSParam, WSConst.WS_HTTP_POST);

        return returnVal;
    }

    /**
     * Communicate with WebService form form with HTTP POST.
     * @param hostUrl
     * @param functionPath
     * @param pathValues
     * @param formParam
     * @return
     * @throws WSException
     * @throws IOException
     */
    public String form(String hostUrl, String functionPath, List<String> pathValues,
                       Map<String, String> formParam) throws WSException, IOException {
        WSNativeParamter nativeWSParam = new WSNativeParamter();

        // Create Path parameters
        if (null != pathValues && pathValues.size() > 0) {
            nativeWSParam.setPathParam(pathValues);
        }

        nativeWSParam.setFormParam(formParam);

        // Communicate with WebService
        String returnVal = handleWS(hostUrl, functionPath, nativeWSParam, WSConst.WS_HTTP_FORM);
        return returnVal;
    }

    /**
     * Communicate with WebService form form with HTTP POST.
     * @param wsAuthToken
     * @param hostUrl
     * @param functionPath
     * @param pathValues
     * @param formParam
     * @return
     * @throws WSException
     * @throws IOException
     */
    public String form(String wsAuthToken, String hostUrl, String functionPath, List<String> pathValues,
                       Map<String, String> formParam) throws WSException, IOException {
        WSNativeParamter nativeWSParam = new WSNativeParamter();

        // Create AuthToken
        Map<String, String> headerParam = null;
        if (!StringUtils.isEmpty(wsAuthToken)) {
            headerParam = new HashMap<String, String>();
            headerParam.put(WSClientHelper.WS_P_AUTHTOKEN, wsAuthToken);

            nativeWSParam.setHeaderParam(headerParam);
        }

        // Create Path parameters
        if (null != pathValues && pathValues.size() > 0) {
            nativeWSParam.setPathParam(pathValues);
        }

        nativeWSParam.setFormParam(formParam);

        // Communicate with WebService
        String returnVal = handleWS(hostUrl, functionPath, nativeWSParam, WSConst.WS_HTTP_FORM);
        return returnVal;
    }

    /**
     * Communicate with WebService form form with HTTP POST.
     *
     * @param hostUrl The host's URL
     * @param functionPath The mapping path
     * @param wsParam Transfer parameters
     * @return The return value from the WebService
     * @throws IOException
     * @throws WSException
     */
    public String form(String hostUrl, String functionPath, WSFormParamter wsParam) throws WSException, IOException {
        WSNativeParamter nativeWSParam = new WSNativeParamter();
        nativeWSParam.setPathParam(wsParam.getPathParam());
        nativeWSParam.setQueryParam(wsParam.getQueryParam());
        nativeWSParam.setHeaderParam(wsParam.getHeaderParam());
        nativeWSParam.setFormParam(wsParam.getFormParam());
        nativeWSParam.setSendTimeOut(wsParam.getSendTimeOut());

        // Communicate with WebService
        String returnVal = handleWS(hostUrl, functionPath, nativeWSParam, WSConst.WS_HTTP_FORM);

        return returnVal;
    }

    /**
     * Communicate with WebService with HTTP PUT.
     * @param hostUrl
     * @param functionPath
     * @param pathValues
     * @return
     * @throws WSException
     * @throws IOException
     */
    public String put(String hostUrl, String functionPath, List<String> pathValues)
            throws WSException, IOException {
        WSNativeParamter nativeWSParam = new WSNativeParamter();

        // Create Path parameters
        if (null != pathValues && pathValues.size() > 0) {
            nativeWSParam.setPathParam(pathValues);
        }

        // Communicate with WebService
        String returnVal = handleWS(hostUrl, functionPath, nativeWSParam, WSConst.WS_HTTP_PUT);
        return returnVal;
    }

    /**
     * Communicate with WebService with HTTP PUT.
     * @param wsAuthToken
     * @param hostUrl
     * @param functionPath
     * @param pathValues
     * @return
     * @throws WSException
     * @throws IOException
     */
    public String put(String wsAuthToken, String hostUrl, String functionPath, List<String> pathValues)
            throws WSException, IOException {
        WSNativeParamter nativeWSParam = new WSNativeParamter();

        // Create AuthToken
        Map<String, String> headerParam = null;
        if (!StringUtils.isEmpty(wsAuthToken)) {
            headerParam = new HashMap<String, String>();
            headerParam.put(WSClientHelper.WS_P_AUTHTOKEN, wsAuthToken);

            nativeWSParam.setHeaderParam(headerParam);
        }

        // Create Path parameters
        if (null != pathValues && pathValues.size() > 0) {
            nativeWSParam.setPathParam(pathValues);
        }

        // Communicate with WebService
        String returnVal = handleWS(hostUrl, functionPath, nativeWSParam, WSConst.WS_HTTP_PUT);
        return returnVal;
    }

    /**
     * Communicate with WebService with HTTP PUT.
     *
     * @param hostUrl The host's URL
     * @param functionPath The mapping path
     * @param wsParam Transfer parameters
     * @return The return value from the WebService
     * @throws IOException
     * @throws WSException
     */
    public String put(String hostUrl, String functionPath, WSPutParamter wsParam) throws WSException, IOException {
        WSNativeParamter nativeWSParam = new WSNativeParamter();
        nativeWSParam.setPathParam(wsParam.getPathParam());
        nativeWSParam.setQueryParam(wsParam.getQueryParam());
        nativeWSParam.setHeaderParam(wsParam.getHeaderParam());
        nativeWSParam.setBodyParam(wsParam.getBodyParam());
        nativeWSParam.setSendTimeOut(wsParam.getSendTimeOut());

        // Communicate with WebService
        String returnVal = handleWS(hostUrl, functionPath, nativeWSParam, WSConst.WS_HTTP_PUT);

        return returnVal;
    }

    /**
     * Communicate with WebService with HTTP GET.
     * @param hostUrl
     * @param functionPath
     * @param pathValues
     * @return
     * @throws WSException
     * @throws IOException
     */
    public String get(String hostUrl, String functionPath, List<String> pathValues)
            throws WSException, IOException {
        WSNativeParamter nativeWSParam = new WSNativeParamter();

        // Create Path parameters
        if (null != pathValues && pathValues.size() > 0) {
            nativeWSParam.setPathParam(pathValues);
        }

        // Communicate with WebService
        String returnVal = handleWS(hostUrl, functionPath, nativeWSParam, WSConst.WS_HTTP_GET);
        return returnVal;
    }

    /**
     * Communicate with WebService with HTTP GET.
     * @param wsAuthToken
     * @param hostUrl
     * @param functionPath
     * @param pathValues
     * @return
     * @throws WSException
     * @throws IOException
     */
    public String get(String wsAuthToken, String hostUrl, String functionPath, List<String> pathValues)
            throws WSException, IOException {
        WSNativeParamter nativeWSParam = new WSNativeParamter();

        // Create AuthToken
        Map<String, String> headerParam = null;
        if (!StringUtils.isEmpty(wsAuthToken)) {
            headerParam = new HashMap<String, String>();
            headerParam.put(WSClientHelper.WS_P_AUTHTOKEN, wsAuthToken);

            nativeWSParam.setHeaderParam(headerParam);
        }

        // Create Path parameters
        if (null != pathValues && pathValues.size() > 0) {
            nativeWSParam.setPathParam(pathValues);
        }

        // Communicate with WebService
        String returnVal = handleWS(hostUrl, functionPath, nativeWSParam, WSConst.WS_HTTP_GET);
        return returnVal;
    }

    /**
     * Communicate with WebService with HTTP GET.
     *
     * @param hostUrl The host's URL
     * @param functionPath The mapping path
     * @param wsParam Transfer parameters
     * @return The return value from the WebService
     * @throws IOException
     * @throws WSException
     */
    public String get(String hostUrl, String functionPath, WSGetParamter wsParam) throws WSException, IOException {
        WSNativeParamter nativeWSParam = new WSNativeParamter();
        nativeWSParam.setPathParam(wsParam.getPathParam());
        nativeWSParam.setQueryParam(wsParam.getQueryParam());
        nativeWSParam.setHeaderParam(wsParam.getHeaderParam());
        nativeWSParam.setSendTimeOut(wsParam.getSendTimeOut());

        // Communicate with WebService
        String returnVal = handleWS(hostUrl, functionPath, nativeWSParam, WSConst.WS_HTTP_GET);

        return returnVal;
    }

    /**
     * Communicate with WebService with HTTP DELETE.
     * @param hostUrl
     * @param functionPath
     * @param pathValues
     * @return
     * @throws WSException
     * @throws IOException
     */
    public String delete(String hostUrl, String functionPath, List<String> pathValues)
            throws WSException, IOException {
        WSNativeParamter nativeWSParam = new WSNativeParamter();

        // Create Path parameters
        if (null != pathValues && pathValues.size() > 0) {
            nativeWSParam.setPathParam(pathValues);
        }

        // Communicate with WebService
        String returnVal = handleWS(hostUrl, functionPath, nativeWSParam, WSConst.WS_HTTP_DEL);
        return returnVal;
    }

    /**
     * Communicate with WebService with HTTP DELETE.
     * @param wsAuthToken
     * @param hostUrl
     * @param functionPath
     * @param pathValues
     * @return
     * @throws WSException
     * @throws IOException
     */
    public String delete(String wsAuthToken, String hostUrl, String functionPath, List<String> pathValues)
            throws WSException, IOException {
        WSNativeParamter nativeWSParam = new WSNativeParamter();

        // Create AuthToken
        Map<String, String> headerParam = null;
        if (!StringUtils.isEmpty(wsAuthToken)) {
            headerParam = new HashMap<String, String>();
            headerParam.put(WSClientHelper.WS_P_AUTHTOKEN, wsAuthToken);

            nativeWSParam.setHeaderParam(headerParam);
        }

        // Create Path parameters
        if (null != pathValues && pathValues.size() > 0) {
            nativeWSParam.setPathParam(pathValues);
        }

        // Communicate with WebService
        String returnVal = handleWS(hostUrl, functionPath, nativeWSParam, WSConst.WS_HTTP_DEL);
        return returnVal;
    }

    /**
     * Communicate with WebService with HTTP DELETE.
     *
     * @param hostUrl The host's URL
     * @param functionPath The mapping path
     * @param wsParam Transfer parameters
     * @return The return value from the WebService
     * @throws IOException
     * @throws WSException
     */
    public String delete(String hostUrl, String functionPath, WSDeleteParamter wsParam) throws WSException, IOException {
        WSNativeParamter nativeWSParam = new WSNativeParamter();
        nativeWSParam.setPathParam(wsParam.getPathParam());
        nativeWSParam.setQueryParam(wsParam.getQueryParam());
        nativeWSParam.setHeaderParam(wsParam.getHeaderParam());
        nativeWSParam.setSendTimeOut(wsParam.getSendTimeOut());

        // Communicate with WebService
        String returnVal = handleWS(hostUrl, functionPath, nativeWSParam, WSConst.WS_HTTP_DEL);

        return returnVal;
    }

    /**
     * Communicate with WebService
     * @param hostUrl
     * @param functionPath
     * @param wsParam
     * @param httpMethod
     * @return
     * @throws WSException
     * @throws IOException
     */
    private String handleWS(String hostUrl, String functionPath, WSNativeParamter wsParam, String httpMethod)
            throws WSException, IOException {
        // Set the initial value into return value.
        String returnVal = StringUtils.EMPTY;

        // Create WebClient Object
        WebClient client = null;
        if (StringUtils.isEmpty(wsParam.getSendTimeOut())) {
            client = WebClient.create(hostUrl);
        } else {
            client = WebClient.create(hostUrl);
        }

        client = client.type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON);

        // Create Path parameters
        List<String> pathParam = wsParam.getPathParam();
        if (null != pathParam && pathParam.size() > 0) {
            pathParam.toArray();
            client = client.path(functionPath, pathParam.toArray());
        } else {
            client = client.path(functionPath);
        }

        // Create Header parameters
        Map<String, String> headerParam = wsParam.getHeaderParam();
        if (null != headerParam && headerParam.size() > 0) {
            for (Entry<String, String> keyValue : headerParam.entrySet()) {
                client = client.header(keyValue.getKey(), keyValue.getValue());
            }
        }

        // Create Query parameters
        Map<String, String> queryParam = wsParam.getQueryParam();
        if (null != queryParam && queryParam.size() > 0) {
            for (Entry<String, String> keyValue : queryParam.entrySet()) {
                client = client.query(keyValue.getKey(), keyValue.getValue());
            }
        }

        // Send WebService
        Response rs = null;
        if (WSConst.WS_HTTP_POST.equals(httpMethod)) {
            rs = postWS(client, wsParam);
        } else if (WSConst.WS_HTTP_FORM.equals(httpMethod)) {
            rs = formWS(client, wsParam);
        } else if (WSConst.WS_HTTP_PUT.equals(httpMethod)) {
            rs = putWS(client, wsParam);
        } else if (WSConst.WS_HTTP_GET.equals(httpMethod)) {
            rs = getWS(client, wsParam);
        } else if (WSConst.WS_HTTP_DEL.equals(httpMethod)) {
            rs = deleteWS(client, wsParam);
        }

        // Retrieve WebService Result
        if (null == rs || rs.getStatus() != Status.OK.getStatusCode()) {
            WSException e = new WSException();

            if (null == rs) {
                e.setStatusCode(String.valueOf(Status.BAD_REQUEST.getStatusCode()));
                e.setMessageContent(WSMessage.ERRMESSAGE_RESULT_NULL);
            } else {
                String errorMessage = "";

                // Get the return value.
                InputStream inputStream = (InputStream)rs.getEntity();
                returnVal = getStringFromInputStream(inputStream);

                // Convert WebService result into object
                ErrorMessageParams wsErrorParams = (ErrorMessageParams) WSClientHelper
                        .convertWSWithObject(returnVal, ErrorMessageParams.class);
                if (null != wsErrorParams) {
                    errorMessage = wsErrorParams.getErrorMessage();
                }

                e.setStatusCode(String.valueOf(rs.getStatus()));
                e.setMessageContent(errorMessage);
            }

            throw e;
        }

        // Get the return value.
        InputStream inputStream = (InputStream)rs.getEntity();
        returnVal = getStringFromInputStream(inputStream);

        return returnVal;
    }

    /**
     * Post WebService
     * @param client
     * @param wsParam
     * @return Response result
     */
    private Response postWS(WebClient client, WSNativeParamter wsParam) {
        Object bodyObj = wsParam.getBodyParam();

        Response rs = null;
        if (null == bodyObj) {
            rs = client.post(null);
        } else {
            rs = client.post(bodyObj);
        }

        return rs;
    }

    /**
     * Post WebService for form
     * @param client
     * @param wsParam
     * @return Response result
     */
    private Response formWS(WebClient client, WSNativeParamter wsParam) {
        Map<String, String> formParam = wsParam.getFormParam();

        Form form = new Form();
        if (null != formParam && formParam.size() > 0) {
            for (Entry<String, String> keyvalue : formParam.entrySet()) {
                form.param(keyvalue.getKey(), keyvalue.getValue());
            }
        }

        Response rs = client.form(form);

        return rs;
    }

    /**
     * Put WebService
     * @param client
     * @param wsParam
     * @return Response result
     */
    private Response putWS(WebClient client, WSNativeParamter wsParam) {
        Object bodyObj = wsParam.getBodyParam();

        Response rs = null;
        if (null == bodyObj) {
            rs = client.post(null);
        } else {
            rs = client.post(bodyObj);
        }

        return rs;
    }

    /**
     * Get WebService
     * @param client
     * @param wsParam
     * @return Response result
     */
    private Response getWS(WebClient client, WSNativeParamter wsParam) {
        Response rs = client.get();

        return rs;
    }

    /**
     * Delete WebService
     * @param client
     * @param wsParam
     * @return Response result
     */
    private Response deleteWS(WebClient client, WSNativeParamter wsParam) {
        Response rs = client.delete();

        return rs;
    }

    /**
     * Converse to String from Stream bytes
     *
     * @param in The Stream bytes
     * @return String Converted string
     * @throws IOException
     */
    private String getStringFromInputStream(InputStream in) throws IOException {
        // read the the Stream bytes.
        CachedOutputStream bos = new CachedOutputStream();
        IOUtils.copy(in, bos);

        // Converse to String from Stream bytes.
        String str = new String(bos.getBytes(), WSConst.ENCODING_UTF8);

        // Close the stream object.
        in.close();
        bos.close();

        return str;
    }
}
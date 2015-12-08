/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.saas.zillow;

import java.io.IOException;
import org.netbeans.saas.RestConnection;
import org.netbeans.saas.RestResponse;

/**
 * ZillowRealEstateService Service
 *
 * @author WaLiD
 */
public class ZillowRealEstateService {

    /**
     * Creates a new instance of ZillowRealEstateService
     */
    public ZillowRealEstateService() {
    }
    
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (Throwable th) {
        }
    }

    /**
     *
     * @param address
     * @param citystatezip
     * @return an instance of RestResponse
     */
    public static RestResponse getSearchResults(String address, String citystatezip) throws IOException {
        String apiKey = ZillowRealEstateServiceAuthenticator.getApiKey();
        String[][] pathParams = new String[][]{};
        String[][] queryParams = new String[][]{{"zws-id", "" + apiKey + ""}, {"address", address}, {"citystatezip", citystatezip}};
        RestConnection conn = new RestConnection("http://www.zillow.com/webservice/GetSearchResults.htm", pathParams, queryParams);
        sleep(1000);
        return conn.get(null);
    }

    /**
     *
     * @param zpid
     * @return an instance of RestResponse
     */
    public static RestResponse getZestimate(String zpid) throws IOException {
        String apiKey = ZillowRealEstateServiceAuthenticator.getApiKey();
        String[][] pathParams = new String[][]{};
        String[][] queryParams = new String[][]{{"zws-id", "" + apiKey + ""}, {"zpid", zpid}};
        RestConnection conn = new RestConnection("http://www.zillow.com/webservice/GetZestimate.htm", pathParams, queryParams);
        sleep(1000);
        return conn.get(null);
    }
}

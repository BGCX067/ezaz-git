/**
 * Copyright 2012-2013 Felix Gaehtgens
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.EzAz.examples.simpleRequest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.EzAz.Layer2.AttributeEntity;
import org.EzAz.Layer2.Request;
import org.EzAz.Layer2.Response;
import org.EzAz.Layer3.PDPService;
import org.EzAz.Layer3.PDPserviceFactory;
import org.EzAz.generic.Layer2.genericRequest;
import org.EzAz.generic.Layer2.genericResponse;

public class Request1 {

	public Request1() {
		
	}
	
	public void loadProps() {
		Properties prop=new Properties();
		// Load properties
		InputStream propFile = this.getClass().getClassLoader().getResourceAsStream("org/EzAz/examples/simpleRequest/sdkWithHandlers.properties");
        try {
        	prop.load(propFile);
        	// Initialize the SDK including all PDP connections
        	PDPserviceFactory.initSDK(prop);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Request1 r=new Request1();
		// Load properties file
		r.loadProps();
		// Initialize connection to PDP (policy decision point)
		// called "dummy" and get a handle. This name is defined in
		// the properties file.
		// We need this handle to communicate with the PDP.
		PDPService pdp=PDPserviceFactory.getPDP("dummy");
		// Now construct a new request.
		Request req=PDPserviceFactory.newRequest();

		// Now create attributes on the request.
		//h.addAttribute(AttributeEntity.CAT_SUBJECT,"subject-id", null, "jack");

		req.addAttribute(AttributeEntity.CAT_SUBJECT, "subject-id", null, "jack");
		req.addAttribute(AttributeEntity.CAT_ACTION, "action-id", null, "print");
		req.addAttribute(AttributeEntity.CAT_RESOURCE, "resource-type", null, "document");
		req.addAttribute(AttributeEntity.CAT_RESOURCE, "resource-id", null, "TPSreport25.xls");
		
		// Print out the request
		genericRequest.prettyPrint(System.out, "", req);

		// Now call the PDP using the evaluate() function.
		Response resp;
		try {
			resp = pdp.evaluate(req);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		//genericResponse rr=(genericResponse) resp;
		genericResponse.prettyPrint(System.out, "", resp);
		// Check whether the response allows our request.
		System.out.println("IS ALLOWED? "+resp.isAllowed(false));
	}
	

}

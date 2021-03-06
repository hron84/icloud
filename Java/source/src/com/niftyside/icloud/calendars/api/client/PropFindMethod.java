package com.niftyside.icloud.calendars.api.client;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;

/**
 * Implements a simple PROPFIND method for {@link HttpClient}.
 * 
 * @author Daniel Muehlbachler
 * @copyright 2012 Daniel Muehlbachler
 * 
 * @see http://icloud.niftyside.com
 * 
 * @version 1.0
 * 
 */
public class PropFindMethod extends PostMethod {
	/* * * * * Constructor * * * * */

	/**
	 * Initializes a new PROPFIND method.
	 * 
	 * @param uri
	 *            the URI to use
	 * 
	 * @since 1.0
	 */
	public PropFindMethod(final String uri) {
		super(uri);
	}

	/* * * * * Methods * * * * */

	@Override
	public String getName() {
		return "PROPFIND";
	}
}

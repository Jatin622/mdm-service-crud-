package com.mdm.util;

import com.mdm.response.model.Error;
import com.mdm.response.model.ResponseObject;
import com.mdm.response.model.Status;


public class MdmResponseUtil {
	
	
	
	private MdmResponseUtil() {
	}

	public static ResponseObject<Object> populateResponseObject(final Object baseResponseModel,
			final String responseStatus, final Error error) {
		ResponseObject<Object> response = new ResponseObject<>();
		response.setResponse(baseResponseModel);
		Status status = new Status();
		status.setResponseStatus(responseStatus);
		status.setError(error);
		response.setStatus(status);
		return response;
	}

	public static ResponseObject<Object> populateResponseString(final String responseStatus, final Error error) {
		ResponseObject<Object> response = new ResponseObject<>();
		Status status = new Status();
		status.setResponseStatus(responseStatus);
		status.setError(error);
		response.setStatus(status);
		return response;
	}

}

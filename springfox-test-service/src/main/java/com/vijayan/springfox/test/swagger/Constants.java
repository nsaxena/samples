package com.vijayan.springfox.test.swagger;

public interface Constants {

	String DUMMY_ID = "0";
	String DEFAULT_ORIGN_ASSET_ID = "1234567890";
	String DEFAULT_OFFERING_ID = "swagger.playground.offering.id";
	String DEFAULT_PROVIDER_ID = "93e404ae-011e-424e-b5b5-ab02b5b82914";
	
	String TID_DESC = "A unique transactionId for use in tracing a chain of calls across multiple systems. Typically a GUID.";
	String ASSET_ID_DESC = "The assetId of the first app/service in the call chain. Here in the swagger playground, we default to the assetId of the services portal.";
	String OFFERING_ID_DESC = "The offeringId of the first app/service in the call chain. Here in the swagger playground, the default value is made up.";
	String AUTHORIZATION_HEADER_DESC = "Authorization header. For the swagger playground, only PrivateAuth is supported.";
	

	String AUTHORIZATION = "Authorization";
	String SWAG_TID = "53a99er0-53a9-53a9-53a9-53a99er053a9";
	String SWAG_ERR400_DESC = "There is a problem with a required header or with the request entity. Details about the error are provided in the response entity.";
	String SWAG_ERR401_DESC = "The user or application could not be authenticated or is not authorized to access the resource.";
	String SWAG_ERR404_DESC = "The requested resource could not be found.";
	String SWAG_ERR500_DESC = "There was an internal server error. Additional details may be available in the response entity.";
	
}

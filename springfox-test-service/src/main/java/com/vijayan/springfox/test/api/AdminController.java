package com.vijayan.springfox.test.api;

import static com.vijayan.springfox.test.swagger.Constants.DUMMY_ID;
import static com.vijayan.springfox.test.swagger.Constants.SWAG_ERR400_DESC;
import static com.vijayan.springfox.test.swagger.Constants.SWAG_ERR401_DESC;
import static com.vijayan.springfox.test.swagger.Constants.SWAG_ERR404_DESC;
import static com.vijayan.springfox.test.swagger.Constants.SWAG_ERR500_DESC;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vijayan.springfox.test.model.Account;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping(value = "/v1/")
@Api(value = "admin")
public class AdminController {

	@RequestMapping(value = "accounts/{id}", method = { RequestMethod.GET }, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Fetch account by Id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "The specified account has been retrieved.", response = Account.class), @ApiResponse(code = 400, message = SWAG_ERR400_DESC),
			@ApiResponse(code = 401, message = SWAG_ERR401_DESC), @ApiResponse(code = 404, message = SWAG_ERR404_DESC), @ApiResponse(code = 500, message = SWAG_ERR500_DESC) })
	public Account getAccount(@ApiParam(defaultValue = DUMMY_ID, required = true, value = "accountId required") @PathVariable Long id)  {
		return null;

	}

}
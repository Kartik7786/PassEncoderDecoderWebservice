package com.passencoderdecoderwebservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.passencoderdecoderwebservice.vo.PassEncoderDecoderWebserviceEncryptionOutputVO;
import com.passencoderdecoderwebservice.vo.PassEncoderDecoderWebserviceIEncryptInputVO;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@ApiOperation(value = "ADD A EMPLOYEE", response = ResponseEntity.class)
@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
		@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
		@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
		@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })

@RequestMapping("/passencoderdecoder")

public class PassEncoderDecoderController {

	private static final Logger LOG = LoggerFactory.getLogger(PassEncoderDecoderController.class);

	@ResponseBody
	public ResponseEntity<PassEncoderDecoderWebserviceEncryptionOutputVO> passEncrypt(
			@RequestBody PassEncoderDecoderWebserviceIEncryptInputVO PassEncoderDecoderWebserviceIEncryptInputVO) {

		return null;

	}
}

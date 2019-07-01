package com.passencoderdecoderwebservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.passencoderdecoderwebservice.service.PassEncoderDecoderWebserviceService;
import com.passencoderdecoderwebservice.vo.PassEncoderDecoderWebserviceInputVO;
import com.passencoderdecoderwebservice.vo.PassEncoderDecoderWebserviceOutputVO;

/*@ApiOperation(value = "ADD A EMPLOYEE", response = ResponseEntity.class)
@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
		@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
		@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
		@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
*/

@RequestMapping("/passencoderdecoder")
@RestController
public class PassEncoderDecoderController {

	@Autowired
	PassEncoderDecoderWebserviceService passEncoderDecoderWebserviceService;

	private static final Logger LOG = LoggerFactory.getLogger(PassEncoderDecoderController.class);

	@RequestMapping(path = "/encrypt", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<PassEncoderDecoderWebserviceOutputVO> passEncrypt(
			@RequestBody PassEncoderDecoderWebserviceInputVO passEncoderDecoderWebserviceIEncryptInputVO) {
		PassEncoderDecoderWebserviceOutputVO passEncoderDecoderWebserviceOutputVO = new PassEncoderDecoderWebserviceOutputVO();

		passEncoderDecoderWebserviceOutputVO.setOutputString(passEncoderDecoderWebserviceService.encrypt(
				passEncoderDecoderWebserviceIEncryptInputVO.getInputString(),
				passEncoderDecoderWebserviceIEncryptInputVO.getKey()));

		ResponseEntity<PassEncoderDecoderWebserviceOutputVO> reponseEntity = new ResponseEntity<>(
				passEncoderDecoderWebserviceOutputVO, HttpStatus.OK);

		return reponseEntity;

	}

	@RequestMapping(path = "/decrypt", method = RequestMethod.POST)
	public ResponseEntity<PassEncoderDecoderWebserviceOutputVO> passDecrypt(
			@RequestBody PassEncoderDecoderWebserviceInputVO passEncoderDecoderWebserviceInputVO) {
		PassEncoderDecoderWebserviceOutputVO passEncoderDecoderWebserviceOutputVO = new PassEncoderDecoderWebserviceOutputVO();

		passEncoderDecoderWebserviceOutputVO.setOutputString(passEncoderDecoderWebserviceService.decrypt(
				passEncoderDecoderWebserviceInputVO.getInputString(), passEncoderDecoderWebserviceInputVO.getKey()));
		ResponseEntity<PassEncoderDecoderWebserviceOutputVO> reponseEntity = new ResponseEntity<>(
				passEncoderDecoderWebserviceOutputVO, HttpStatus.OK);
		return reponseEntity;
	}
}

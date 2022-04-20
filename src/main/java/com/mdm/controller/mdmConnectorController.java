package com.mdm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdm.model.ConnectorModel;

import com.mdm.service.MdmService;
import com.mdm.util.MdmConstant;
import com.mdm.util.MdmResponseUtil;





@RestController
@RequestMapping("api/v1/connector")
public class mdmConnectorController {
	
	@Autowired
	MdmService mdmService;
	
	@PostMapping("/addMdm")
	public ResponseEntity<Object> addMdm(@RequestBody ConnectorModel connectorInfo)
	{
		try
		{
			System.out.println("adding connector..");
			return ResponseEntity.ok(MdmResponseUtil.populateResponseObject(this.mdmService.insertConnectorData(connectorInfo),
					MdmConstant.SUCCESS, null));
		}
		catch (Exception ex) {
			System.out.println("error");
			return ResponseEntity.ok(HttpStatus.BAD_REQUEST);
			

		}
	}
		@GetMapping("/getAllConnector")
		public List<ConnectorModel> getAllConnector()
		{
			return mdmService.findAllConnector();
		}
		
	@GetMapping("getConnector/{code}")	
	public ConnectorModel getConnectorByCode(@PathVariable Integer code)
	{
		return mdmService.getConnectorByCode(code);
	}
	
	// return;
	
	@PutMapping("/updateConnector/{code}")
	public ConnectorModel updateConnector(@PathVariable Integer code,@RequestBody ConnectorModel connectorInfo)
	{
		return mdmService.updateConnector(code,connectorInfo); 
		
	}
	@DeleteMapping("/deleteConnector/{code}")
	public String deleteConnector(@PathVariable Integer code)
	{
		 mdmService.removeConnector(code);
		 return "deleted successfully";
		 
		 
	}
	

}



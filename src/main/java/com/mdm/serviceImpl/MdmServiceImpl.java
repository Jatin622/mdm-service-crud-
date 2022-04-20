package com.mdm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdm.model.ConnectorModel;
import com.mdm.repository.MdmRepository;
import com.mdm.service.MdmService;

@Service
public class MdmServiceImpl implements MdmService {
	
	@Autowired
	MdmRepository mdmRepository;

	@Override
	public ConnectorModel insertConnectorData(ConnectorModel connectorInfo) {
		
//		ConnectorModel connectorModel=new ConnectorModel();
//		connectorModel.setDatabase_name(connectorInfo.getDatabase_name());
//		connectorModel.setHost_name(connectorInfo.getHost_name());
//		connectorModel.setIp_address(connectorInfo.getIp_address());
//		connectorModel.setIs_active(connectorInfo.getIs_active());
//		connectorModel.setPassword(connectorInfo.getPassword());
//		connectorModel.setSource(connectorInfo.getSource());
//		connectorModel.setUser_name(connectorInfo.getUser_name());
		
		
		return mdmRepository.save(connectorInfo);
		
		

	}

	@Override
	public List<ConnectorModel>findAllConnector() {
		
		return mdmRepository.findAll();
	}

	@Override
	public ConnectorModel getConnectorByCode(Integer code) {
		return mdmRepository.getConnectorByCode(code);
	}

	@Override
	public ConnectorModel updateConnector(Integer code, ConnectorModel connectorInfo) {
		ConnectorModel connectorDetail=mdmRepository.getConnectorByCode(code);
		
		connectorDetail.setDatabase_name(connectorInfo.getDatabase_name());
		connectorDetail.setHost_name(connectorInfo.getHost_name());
		connectorDetail.setIs_active(connectorInfo.getIs_active());
		connectorDetail.setIp_address(connectorInfo.getIp_address());
		connectorDetail.setPassword(connectorInfo.getPassword());
		connectorDetail.setSource(connectorInfo.getSource());
		connectorDetail.setUser_name(connectorInfo.getUser_name());
		
		return mdmRepository.save(connectorDetail);
		
		
	}

	@Override
	public void removeConnector(Integer code) {
		mdmRepository.deleteById(code);	
	}
	
	
	

}

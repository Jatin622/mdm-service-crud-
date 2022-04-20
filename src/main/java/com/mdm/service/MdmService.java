package com.mdm.service;

import java.util.List;

import com.mdm.model.ConnectorModel;

public interface MdmService {

	ConnectorModel insertConnectorData(ConnectorModel connectorInfo);

	List<ConnectorModel> findAllConnector();

	ConnectorModel getConnectorByCode(Integer code);

	ConnectorModel updateConnector(Integer code, ConnectorModel connectorInfo);
	
    void removeConnector(Integer code);

}

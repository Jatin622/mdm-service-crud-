package com.mdm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdm.model.ConnectorModel;

public interface MdmRepository extends JpaRepository<ConnectorModel, Integer> {

	ConnectorModel getConnectorByCode(Integer code);

}

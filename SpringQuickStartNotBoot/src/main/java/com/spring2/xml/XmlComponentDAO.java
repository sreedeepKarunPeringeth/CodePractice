package com.spring2.xml;


public class XmlComponentDAO {
	
	private XmlJdbcConnector XmlJdbcConnector;

	public XmlJdbcConnector getXmlJdbcConnector() {
		return XmlJdbcConnector;
	}

	public void setXmlJdbcConnector(XmlJdbcConnector xml) {
		this.XmlJdbcConnector = xml;
	}
	
}

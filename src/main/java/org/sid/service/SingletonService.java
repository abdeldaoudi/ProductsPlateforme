package org.sid.service;

import org.sid.dao.CatalogueDAOImpl;

public class SingletonService {
	private static CatalogueServiceImpl service;
	static {
		CatalogueDAOImpl dao=new CatalogueDAOImpl();
		dao.init();
		service= new CatalogueServiceImpl();
		service.setDao(dao);
		
	}
	
	public static CatalogueServiceImpl getService() {
		return service;
	}
}

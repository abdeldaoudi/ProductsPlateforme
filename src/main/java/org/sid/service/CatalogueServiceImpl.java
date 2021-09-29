package org.sid.service;

import java.util.ArrayList;
import java.util.List;

import org.sid.dao.ICatalogueDAO;
import org.sid.entities.Produit;

public class CatalogueServiceImpl implements  ICatalogueService{
	private ICatalogueDAO dao;
	

	public void setDao(ICatalogueDAO dao) {
		this.dao = dao;
	}


	public void addproduit(Produit p) {
		dao.addproduit(p);
		
	}

	
	public Produit getProduit(String ref) {
		
		return dao.getProduit(ref);
	}
	
	public List<Produit> listProduits() {
		return dao.listProduits();
	}

	
	public void deleteProduit(String ref) {
		dao.deleteProduit(ref);
		
	}



	public void updateProduit(Produit p) {
		
		dao.updateProduit(p);
		
	}





}

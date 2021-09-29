package org.sid.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.*;

import org.sid.entities.Produit;





public class CatalogueDAOImpl implements ICatalogueDAO{
	private Map<String,Produit> produits = new HashMap<String,Produit>();
	Logger log=Logger.getAnonymousLogger();


	public void addproduit(Produit p) {
		produits.put(p.getReference(),p);
		
	}

	
	public Produit getProduit(String ref) {
		
		return produits.get(ref);
	}

	public List<Produit> listProduits() {
		return new ArrayList<Produit>(produits.values());
	}

	public void deleteProduit(String ref) {
		produits.remove(ref);
		
	}
	
	
	public void updateProduit(Produit p) {
		
		produits.put(p.getReference(), p);
		
	}
	
	public void init() {
		addproduit(new Produit("ABCD","ABCD",9800,5 , true));
		addproduit(new Produit("sqd","fref",7800,4 , true));
		addproduit(new Produit("ACD","BCD",800,7 , true));
		log.info("initialisation des produits");
	}


}

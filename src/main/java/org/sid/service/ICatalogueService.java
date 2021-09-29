package org.sid.service;

import java.util.List;

import org.sid.entities.Produit;

public interface ICatalogueService {
	public  void  addproduit(Produit p);
	public Produit getProduit(String ref);
	public List<Produit> listProduits();
	public void deleteProduit(String ref);
	public void updateProduit(Produit p);

}

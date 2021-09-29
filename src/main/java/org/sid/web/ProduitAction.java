package org.sid.web;

import java.util.List;

import org.sid.entities.Produit;
import org.sid.service.ICatalogueService;
import org.sid.service.SingletonService;

import com.opensymphony.xwork2.ActionSupport;

public class ProduitAction  extends ActionSupport{
	public Produit produit=new Produit();
	public List<Produit> produits;
	public String ref;
	public boolean editMode = false;
	private ICatalogueService service = SingletonService.getService();
	
	public String index() {
		produits = service.listProduits();
		return SUCCESS;
	}
	
	public String save() {
		if(editMode == false) {
			service.addproduit(produit);
			
		} else {
			service.updateProduit(produit);;
			editMode=false;
			produit = new Produit();
		}
			produits = service.listProduits();
			return SUCCESS;	
		}
		
	
	public String delete() {
		service.deleteProduit(ref);
		produits = service.listProduits();
		return SUCCESS;
	}
	
	public String edit() {
		editMode = true;
		produit=service.getProduit(ref);
		produits = service.listProduits();
		return SUCCESS;
	}

}

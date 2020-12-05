package com.GestionPharmacie.app.models;

import java.util.ArrayList;

public class Client extends Pharmacien{
	private int badge;
	
	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}

    public Client(){

    }
    
	public Client(int id, String lastName, String firstName, String phone, String email, int badge) {
		super(id, lastName, firstName, phone, email);
		this.badge=badge;
		// TODO Auto-generated constructor stub
	}

    @Override
    public String toString() {
    	return super.toString()+"\nBadge"+badge;
    }
    
  
    public String addClient(ArrayList<Pharmacien> listPharmacien, Client client) {
		try {
			return super.addPharmacien(listPharmacien, client);
			
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
		}
	
	public String editClient(ArrayList<Pharmacien> listPharmacien, Client client, int index) {
		try {
			
			return super.editPharmacien(listPharmacien, client, index);
			 
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
		}

	   public String deleteClient(ArrayList<Pharmacien> listPharmacien, int index){
	        try {
	        	return super.deletePharmacien(listPharmacien, index);
	           
	        }catch (Exception ex){
	            return ex.getMessage();
	        }
	    }

	    public String afficheClient(ArrayList<Pharmacien> listPharmacien){
	        try{
	            
	            return super.affichePharmacien(listPharmacien);
	        }catch(Exception ex){
	            return ex.getMessage();
	        }
	    }
	
    

	
	
	

}

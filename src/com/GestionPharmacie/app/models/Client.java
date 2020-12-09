package com.GestionPharmacie.app.models;

import java.util.ArrayList;

public class Client extends Person{
	private int badge;
	
	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}


    public Client() {
    	
    }


    public Client(int id, String lastName, String firstName, String phone, String email, int badge) {
		super(id, lastName, firstName, phone, email);
		this.badge=badge;
		// TODO Auto-generated constructor stub
	}

//	@Override
//    public String toString() {
//    	return super.toString()+"\nBadge"+badge;
//    }
    
  
    public String addClient(ArrayList<Person> listPerson, Client client) {
		try {
			return super.addPerson(listPerson, client);
			
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
		}
	
	@Override
	public String toString() {
		return super.toString() + "\nBadge :" + badge ;
	}

	public String editClient(ArrayList<Person> listPerson, Client client, int index) {
		try {
			
			return super.editPerson(listPerson, client, index);
			 
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
		}

	   public String deleteClient(ArrayList<Person> listPerson, int index){
	        try {
	        	return super.deletePerson(listPerson, index);
	           
	        }catch (Exception ex){
	            return ex.getMessage();
	        }
	    }

	    public String afficheClient(ArrayList<Person> listPerson){
	        try{
	            
	            return super.affichePerson(listPerson);
	        }catch(Exception ex){
	            return ex.getMessage();
	        }
	    }
	
    

	
	
	

}

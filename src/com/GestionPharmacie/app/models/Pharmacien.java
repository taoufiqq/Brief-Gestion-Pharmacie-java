package com.GestionPharmacie.app.models;

import java.util.ArrayList;

import com.company.Person;

public class Pharmacien extends Person{

	 
		public Pharmacien() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Pharmacien(int id, String lastName, String firstName, String phone, String email) {
		super(id, lastName, firstName, phone, email);
		// TODO Auto-generated constructor stub
	}


		@Override
		public String toString() {
			return super.toString();
		}
		
	
		public String addPharmacien(ArrayList<Person> listPerson, Pharmacien pharamcien) {
			try {
				return super.addPerson(listPerson, pharamcien);
				
				
			}catch(Exception ex) {
				return ex.getMessage();
				
			}
				
			}
		
		public String editPharmacien(ArrayList<Person> listPerson, Pharmacien pharamcien, int index) {
			try {
				
				return super.editPerson(listPerson, pharamcien, index);
				
			}catch(Exception ex) {
				return ex.getMessage();
				
			}
				
			}

		   public String deletePharmacien(ArrayList<Person> listPerson, int index){
		        try {
		        	return super.deletePerson(listPerson, index);
		            
		        }catch (Exception ex){
		            return ex.getMessage();
		        }
		    }

		    public String affichePharmacien(ArrayList<Person> listPerson){
		        try{
		           
		           return super.affichePerson(listPerson);
		           
		        }catch(Exception ex){
		            return ex.getMessage();
		        }
		    }
		
		
		
		

}

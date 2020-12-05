package com.GestionPharmacie.app.models;

import java.util.ArrayList;

import com.company.Person;

public class Pharmacien{

	    private int id;
	    private String lastName;
	    private String firstName;
	    private String phone;
	    private String email;
	    
	
	
	
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getLastName() {
			return lastName;
		}

        public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}


        public Pharmacien() {
        	
        }

		public Pharmacien(int id, String lastName, String firstName, String phone, String email) {

			this.id = id;
			this.lastName = lastName;
			this.firstName = firstName;
			this.phone = phone;
			this.email = email;
		}

		@Override
		public String toString() {
			return "id :"+ id +"\nlastName : "+ lastName +"\nFirstName : "+ firstName +"\nPhone : "+ phone+"\nEmail : "+ email;
		}
		
	
		public String addPharmacien(ArrayList<Pharmacien> listPharmacien, Pharmacien pharamcien) {
			try {
				listPharmacien.add(pharamcien);
				return "Pharmacien Added Successfully";
				
			}catch(Exception ex) {
				return ex.getMessage();
				
			}
				
			}
		
		public String editPharmacien(ArrayList<Pharmacien> listPharmacien, Pharmacien pharamcien, int index) {
			try {
				
				listPharmacien.set(index, pharamcien);
				return "pharamcien Edited Successfully!";
				
			}catch(Exception ex) {
				return ex.getMessage();
				
			}
				
			}

		   public String deletePharmacien(ArrayList<Pharmacien> listPharmacien, int index){
		        try {
		        	listPharmacien.remove(index);
		            return "pharamcien Deleted Successfully!";
		        }catch (Exception ex){
		            return ex.getMessage();
		        }
		    }

		    public String affichePharmacien(ArrayList<Pharmacien> listPharmacien){
		        try{
		            String pr = "";
		            for(Pharmacien pharamcien : listPharmacien){
		                pr += pharamcien.toString();
		            }
		            return pr;
		        }catch(Exception ex){
		            return ex.getMessage();
		        }
		    }
		
		
		
		

}

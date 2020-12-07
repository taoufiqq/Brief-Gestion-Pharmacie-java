package com.GestionPharmacie.app.models;

import java.util.ArrayList;

public class Person {


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


	        public Person() {
		 
	        }

			public Person(int id, String lastName, String firstName, String phone, String email) {
				super();
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
			
		
			public String addPerson(ArrayList<Person> listPerson, Person person) {
				try {
					listPerson.add(person);
					return "Pharmacien Added Successfully";
					
				}catch(Exception ex) {
					return ex.getMessage();
					
				}
					
				}
			
			public String editPerson(ArrayList<Person> listPerson, Person person, int index) {
				try {
					
					listPerson.set(index, person);
					return "pharamcien Edited Successfully!";
					
				}catch(Exception ex) {
					return ex.getMessage();
					
				}
					
				}

			   public String deletePerson(ArrayList<Person> listPerson, int index){
			        try {
			        	listPerson.remove(index);
			            return "pharamcien Deleted Successfully!";
			        }catch (Exception ex){
			            return ex.getMessage();
			        }
			    }

			    public String affichePerson(ArrayList<Person> listPerson){
			        try{
			            String pr = "";
			            for(Person person : listPerson){
			                pr += person.toString();
			            }
			            return pr;
			        }catch(Exception ex){
			            return ex.getMessage();
			        }
			    }
			
			
			
			

	}



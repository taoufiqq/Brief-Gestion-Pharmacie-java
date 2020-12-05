package com.GestionPharmacie.app.models;

import java.util.ArrayList;

public class Medicament {
	
	private int id;
	private String name;
	private String description;
	private float price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public Medicament() {
		
	}
	public Medicament(int id, String name, String description, float price) {

		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "id :"+ id +"\nName :"+ name +"\nDescription :"+ description +"\nPrice"+ price;
	}
	
	
    public String addMedicament(ArrayList<Medicament> listmedicaments, Medicament medicament){
        try{
        	listmedicaments.add(medicament);
           return "Medicament Added Successfully!";
        }catch(Exception ex){
            return ex.getMessage();
        }
    }
	
    public String editMedicament(ArrayList<Medicament> listmedicaments, Medicament medicament, int index){
        try {
        	listmedicaments.set(index, medicament);
           return "Medicament Edited Successfully!";
        }catch (Exception ex){
           return  ex.getMessage();
        }
    }

    public String deleteMedicament(ArrayList<Medicament> listmedicaments, int index){
        try {
        	listmedicaments.remove(index);
           return "Medicament Deleted Successfully!";
        }catch (Exception ex){
            return ex.getMessage();
        }
    }
	
    public String afficheMedicament(ArrayList<Medicament> listmedicaments){
        try{
            String m = "";
            for(Medicament medicament : listmedicaments){
                m += medicament.toString();
            }
            return m;
        }catch(Exception ex){
            return ex.getMessage();
        }
    }
	
	

}

package com.GestionPharmacie.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.GestionPharmacie.app.models.Client;
import com.GestionPharmacie.app.models.Medicament;
import com.GestionPharmacie.app.models.Person;
import com.GestionPharmacie.app.models.Pharmacien;



public class Main {
	public static Comparator<Person> sortClient = new Comparator<Person>() {

		public int compare(Person p1, Person p2) {
			String customerName1 = p1.getFirstName().toUpperCase();
			String customerName2 = p2.getFirstName().toUpperCase();

			// ascending order
			return customerName1.compareTo(customerName2);

		}
	};

	public static void main(String[] args) {
		
		
		
	
		// TODO Auto-generated method stub
	        
		   ArrayList<Person> listPharmaciens =new ArrayList<Person>();
		   ArrayList<Person> listClients = new ArrayList<Person>();
		   ArrayList<Medicament> listMedicaments = new ArrayList<Medicament>();
		   
		   boolean var = true;
			
			while (var) {
				
				System.out.println("*********************Programme de Gestion Pharmacie*********************");
		        System.out.println("Menu Principal");
		        System.out.println("1- Gestion Pharmacien");
		        System.out.println("2- Gestion Medicament");
		        System.out.println("3- Gestion Client");
		        System.out.println("4- Quitter le programme");
		        
		        System.out.println("Choix :");
		        
		        Scanner scanner = new Scanner(System.in);
		        
		        int choix = scanner.nextInt();
				
				switch (choix) {
				case 1:
					boolean var1 = true;
					while (var1) {
						System.out.println("*********************Gestion Pharmaciens*********************");
					    System.out.println("1- Ajouter Pharmacien");
				        System.out.println("2- Supprimer Pharmacien");
				        System.out.println("3- Modifier Pharmacien");
				        System.out.println("4- Afficher Pharmacien  ");
				        System.out.println("5- Rechercher un Pharmacien Par prenom");
				        System.out.println("6- Quitter le Menu Pharmacien");
				        
				        System.out.println("Choix :");
				        
				        int choixPharmacien = scanner.nextInt();
				        
				        switch (choixPharmacien) {
						case 1:
							
							 System.out.println("Ajouter Pharmacien");
							 
							 int id = listPharmaciens.size() + 1;
							 
							 System.out.println("Nom :");
							 String lastName = scanner.next();
							 
							 System.out.println("Prenom :");
							 String firstName = scanner.next();
							 
							 System.out.println("telephone :");
							 String phone = scanner.next();
							
							 System.out.println("Email :");
							 String email = scanner.next(); 
							 
							 Pharmacien pharmacien = new Pharmacien(id, lastName, firstName, phone, email);
							 pharmacien.addPharmacien(listPharmaciens, pharmacien);
							 
							 System.out.println("Pharmacien Bien Ajouté");
							
							break;
                        case 2:
                        	System.out.println("Supprimer Pharmacien");
                        	
                        	System.out.println("id :");
                        	
                        	int idSup=scanner.nextInt();
                        	
                        	Pharmacien p = new Pharmacien();
                        	
                        	p.deletePharmacien(listPharmaciens, idSup - 1);
                        	
                        	System.out.println("Pharmacien Bien supprimer");
                        	
							
							break;
                        case 3:
                        	System.out.println("Modifier Pharamcien");
                        	
                        	System.out.println("entrer l'index du Pharamcien");
                        	
                        	 int index = scanner.nextInt()-1;
                        
                             for (int i = 0; i < listPharmaciens.size(); i++){
                                 if(i == index){
                                     
                                	  System.out.println("ID: ");
                                      int newId = scanner.nextInt();

                                     System.out.println("Nom:");
                                     String newLastName  = scanner.next();

                                     System.out.println("Prénom:");
                                     String newFirstName = scanner.next();

                                     System.out.println("telephone:");
                                     String newTel = scanner.next();
                                     
                                     System.out.println("Email:");
                                     String newEmail = scanner.next();
                                     
                                     Pharmacien ph = new Pharmacien(newId, newLastName, newFirstName, newTel, newEmail);
                                     
                                     ph.editPharmacien(listPharmaciens, ph, newId -1);
                        
                                     System.out.println("Pharmacien Bien Modifier");
                                 }else
                                 {
                                     System.out.println("index Entrer n'existe pas");
                                 }
                             }
                            
	
	                        break;
	                    case 4:
	                      	System.out.println("Afficher Pharmacien");
	                    	
	                    	Pharmacien pharmacien1 = new Pharmacien();
	                    	pharmacien1.affichePharmacien(listPharmaciens);
	                    	
	                    	System.out.println("-----------------------------------------------------------------------------");
	                    	 System.out.printf("%10s %15s %15s %15s %15s", "ID", "NOM","PRENOM", "TELEPHONE", "EMAIL");
	                        System.out.println();
	                        System.out.println("-----------------------------------------------------------------------------");
	                    	
	                    	
	                    	for(Person pharmacien2 : listPharmaciens){
	                    		 System.out.format("%10s %15s %15s %15s %15s",
	                    				 pharmacien2.getId(),pharmacien2.getLastName(),pharmacien2.getFirstName(),pharmacien2.getPhone(),pharmacien2.getEmail());
	                    	        System.out.println();
	                    	}
	                    	System.out.println("-----------------------------------------------------------------------------");
							break;
                        case 5:
                        	System.out.println("Rechercher un Pharmacien");
    						String RechercherPharmacien = scanner.next();

    						for (Person p1 : listPharmaciens) {
    							if (p1.getFirstName().equals(RechercherPharmacien)) {
    								System.out.println(p1.toString());
    							}
    						}
							
							break;
                        case 6:
                        	System.out.println("Vous avez Quitter le Menu pharamcien");
                        	
                        	var1=false;
                        	var=true;
	
	                        break;

						default:
							System.out.println("Choix invalid!!!!!!!!!!!");
							break;
						}
						
					}
				    break;
                case 2:
                	boolean var2 = true;
					while (var2) {
						System.out.println("*********************Gestion Medicaments*********************");
					    System.out.println("1- Ajouter Medicament");
				        System.out.println("2- Supprimer Medicament");
				        System.out.println("3- Modifier Medicament");
				        System.out.println("4- Afficher Medicament  ");
				        System.out.println("5- Rechercher un Medicament Par prenom");
				        System.out.println("6- Quitter le Menu Medicament");
				        
                        int choixMedicament = scanner.nextInt();
				        
				        switch (choixMedicament) {
						case 1:
							
							 System.out.println("Ajouter Medicament");
							 
							 int id = listMedicaments.size() + 1;
							 
							 System.out.println("Nom :");
							 String name = scanner.next();
							
							 System.out.println("Description :");
							 String description = scanner.next();
							
							 System.out.println("Prix:");
							 float price = scanner.nextFloat(); 
							 
							 Medicament medicament = new Medicament(id, name, description, price);
							 medicament.addMedicament(listMedicaments, medicament);
							 
							 System.out.println("Medicament Bien Ajouté");
							
							break;
                        case 2:
                        	System.out.println("Supprimer Medicament");
                        	
                        	System.out.println("id :");
                        	
                        	int indexSup = scanner.nextInt();
                        	
                        	Medicament m = new Medicament();
                        	
                        	m.deleteMedicament(listMedicaments, indexSup-1 );
                        	
                        	System.out.println("Medicament Bien supprimer");
                        	
							
							break;
                        case 3:
                        	System.out.println("Modifier Medicament");
                        	
                        	System.out.println("entrer l'index du Medicament");
                        	
                        	 int indexM = scanner.nextInt() -1;
                        
                             for (int i = 0; i < listMedicaments.size(); i++){
                            	 
                                 if(i == indexM){
                                     
                                	 System.out.println("ID: ");
                                     int newId = scanner.nextInt();
                                     
                                     System.out.println("Nouveau Nom:");
                                     String newName  = scanner.next();

                                     System.out.println("Nouveau Description:");
                                     String newDescription = scanner.next();
                                     
                                     System.out.println("Nouveau Prix:");
                                     float newPrice = scanner.nextFloat();
                                     
                                     Medicament md = new Medicament(newId, newName, newDescription, newPrice);
                                     
                                     md.editMedicament(listMedicaments, md, newId-1);
                        
                                     System.out.println("Medicament Bien Modifier");
                                 }else
                                 {
                                     System.out.println("index Entrer n'existe pas");
                                 }
                             }
                            
	
	                        break;
	                    case 4:
	                      	System.out.println("Afficher Medicament");
	                    	
	                      	Medicament medicament1 = new Medicament();
	                      	medicament1.afficheMedicament(listMedicaments);
	                    	
	                    	System.out.println("-----------------------------------------------------------------------------");
	                    	 System.out.printf("%10s %15s %15s %15s", "ID", "NOM","DESCRIPTION", "PRIX");
	                        System.out.println();
	                        System.out.println("-----------------------------------------------------------------------------");
	                    	
	                    	
	                    	for(Medicament medicament2 : listMedicaments){
	                    		 System.out.format("%10s %15s %15s %15s",
	                    				 medicament2.getId(),medicament2.getName(),medicament2.getDescription(),medicament2.getPrice());
	                    	        System.out.println();
	                    	}
	                    	System.out.println("-----------------------------------------------------------------------------");
							break;
                        case 5:
                        	System.out.println("Rechercher un Medicament");
    						String RechercheMedicament = scanner.next();

    						for (Medicament m2 : listMedicaments) {
    							if (m2.getName().equals(RechercheMedicament)) {
    								System.out.println(m2.toString());
    							}
    						}
							
							break;
                        case 6:
                            System.out.println("Vous avez Quitter le Menu Medicament");
                        	
                        	var2=false;
                        	var=true;
                        	break;

						default:
							System.out.println("Choix invalid!!!!!!!!!!!");
							break;
						}
						
					}
					break;
                case 3:
                	boolean var3 = true;
					while (var3) {
						System.out.println("*********************Gestion Clients*********************");
					    System.out.println("1- Ajouter Client");
				        System.out.println("2- Supprimer Client");
				        System.out.println("3- Modifier Client");
				        System.out.println("4- Afficher Client ");
				        System.out.println("5- Trier les clients");
				        System.out.println("6- Quitter le Menu Client");
				        
				        System.out.println("Choix :");
				        
				        int choixClient = scanner.nextInt();
				        
				        switch (choixClient) {
						case 1:
							
							 System.out.println("Ajouter Client");
							 
							 int id = listClients.size() + 1;
							 
							 System.out.println("Nom :");
							 String lastName = scanner.next();
							 
							 System.out.println("Prenom :");
							 String firstName = scanner.next();
							 
							 System.out.println("telephone :");
							 String phone = scanner.next();
							
							 System.out.println("Email :");
							 String email = scanner.next(); 
							 
							 System.out.println("Badge :");
							 int badge = scanner.nextInt();
							 
							 Client client = new Client(id, lastName, firstName, phone, email, badge);
							 client.addClient(listClients, client);
							 
							  System.out.println("Client Bien Ajouté");
							  
							     if(badge >= 3){
	                                    System.out.println();
	                                    System.out.println("cette person une client fedéle :) :)");
	                                    System.out.println();
	                                }else{
	                                    System.out.println("cette person n' a pas une client fedéle ");
	                                }

							
							break;
                        case 2:
                        	System.out.println("Supprimer Client");
                        	
                        	System.out.println("id :");
                        	
                        	int idSup=scanner.nextInt();
                        	
                        	Client c = new Client();
                        	
                        	c.deleteClient(listClients, idSup-1);
                        	
                        	System.out.println("Client Bien supprimer");
                        	
							break;
                        case 3:
                        	System.out.println("Modifier Client");
                        	
                        	System.out.println("entrer l'index du Client");
                        	
                        	 int index = scanner.nextInt()-1;
                        
                             for (int i = 0; i < listClients.size(); i++){
                                 if(i == index){
                                     
                                	  System.out.println("ID: ");
                                      int newId = scanner.nextInt();

                                     System.out.println("Nom:");
                                     String newLastName  = scanner.next();

                                     System.out.println("Prénom:");
                                     String newFirstName = scanner.next();

                                     System.out.println("telephone:");
                                     String newTel = scanner.next();
                                     
                                     System.out.println("Email:");
                                     String newEmail = scanner.next();
                                     
                                     System.out.println("Badge :");
        							 int newBadge = scanner.nextInt();
        							 
        							 Client clt = new Client(newId, newLastName, newFirstName, newTel, newEmail, newBadge);
                                     
                                     clt.editClient(listClients, clt, newId-1);
                                     
                                     System.out.println("Client Bien Modifier");
                                 }else
                                 {
                                     System.out.println("index Entrer n'existe pas");
                                 }
                             }
                            
	
	                        break;
	                    case 4:
	                      	System.out.println("Afficher Client");
	                    	
	                      	Client client1 = new Client();
	                      	client1.afficheClient(listClients);
	                    	
//	                    	System.out.println("-----------------------------------------------------------------------------");
//	                    	System.out.printf("%10s %15s %15s %15s %15s %15s ", "ID", "NOM","PRENOM", "TELEPHONE", "EMAIL","BADGE");
//	                        System.out.println();
//	                        System.out.println("-----------------------------------------------------------------------------");
	                    	
	                        
	                    	
	                    	for(Person client2 : listClients){
//	                    		 System.out.format("%10s %15s %15s %15s %15s %15s ",
//	                    				 client2.getId(),client2.getLastName(),client2.getFirstName(),client2.getPhone(),client2.getEmail(),client2.getBadge());
	                    	        System.out.println(client2.toString());
	                    	}
	                    	System.out.println("-----------------------------------------------------------------------------");
							break;
                        case 5:
                        	
                        	Collections.sort(listClients, sortClient);
    						System.out.println(
    								"-----------------------------------------------------------------------------");
    						System.out.printf("%10s %15s %15s %15s %15s ","ID", "NOM","PRENOM", "TELEPHONE", "EMAIL");
    						System.out.println();
    						System.out.println(
    								"-----------------------------------------------------------------------------");
    						for (int i = 0; i < listClients.size(); i++) {
    							System.out.format("%10s %15s %15s %15s %15s ",listClients.get(i).getId(),
    									listClients.get(i).getLastName(), listClients.get(i).getFirstName(),
    									listClients.get(i).getPhone(), listClients.get(i).getEmail());
    							System.out.println();
    						}
    						System.out.println(
    								"-----------------------------------------------------------------------------");
	                        break;
                        case 6:
                            System.out.println("Vous avez Quitter le Menu Client");
                        	
                        	var3=false;
                        	var=true;
                        	break;

						default:
							System.out.println("Choix invalid!!!!!!!!!!!");
							break;
						}
						
					}
	                break;

				default:
					break;
				}
					
			}

	}

}

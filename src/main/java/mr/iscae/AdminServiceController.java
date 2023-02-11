package mr.iscae;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
@Path("/adminController")
public class AdminServiceController {
private  Map<String,Service> services = memoire.getServices();
	
	private   Map<Integer,compte> comptes = memoire.getComptes();
	

	

	
	
	
	
public  String UpdatePass(String password) {
		
		admin.setPassword(password);
		return "password change it";
	
	
}



public  String AjouterUnService(Service s ) {
	
	services.put(s.getNomService(), s);
	return s.getNomService() +"a ete ajouter";
}

 


public  String ajoutcompte(String nomService,  int Ncompte,  double montant ) {
	
	Service service = services.get(nomService);
	
	if (service != null) {
		comptes.put(Ncompte, new compte(Ncompte, montant, service ));
		return "ajouter avec succés";
	} else {
		return "le service introuvable";
	}
}






 
public List<Service> allServices() {
return new ArrayList<Service>(services.values());
}

public List<compte> allComptes() {
	
return new ArrayList<compte>(comptes.values());
}


public  String crediter(int nCompte, double montant){
	compte c = comptes.get(nCompte);
		c.setMontant(c.getMontant()+montant);
	return c.getNCompte()+ " a ete crédite d'un montant de "
	+ montant;
	}


//pour tester cette methode localhost:port/nomprojet/ws-rest/adminController/upd?password=val

	@PUT
	@Path("upd")
	public String update(@QueryParam("password") String password  ) {
		UpdatePass(password);
		return "modifié";
		
	}
	
	//pour tester cette methode on utilise dans postman le methode put et on utilise le format json 
	@PUT
	@Path("/service")
	public String AjoutService(Service s){
	return AjouterUnService(s);
	}
	
		//pour tester cette methode on utilise la methode put et le path et 
	//le suivant : localhost:port/nomprojet/ws-rest/adminController/compte?nomService=val&Ncompte=val&montant=val
	@PUT
	@Path("/compte")
	public String Ajoutcompte(@QueryParam("nomService") String nomService, 
			@QueryParam("Ncompte") int Ncompte,@QueryParam("montant") double montant) {
		return ajoutcompte(nomService, Ncompte, montant );
		
	}
	
	//pour test cette methode on utilise le methode put  localhost:port/nomprojet/ws-rest/adminController/credité?Ncompte=val&montant=val
	
	@PUT
	@Path("/credité")
	public String versement(@QueryParam("NCompte") int NCompte,
			@QueryParam("montant") double crediter){
	return crediter(NCompte,crediter);
	}


}

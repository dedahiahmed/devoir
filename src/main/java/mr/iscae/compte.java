package mr.iscae;

public class compte {

private int Ncompte;
	
	private double montant;
	
	private Service service;
	

	
	
	public int getNCompte() {
		return Ncompte;
	}
	public void setNCompte(int Ncompte) {
		this.Ncompte = Ncompte;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	
	public compte(int Ncompte, double montant, Service service ) {
		super();
		this.Ncompte = Ncompte;
		this.montant = montant;
		this.service = service;
		
	}
 

}



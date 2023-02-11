package mr.iscae;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Service {
	
	@JsonProperty
	private String nomService;
	
	
	


	public String getNomService() {
		return nomService;
	}
	public void setNomService(String nomService) {
		this.nomService = nomService;
	}
}

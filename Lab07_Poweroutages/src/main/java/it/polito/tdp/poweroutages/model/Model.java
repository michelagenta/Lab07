package it.polito.tdp.poweroutages.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import it.polito.tdp.poweroutages.DAO.PowerOutageDAO;

public class Model {
	
	PowerOutageDAO podao;
	
	private List<Nerc> nercList; 
	private NERCIdMap map; 
	
	private List<PowerOutages> event; 
	private List<PowerOutages> filtrata; 
	private List<PowerOutages> soluzione; 
	private int maxAffected; 
	
	public Model() {
		podao = new PowerOutageDAO();
		
		map= new NERCIdMap();
		nercList= podao.getNercList(map);
		
		event= podao.getPowerOutages(map);
	}
	
	public List<Nerc> getNercList() {
		return podao.getNercList(map);
	}


	public List<PowerOutages> getWorstCase(int maxYears, int maxOutages, Nerc nerc){
		
		soluzione=new ArrayList<>();
		maxAffected=0;
		
		filtrata= new ArrayList<>();
		
		for(PowerOutages event: this.event) {
			if(event.getMerc().equals(nerc)) {
				filtrata.add(event);
			}
		}
		Collections.sort(event);
		ricorsione(new ArrayList<PowerOutages>(), maxYears, maxOutages);
		return null;
	}

	private void ricorsione(ArrayList<PowerOutages> arrayList, int maxYears, int maxOutages) {
		// TODO Auto-generated method stub
		
	}
}
	


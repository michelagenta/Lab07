package it.polito.tdp.poweroutages.model;

import java.util.HashMap;
import java.util.Map;

public class NERCIdMap {
	
	private Map<Integer,Nerc> map;

	/**
	 * 
	 */
	public NERCIdMap() {
		map=new HashMap<>();
	}

	public Map<Integer, Nerc> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Nerc> map) {
		this.map = map;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((map == null) ? 0 : map.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NERCIdMap other = (NERCIdMap) obj;
		if (map == null) {
			if (other.map != null)
				return false;
		} else if (!map.equals(other.map))
			return false;
		return true;
	}
	
	public Nerc get(int id) {
		return map.get(id);
	}
	
	public Nerc get(Nerc nerc) {
		Nerc old= map.get(nerc.getId());
		if(old==null) {
			map.put(nerc.getId(), nerc);
			return nerc;
		} else {
			return old;
		}
	}

}

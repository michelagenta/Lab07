package it.polito.tdp.poweroutages.model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class PowerOutages implements Comparable<PowerOutages>{
	
	private int id; 
	private Nerc merc; 
	private LocalDateTime start; 
	private LocalDateTime end; 
	private int affectedPeople; 
	private long duration; 
	private int year;
	/**
	 * @param id
	 * @param merc
	 * @param start
	 * @param end
	 * @param affectedPeople
	 * @param duration
	 * @param year
	 */
	public PowerOutages(int id, Nerc merc, LocalDateTime start, LocalDateTime end, int affectedPeople) {
		super();
		this.id = id;
		this.merc = merc;
		this.start = start;
		this.end = end;
		this.affectedPeople = affectedPeople;
		
		LocalDateTime tempDate=LocalDateTime.from(start);
		this.duration=tempDate.until(end, ChronoUnit.HOURS);
		this.year=start.getYear();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Nerc getMerc() {
		return merc;
	}
	public void setMerc(Nerc merc) {
		this.merc = merc;
	}
	public LocalDateTime getStart() {
		return start;
	}
	public void setStart(LocalDateTime start) {
		this.start = start;
	}
	public LocalDateTime getEnd() {
		return end;
	}
	public void setEnd(LocalDateTime end) {
		this.end = end;
	}
	public int getAffectedPeople() {
		return affectedPeople;
	}
	public void setAffectedPeople(int affectedPeople) {
		this.affectedPeople = affectedPeople;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + affectedPeople;
		result = prime * result + (int) (duration ^ (duration >>> 32));
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		result = prime * result + id;
		result = prime * result + ((merc == null) ? 0 : merc.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
		result = prime * result + year;
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
		PowerOutages other = (PowerOutages) obj;
		if (affectedPeople != other.affectedPeople)
			return false;
		if (duration != other.duration)
			return false;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (id != other.id)
			return false;
		if (merc == null) {
			if (other.merc != null)
				return false;
		} else if (!merc.equals(other.merc))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public int compareTo(PowerOutages o) {
		
		return this.getStart().compareTo(o.getStart());
	} 
	
	

}

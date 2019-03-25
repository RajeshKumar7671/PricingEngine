package com.pricingengine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Hadoop
 *
 */
@Entity
@Table(name="WheelsComponentPrice_Tab")
public class WheelsPrice {
	   @Id
	   @GeneratedValue(generator="wheels",strategy=GenerationType.SEQUENCE)
	   @SequenceGenerator(name="wheels",sequenceName="wheels_seq")
	 private int whId;
     private int spoke;
     private int rim;
     private int tube;
     private int tyre;
     private String offersDate;

	public WheelsPrice() {
		super();
	}

	public WheelsPrice(int whId) {
		super();
		this.whId = whId;
	}
     
	public WheelsPrice(int whId, int spoke) {
		super();
		this.whId = whId;
		this.spoke = spoke;
	}

	public WheelsPrice(int whId, int spoke, int rim) {
		super();
		this.whId = whId;
		this.spoke = spoke;
		this.rim = rim;
	}

	public WheelsPrice(int whId, int spoke, int rim, int tube) {
		super();
		this.whId = whId;
		this.spoke = spoke;
		this.rim = rim;
		this.tube = tube;
	}

	public WheelsPrice(int whId, int spoke, int rim, int tube, int tyre) {
		super();
		this.whId = whId;
		this.spoke = spoke;
		this.rim = rim;
		this.tube = tube;
		this.tyre = tyre;
	}

	public WheelsPrice(int whId, int spoke, int rim, int tube, int tyre, String offersDate) {
		super();
		this.whId = whId;
		this.spoke = spoke;
		this.rim = rim;
		this.tube = tube;
		this.tyre = tyre;
		this.offersDate = offersDate;
	}

	@Override
	public String toString() {
		return "WheelsPrice [whId=" + whId + ", spoke=" + spoke + ", rim=" + rim + ", tube=" + tube + ", tyre=" + tyre
				+ ", offersDate=" + offersDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((offersDate == null) ? 0 : offersDate.hashCode());
		result = prime * result + rim;
		result = prime * result + spoke;
		result = prime * result + tube;
		result = prime * result + tyre;
		result = prime * result + whId;
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
		WheelsPrice other = (WheelsPrice) obj;
		if (offersDate == null) {
			if (other.offersDate != null)
				return false;
		} else if (!offersDate.equals(other.offersDate))
			return false;
		if (rim != other.rim)
			return false;
		if (spoke != other.spoke)
			return false;
		if (tube != other.tube)
			return false;
		if (tyre != other.tyre)
			return false;
		if (whId != other.whId)
			return false;
		return true;
	}

	public int getWhId() {
		return whId;
	}

	public void setWhId(int whId) {
		this.whId = whId;
	}

	public int getSpoke() {
		return spoke;
	}

	public void setSpoke(int spoke) {
		this.spoke = spoke;
	}

	public int getRim() {
		return rim;
	}

	public void setRim(int rim) {
		this.rim = rim;
	}

	public int getTube() {
		return tube;
	}

	public void setTube(int tube) {
		this.tube = tube;
	}

	public int getTyre() {
		return tyre;
	}

	public void setTyre(int tyre) {
		this.tyre = tyre;
	}

	public String getOffersDate() {
		return offersDate;
	}

	public void setOffersDate(String offersDate) {
		this.offersDate = offersDate;
	}
	
	
     
}

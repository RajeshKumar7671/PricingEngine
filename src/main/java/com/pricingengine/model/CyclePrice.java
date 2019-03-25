package com.pricingengine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CycleComponentPrice_Tab")
public class CyclePrice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cycleId;
	private int frame;
	private int handlebar_with_break;
	private int seating;
	@OneToMany
	@JoinColumn(name="WheelsFkId")
	public WheelsPrice wheels;
	private int no_of_wheels;
	private int chain_assembly;
	public CyclePrice() {
		super();
	}
	public CyclePrice(int cycleId) {
		super();
		this.cycleId = cycleId;
	}
	public CyclePrice(int cycleId, int frame) {
		super();
		this.cycleId = cycleId;
		this.frame = frame;
	}
	public CyclePrice(int cycleId, int frame, int handlebar_with_break) {
		super();
		this.cycleId = cycleId;
		this.frame = frame;
		this.handlebar_with_break = handlebar_with_break;
	}
	public CyclePrice(int cycleId, int frame, int handlebar_with_break, int seating) {
		super();
		this.cycleId = cycleId;
		this.frame = frame;
		this.handlebar_with_break = handlebar_with_break;
		this.seating = seating;
	}
	public CyclePrice(int cycleId, int frame, int handlebar_with_break, int seating, WheelsPrice wheels) {
		super();
		this.cycleId = cycleId;
		this.frame = frame;
		this.handlebar_with_break = handlebar_with_break;
		this.seating = seating;
		this.wheels = wheels;
	}
	
	public CyclePrice(int cycleId, int frame, int handlebar_with_break, int seating, WheelsPrice wheels,
			int no_of_wheels) {
		super();
		this.cycleId = cycleId;
		this.frame = frame;
		this.handlebar_with_break = handlebar_with_break;
		this.seating = seating;
		this.wheels = wheels;
		this.no_of_wheels = no_of_wheels;
	}
	public CyclePrice(int cycleId, int frame, int handlebar_with_break, int seating, WheelsPrice wheels,
			int no_of_wheels, int chain_assembly) {
		super();
		this.cycleId = cycleId;
		this.frame = frame;
		this.handlebar_with_break = handlebar_with_break;
		this.seating = seating;
		this.wheels = wheels;
		this.no_of_wheels = no_of_wheels;
		this.chain_assembly = chain_assembly;
	}
	public int getCycleId() {
		return cycleId;
	}
	public void setCycleId(int cycleId) {
		this.cycleId = cycleId;
	}
	public int getFrame() {
		return frame;
	}
	public void setFrame(int frame) {
		this.frame = frame;
	}
	public int getHandlebar_with_break() {
		return handlebar_with_break;
	}
	public void setHandlebar_with_break(int handlebar_with_break) {
		this.handlebar_with_break = handlebar_with_break;
	}
	public int getSeating() {
		return seating;
	}
	public void setSeating(int seating) {
		this.seating = seating;
	}
	public WheelsPrice getWheels() {
		return wheels;
	}
	public void setWheels(WheelsPrice wheels) {
		this.wheels = wheels;
	}
	public int getNo_of_wheels() {
		return no_of_wheels;
	}
	public void setNo_of_wheels(int no_of_wheels) {
		this.no_of_wheels = no_of_wheels;
	}
	public int getChain_assembly() {
		return chain_assembly;
	}
	public void setChain_assembly(int chain_assembly) {
		this.chain_assembly = chain_assembly;
	}
	@Override
	public String toString() {
		return "CyclePrice [cycleId=" + cycleId + ", frame=" + frame + ", handlebar_with_break=" + handlebar_with_break
				+ ", seating=" + seating + ", wheels=" + wheels + ", no_of_wheels=" + no_of_wheels + ", chain_assembly="
				+ chain_assembly + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + chain_assembly;
		result = prime * result + cycleId;
		result = prime * result + frame;
		result = prime * result + handlebar_with_break;
		result = prime * result + no_of_wheels;
		result = prime * result + seating;
		result = prime * result + ((wheels == null) ? 0 : wheels.hashCode());
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
		CyclePrice other = (CyclePrice) obj;
		if (chain_assembly != other.chain_assembly)
			return false;
		if (cycleId != other.cycleId)
			return false;
		if (frame != other.frame)
			return false;
		if (handlebar_with_break != other.handlebar_with_break)
			return false;
		if (no_of_wheels != other.no_of_wheels)
			return false;
		if (seating != other.seating)
			return false;
		if (wheels == null) {
			if (other.wheels != null)
				return false;
		} else if (!wheels.equals(other.wheels))
			return false;
		return true;
	}
}

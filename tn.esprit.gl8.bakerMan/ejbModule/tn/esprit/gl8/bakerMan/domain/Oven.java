package tn.esprit.gl8.bakerMan.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Oven
 * 
 */
@Entity
@Table(name = "T_OVEN")

public class Oven implements Serializable {

	private int id;
	private String brand;
	private static final long serialVersionUID = 1L;

	public Oven() {
		super();
	}

	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String Brand) {
		this.brand = Brand;
	}

}

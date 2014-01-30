package tn.esprit.gl8.bakerMan.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Cake
 * 
 */
@Entity
@Table(name = "T_CAKE")
public class Cake implements Serializable {

	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	public Cake() {
		super();
	}

	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

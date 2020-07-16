package com.training.apring.boot.backend.apirest.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@NotEmpty(message = " Nombre no puede estar vacio")
	@Size(min=4, max= 12, message=" Nombre debe tener entre 4 y 12 caracteres")
	@Column(nullable=false)
	public String name;
	
	@NotEmpty(message = " Apellido no puede estar vacio")
	public String lastName;
	
	@NotEmpty(message = " Email no puede estar vacio")
	@Email(message=" Email el formato no es correcto")
	@Column(nullable=false, unique=true)
	public String email;
	
	@NotNull(message = " Fecha de creación no puede estar vacio")
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	public Date createAt;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2308015489163945023L;
}

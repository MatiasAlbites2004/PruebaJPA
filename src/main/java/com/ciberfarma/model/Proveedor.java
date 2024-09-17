package com.ciberfarma.model;





import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name= "tb_proveedor")

public class Proveedor {
	@Id
	private int idproveedor;
	private String nombrers;
	private String telefono;
	private String email;
	
	

}
	



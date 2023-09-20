package br.com.t2bContainer.bean;

public class Container {

	private int id;
	private String cliente;
	private String nroContainer;
	private int tipo;
	private String status;
	private String categoria;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getNroContainer() {
		return nroContainer;
	}
	public void setNroContainer(String nroContainer) {
		this.nroContainer = nroContainer;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}

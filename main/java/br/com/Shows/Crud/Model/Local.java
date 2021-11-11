package br.com.Shows.Crud.Model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "locais")
public class Local {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column (name= "Id")
	private long Id;
	@Column (name= "nome")
	private String nome;
	private long capacidade;
	@Override
	public int hashCode() {
		return Objects.hash(nome, Id, capacidade);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Local other = (Local) obj;
		return Objects.equals(nome, other.nome) && Id == other.Id && capacidade == other.capacidade;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getEndereco() {
		return nome;
	}
	public void setEndereco(String endereco) {
		nome = nome;
	}
	public long getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(long capacidade) {
		this.capacidade = capacidade;
	}
	

}

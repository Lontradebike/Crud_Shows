package br.com.Shows.Crud.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;


@Entity

@Table (name="shows")
public class Shows {
	@Column (name="id")
	@GeneratedValue(strategy= GenerationType.AUTO)
   private long Id;
	@Column (name="Data")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class )
   private LocalDate Data;
	
	
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public LocalDate getData() {
		return Data;
	}
	public void setData(LocalDate Data) {
		this.Data = Data;
	}
	
}

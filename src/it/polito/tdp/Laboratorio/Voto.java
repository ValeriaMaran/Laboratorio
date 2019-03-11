package it.polito.tdp.Laboratorio;

import java.time.LocalDate;
import java.time.*;

public class Voto {
	private int voto;
	private String corso;
	//Per usare una data usiamo localdata, la più recente, è la migliore.
	private LocalDate data;
	public Voto(int voto, String corso, LocalDate data) {
		super();
		this.voto = voto;
		this.corso = corso;
		this.data = data;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	public String getCorso() {
		return corso;
	}
	public void setCorso(String corso) {
		this.corso = corso;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	//Portiamo il progetto sotto un sistema di controllo e revisione così:
	// progetto - tastoDestro- Team - Share Project
	//Ripeto e Faccio commit
	
	
	
}

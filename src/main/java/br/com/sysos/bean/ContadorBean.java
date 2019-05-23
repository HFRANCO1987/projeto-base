package br.com.sysos.bean;

import java.io.Serializable;

import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;
import org.primefaces.PrimeFaces;

@Named
@ViewScoped
public class ContadorBean implements Serializable {

	private static final long serialVersionUID = 7767509420578743160L;
	
	private Long contador = 0L;

	public void doExecutar() {
		contador++;
		if (contador > 5) {
			PrimeFaces.current().executeScript("showMensagemSweetAlert()");
		}else {
			PrimeFaces.current().ajax().addCallbackParam("contador", contador);   
		}
	}

	public Long getContador() {
		return contador;
	}

	public void setContador(Long contador) {
		this.contador = contador;
	}

}

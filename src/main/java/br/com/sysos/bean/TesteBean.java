package br.com.sysos.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;
import org.primefaces.PrimeFaces;
import org.primefaces.context.RequestContext;

@Named
@ViewScoped
public class TesteBean implements Serializable {

	private static final long serialVersionUID = 4381390444002917162L;

	private Texto texto = new Texto();

	private String nome;

	private List<Texto> textos = new ArrayList<Texto>();

	public void novo() {
		Texto texto1 = new Texto();
		texto1.setNome("somar");

		Texto texto2 = new Texto();
		texto2.setNome("dividir");

		textos.add(texto1);
		textos.add(texto2);
		
		PrimeFaces.current().executeScript("alert('Teste show')");
	}

	public Texto getTexto() {
		return texto;
	}

	public void setTexto(Texto texto) {
		this.texto = texto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Texto> getTextos() {
		return textos;
	}

	public void setTextos(List<Texto> textos) {
		this.textos = textos;
	}

}

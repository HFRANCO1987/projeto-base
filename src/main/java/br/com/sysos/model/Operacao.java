package br.com.sysos.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Operacao implements Serializable {

	private static final long serialVersionUID = -572318224191006009L;

	@Column(name = "data_inclusao", insertable = true, updatable = false)
	private Date dataInclusao;

	@Column(name = "data_alteracao")
	private Date dataAlteracao;

	public Operacao() {
	}

	public Operacao(Date dtInclusao, Date dtAlteracao) {
		this.dataInclusao = new Date();
		this.dataAlteracao = new Date();
	}

	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

}

package br.com.sysos.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.sysos.enumerators.EnumStatus;

@Entity
@Table(name = "tab_os")
public class OS implements Serializable {

	private static final long serialVersionUID = 7319309414605465731L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "protocolo")
	private String protocolo;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private EnumStatus status;

	@Column(name = "datainicial")
	private Date dataInicial;

	@Column(name = "datafinal")
	private Date dataFinal;

	@Column(name = "garantia")
	private String garantia;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "defeito")
	private String defeito;

	@Column(name = "observacoes")
	private String observacoes;

	@Column(name = "laudotecnio")
	private String laudoTecnico;

	@Embedded
	private Operacao operacao;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "tab_osprodutos", joinColumns = { @JoinColumn(name = "id_os") }, inverseJoinColumns = {
			@JoinColumn(name = "id_produto") })
	private Set<Produto> setProdutos = new HashSet<Produto>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "os", fetch = FetchType.EAGER)
	private Set<Servico> setServicos = new HashSet<Servico>();

	public OS() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public EnumStatus getStatus() {
		return status;
	}

	public void setStatus(EnumStatus status) {
		this.status = status;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDefeito() {
		return defeito;
	}

	public void setDefeito(String defeito) {
		this.defeito = defeito;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getLaudoTecnico() {
		return laudoTecnico;
	}

	public void setLaudoTecnico(String laudoTecnico) {
		this.laudoTecnico = laudoTecnico;
	}

	public Operacao getOperacao() {
		return operacao;
	}

	public void setOperacao(Operacao operacao) {
		this.operacao = operacao;
	}

	public Set<Produto> getSetProdutos() {
		return setProdutos;
	}

	public void setSetProdutos(Set<Produto> setProdutos) {
		this.setProdutos = setProdutos;
	}

	public Set<Servico> getSetServicos() {
		return setServicos;
	}

	public void setSetServicos(Set<Servico> setServicos) {
		this.setServicos = setServicos;
	}

}

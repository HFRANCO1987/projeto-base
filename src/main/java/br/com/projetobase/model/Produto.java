package br.com.sysos.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.sysos.enumerators.EnumTipoMovimento;
import br.com.sysos.enumerators.EnumUnidade;

@Entity
@Table(name = "tab_produto")
public class Produto implements Serializable {

	private static final long serialVersionUID = -7531716555858512714L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name="codigo")
	private String codigo;

	@Column(name = "descricao")
	private String descricao;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipomovimento")
	private EnumTipoMovimento tipoMovimento;

	@Column(name = "valorcompra")
	private BigDecimal valorCompra;

	@Column(name = "valorvenda")
	private BigDecimal valorVenda;

	@Enumerated(EnumType.STRING)
	@Column(name = "unidade")
	private EnumUnidade unidade;

	@Column(name = "estoque")
	private Long estoque;

	@Column(name = "estoqueminimo")
	private Long estoqueMinimo;

	@Embedded
	private Operacao operacao;

	public Produto() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public EnumTipoMovimento getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(EnumTipoMovimento tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public BigDecimal getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(BigDecimal valorCompra) {
		this.valorCompra = valorCompra;
	}

	public BigDecimal getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(BigDecimal valorVenda) {
		this.valorVenda = valorVenda;
	}

	public EnumUnidade getUnidade() {
		return unidade;
	}

	public void setUnidade(EnumUnidade unidade) {
		this.unidade = unidade;
	}

	public Long getEstoque() {
		return estoque;
	}

	public void setEstoque(Long estoque) {
		this.estoque = estoque;
	}

	public Long getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(Long estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public Operacao getOperacao() {
		return operacao;
	}

	public void setOperacao(Operacao operacao) {
		this.operacao = operacao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	

}

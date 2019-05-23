package br.com.projetobase.enumerators;

public enum EnumStatus {

	ORCAMENTO(1, "Orçamento"), 
	ABERTO(2, "Aberto"),
	EM_ANDAMENTO(3, "Em Andamento"),
	FINALIZADO(4, "Finalizado"),
	CANCELADO(5, "Cancelado");

	private final Integer codigo;
	private final String descricao;

	EnumStatus(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

}
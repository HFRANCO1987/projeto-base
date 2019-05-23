package br.com.sysos.enumerators;

public enum EnumTipoMovimento {

	ENTRADA(1, "Entrada"), SAIDA(2, "Saida");

	private final Integer codigo;
	private final String descricao;

	EnumTipoMovimento(Integer codigo, String descricao) {
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
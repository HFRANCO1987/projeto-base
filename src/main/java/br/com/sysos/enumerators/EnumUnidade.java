package br.com.sysos.enumerators;

public enum EnumUnidade {

	UNIDADE(1, "Unidade"), 
	KILOGRAMA(2, "Kilograma"),
	LITRO(3, "Litro"),
	CAIXA(4, "Caixa");

	private final Integer codigo;
	private final String descricao;

	EnumUnidade(Integer codigo, String descricao) {
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
package br.com.sysos.enumerators;


public enum EnumUf  {

	AC(1, "Acre", "AC", 1),
	AL(2, "Alagoas", "AL", 1),
	AM(3, "Amazonas", "AM", 1),
	AP(4, "Amap�", "AP", 1),
	BA(5, "Bahia", "BA", 1),
	CE(6, "Cear�", "CE", 1),
	DF(7, "Distrito Federal", "DF", 1),
	ES(8, "Esp�rito Santo", "ES", 1),
	GO(9, "Goi�s", "GO", 1),
	MA(10, "Maranh�o", "MA", 1),
	MG(11, "Minas Gerais", "MG", 1),
	MS(12, "Mato Grosso do Sul", "MS", 1),
	MT(13, "Mato Grosso", "MT", 1),
	PA(14, "Par�", "PA", 1),
	PB(15, "Para�ba", "PB", 1),
	PE(16, "Pernambuco", "PE", 1),
	PI(17, "Piau�", "PI", 1),
	PR(18, "Paran�", "PR", 1),
	RJ(19, "Rio de Janeiro", "RJ", 1),
	RN(20, "Rio Grande do Norte", "RN", 1),
	RO(21, "Rond�nia", "RO", 1),
	RR(22, "Roraima", "RR", 1),
	RS(23, "Rio Grande do Sul", "RS", 1),
	SC(24, "Santa Catarina", "SC", 1),
	SE(25, "Sergipe", "SE", 1),
	SP(26, "S�o Paulo", "SP", 1),
	TO(27, "Tocantins", "TO", 1);
	
	private final Integer codigo;
	private final String descricao;
	private final String uf;
	private final Integer pais;
	
	EnumUf(Integer codigo, String descricao, String uf, Integer pais) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.uf = uf;
		this.pais = pais;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getUf() {
		return uf;
	}

	public Integer getPais() {
		return pais;
	}
}
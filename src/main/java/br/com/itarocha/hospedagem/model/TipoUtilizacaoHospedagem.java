package br.com.itarocha.hospedagem.model;

public enum TipoUtilizacaoHospedagem {

	T("Total"),
	P("Parcial");
	
	private String descricao;
	
	TipoUtilizacaoHospedagem(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}

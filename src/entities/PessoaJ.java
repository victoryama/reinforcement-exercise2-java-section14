package entities;

public class PessoaJ extends Pessoa{

	private Integer nFuncionarios;
	
	public PessoaJ(String nome, Double renda, Integer nFuncionarios) {
		super(nome, renda);
		this.nFuncionarios = nFuncionarios;
	}

	public Integer getnFuncionarios() {
		return nFuncionarios;
	}


	public void setnFuncionarios(Integer nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}

	@Override
	public double imposto() {
		
		if (nFuncionarios <= 10) {
			return getRenda()*0.16;
		}
		else {
			return getRenda()*0.14;
		}		
	}
	

}

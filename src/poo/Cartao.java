package poo;
/**
 * A classe cartão contem metodos para ver e definir e ver atributos dos funcionários
 * 
 * <ul>
 * <li>getNomeFuncionario</li>
 * <li>setServico</li>
 * <li>setCargo</li>
 * <li>retirarServico</li>
 * <li>atribuirNovoServico</li>
 * <li>promoverNovoCargo</li>
 * <li>despidirFuncionario</li>
 * </ul>
 * 
 * @author Hiimk1k0
 *
 */



public class Cartao {
	
	private String nomeFuncionario;
	private String servico;
	private String cargo;
	
	// Construtores 
	public Cartao(String nomeFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
	}

	public Cartao(String nomeFuncionario, String servico, String cargo) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.servico = servico;
		this.cargo = cargo;
	}

	// Acessores
	/**
	 * Nome do Funcionario
	 * 
	 * @return retorna o nome
	 */
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	/**
	 * Servico desempenhado pelo funcionario
	 * 
	 * @param servico - define qual e o servico realizado
	 */
	
	public void setServico(String servico) {
		this.servico = servico;
	}

	/**
	 * Cargo desempenhado pelo funcionario
	 * 
	 * @param cargo - define qual e o cargo ocupado
	 */
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	// Métodos
	
	/**
	 * Retira o funcionario do servico atual 
	 */
	
	public void retirarServico() {
		// servico = "";
		setServico("");
	}
	
	/**
	 * Atribui um novo servico ao funcionario
	 * 
	 * @param novoServico
	 */
	public void atribuirNovoServico( String novoServico ) {
		//servico = novoServico;
		setServico( novoServico );
	}
	/**
	 * Promove o funcionario a um novo cargo
	 * 
	 * @param novoCargo -  novo cargo do funcionario
	 */
	
	public void promoverNovoCargo( String novoCargo ) {
		//cargo = novoCargo;
		setCargo(novoCargo);
	}
	/**
	 * Despede o funcionario
	 */
	
	public void despedirFuncionario() {
		retirarServico();
		setCargo("");
	}
	
}

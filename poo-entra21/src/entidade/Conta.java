/**
 * 
 */
package entidade;

/**
 * @author guest01
 *
 */
public class Conta {

	private String numeroDaAgencia;
	private String numeroDaConta;
	private double saldo;
	double sacar = 0;
	
	
	public Conta (String numeroDaAgencia, String numeroDaConta, double saldo) {
		this.numeroDaAgencia = numeroDaAgencia;
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
		
	}
	
	public double sacar(double valorSaque) {
		if(valorSaque >= this.saldo) {
			return this.saldo;
		}else {
			valorSaque = valorSaque - this.saldo;
		}
		return valorSaque;
	}
	
	
	public String getNumeroDaAgencia() {
		return numeroDaAgencia;
	}
	public void setNumeroDaAgencia(String numeroDaAgencia) {
		this.numeroDaAgencia = numeroDaAgencia;
	}
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	

	}



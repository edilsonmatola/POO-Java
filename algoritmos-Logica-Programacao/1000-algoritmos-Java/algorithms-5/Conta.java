 class Conta{
	
	String titular;
	int numero;
	double saldo;
	int levantamento;
	
	public Conta (String titular , int numero , double saldo){
	this.titular=titular;
	this.numero = numero;
	this.saldo = saldo;
	}
	public double getSaldo(){
	return this.saldo;
	}
	public String getTitular(){
	return this.titular;
	}
	
	public void setTitular (String titular){
	this.titular=titular;
	}
	
	public void setSaldo (double Saldo){
	this.saldo=saldo;
	}
	
	public void levantar (double valor){
		if(this.saldo > valor)
		{
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Nome do titular: "+this.getTitular());
			System.out.println("Numero da conta: "+this.getNumero());
			System.out.println("Valor do levantamento: "+valor);
			System.out.println("Saldo Atual: "+this.getSaldo());
		}
		else if(this.saldo < valor)
		{
			System.out.println("saldo insuficiente!");
		}
	}
	
	public void Deposito (double valor){
		this.saldo = this.saldo + valor;
	}
 }
		
	

		
		
	
	
	
	
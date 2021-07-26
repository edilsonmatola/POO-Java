class contap{

    String titular;
    int numero;
    double saldo;

    contap(String titular){
        this.titular = titular;
    } 
    contap(int numero, String titular){

       this.numero = numero;
        this.titular = titular;
    }
    
    double getsaldo(){
        return this.saldo;
    }
    String getitular(){
        return this.titular;
    }
    void  settitular(String titular){
        this.titular = titular;
    }
    void  setsaldo(double saldo){
        this.saldo = saldo;
    }

   /* void levantamento(double valor){
        if(valor > saldo){}
            double newsaldo = saldo - valor;

            this.saldo = newsaldo;
            System.out.println(saldo);
    }else{
        System.out.println("Saldo insuficiente");
    }*/

    void depositar(double valor){
        if(valor > 0){
            double novosaldo = saldo + valor;
            this.saldo = novosaldo;
            System.out.println(saldo);
        }else{
            System.err.println("Valor insuficiente");
        }
    }
}

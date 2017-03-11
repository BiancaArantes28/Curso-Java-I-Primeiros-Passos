
package alura;


public class Conta {
    int numero;
    Pessoa titular;
    private double saldo;
    int agencia;
    boolean deposita;
    private double limite;
    
    public Conta(int numero, double limite){
        this.numero = numero;
        this.limite = limite;
    } 
    public void deposita(double ValoraSerDepositado){
        this.saldo += ValoraSerDepositado;
    }
    public void saca(double ValoraSerSacado){
        if(this.saldo >= ValoraSerSacado){
            this.saldo -= ValoraSerSacado;
        }
    }
    public void transfere(double valor, Conta destino){
        this.saldo -= valor;
        destino.saldo += valor;
    }
    public double pegaSaldo(){
        return this.saldo;
    }
    public void adicionaLimite(double novolimite){
        this.limite = novolimite;
        
    }
    public double pegaLimite(){
        
        return this.limite;
    }
}

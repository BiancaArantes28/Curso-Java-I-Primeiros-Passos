
package alura;


public class Programa {
    public static void main(String[] args){
        Conta mauricio = new Conta(123,150.0);
        Conta bruno = new Conta(456,150.0);
        
        bruno.agencia = 321;
        mauricio.agencia = 843;
        mauricio.adicionaLimite(150);
        System.out.println(mauricio.pegaLimite());
        
        mauricio.deposita(100.0);
        mauricio.saca(100.0);
        
        Conta guilherme = new Conta(234,250);
        guilherme.titular = new Pessoa();
        mauricio.titular = new Pessoa();
        mauricio.titular.nome = "Guilherme Fernando";
        guilherme.titular.nome = "Guilherme Fernando";
        System.out.println(mauricio.titular.nome);
        System.out.println(guilherme.titular.nome);
        
       
        guilherme.agencia = 842;
        
        mauricio.transfere(150, guilherme);
        System.out.println(mauricio.pegaSaldo());
        
        System.out.println(guilherme.pegaSaldo());
    }
}

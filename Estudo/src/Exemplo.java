import java.util.Scanner;
public class Exemplo {
    
    String exemplo;
    float exemplo2;
    
    public void entrar(){
        Scanner input=new Scanner (System.in);
        
        System.out.println("Inserir nome do Produto: ");
        exemplo=input.next();
        
    }
    
    public void calcular(){
 
    }
    
    public void imprimir(){
        
        System.out.println(exemplo);
        
    }
    
    public static void main (String [] args){
        Exemplo obj=new Exemplo();
        obj.entrar();
        obj.imprimir();
        
    }     
}

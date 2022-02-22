import java.util.Scanner;
public class Paciente {
    
    String nome;
    int idade;
    double peso, altura, imc, resultado;
    
    void entrar(){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Nome: ");
        nome = input.next();
        
        System.out.println("Idade: ");
        idade = input.nextInt();
        
        System.out.println("Peso (kg:) ");
        peso = input.nextDouble();
        
        System.out.println("Altura (m): ");
        altura = input.nextDouble();   
    }
    
    void calcular(){
        
        
        imc = peso / (altura*altura);
        
        if (imc<16){
            System.out.println("Baixo peso muito grave = IMC abaixo de 16 kg/m²");
        } else if (imc<17){
            System.out.println("Baixo peso grave = IMC entre 16 e 16,99 kg/m²");
        } else if (imc<18.5){
            System.out.println("Baixo peso = IMC entre 17 e 18,49 kg/m²");
        } else if (imc<25){
            System.out.println("Peso normal = IMC entre 18,50 e 24,99 kg/m²");
        } else if (imc<30){
            System.out.println("Sobrepeso = IMC entre 25 e 29,99 kg/m²");
        } else if (imc<35){
            System.out.println("Obesidade grau I = IMC entre 30 e 34,99 kg/m²");
        } else if (imc<40){
            System.out.println("Obesidade grau II = IMC entre 35 e 39,99 kg/m²");
        } else if (imc>=40){
            System.out.println("Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²");
        } else {
            System.out.println("Valor Inválido! ");
        }
        
    }
    
    
    void imprimir(){
        System.out.println("-------Perfil-------");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Peso: "+peso);
        System.out.println("Altura: "+altura);
        System.out.println("");
        System.out.println("Diagnostico: ");
    }
    
    public static void main(String[] args) {
        Paciente obj = new Paciente();
        obj.entrar();
        obj.imprimir();
        obj.calcular();
    }
    
}

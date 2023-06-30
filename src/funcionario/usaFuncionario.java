package funcionario;

import java.util.Scanner;

public class usaFuncionario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu cracha: ");
        int c = sc.nextInt();
        System.out.println("Digite o seu salario:");
        float s = sc.nextFloat();
        System.out.println("Digite o seu cargo:");
        String car = sc.next();
        System.out.println("Digite quantos anos de empresa");
        int ano = sc.nextInt();
        System.out.println("Quantos porcentos no aumento do salario");
        float porc = sc.nextInt();
        
        funcionario fun1 = new funcionario(c, s,car);
        fun1.calculaAumento(porc);
        fun1.calculaAumento(ano);
        
        
        
        
        
    }
    
}

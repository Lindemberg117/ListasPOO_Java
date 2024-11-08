package ListasPOO_Java.Lista

import java.util.Scanner;

05.Questão02;

public class questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Retangulo retangulo = null;
        boolean sair = true;
        
        do {
            System.out.println("1. Criar um retângulo (Digitar valor de B e H)");
            System.out.println("2. Calcular Área");
            System.out.println("3. Calcular Perímetro");
            System.out.println("0. Sair");
            
            int A = sc.nextInt();
            
            switch (A) {
                case 0:
                    sair = false;
                    break;
                    
                case 1:
                    System.out.println("Base: ");
                    Double Base = sc.nextDouble();
                    
                    System.out.println("Altura: ");
                    Double Altura = sc.nextDouble();
                    
                    retangulo = new Retangulo(Base, Altura);
                    System.out.println("Retângulo criado com sucesso!");
                    break;
                    
                case 2:
                    if (retangulo != null) {
                        Double Area = retangulo.Area();
                        System.out.println("A Área do retângulo é " + Area);
                    } else {
                        System.out.println("Primeiro, crie um retângulo.");
                    }
                    break;
                    
                case 3: 
                    if (retangulo != null) {
                        Double Perimetro = retangulo.Perimetro();
                        System.out.println("O Perímetro do retângulo é " + Perimetro);
                    } else {
                        System.out.println("Primeiro, crie um retângulo.");
                    }
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            
        } while (sair);
        
        sc.close();
    }
}

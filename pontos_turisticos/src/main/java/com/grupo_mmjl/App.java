package com.grupo_mmjl;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception
    {
        Atribuicoes atribuir = new Atribuicoes();
        atribuir.setAmbientais();
        atribuir.setReligiosos();
        atribuir.setHistArt();
        atribuir.setLazer();
        atribuir.setGastr();

        // MENU
        int retorno = 1;
        Scanner input = new Scanner(System.in);
        
        while(retorno == 1){
            
            System.out.println("##################################");
            System.out.println("    PONTOS TURÍSTICOS DE BELÉM");
            System.out.println("##################################");
            System.out.println("Escolha o que deseja:");
            System.out.println("1 - Ambientais");
            System.out.println("2 - Gastronômicos");
            System.out.println("3 - Histórico-artísticos");
            System.out.println("4 - Lazer");
            System.out.println("5 - Religiosos");
            System.out.println("6 - Sair");
            
            int escolha = input.nextInt();

                switch(escolha){
                    case 1: atribuir.listarAmbientais(); break;
                    case 2: atribuir.listarGastronomicos(); break;
                    case 3: atribuir.listarHistoricos(); break;
                    case 4: atribuir.listarLazer(); break;
                    case 5: atribuir.listarReligiosos(); break;
                    case 6: retorno = 0; break;
                    default: System.out.println("Opção inválida");

                }

        }

    }
}

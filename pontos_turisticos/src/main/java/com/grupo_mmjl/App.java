package com.grupo_mmjl;
import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception
    {
        Atribuicoes atribuir = new Atribuicoes();
        atribuir.setInfo();

        // MENU
        int retorno = 1;
        
        
        while(retorno == 1){
            
            int escolha = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Escolha o que deseja:\n" +
            "1 - Ambientais\n" +
            "2 - Religiosos\n" +
            "3 - Histórico-artísticos\n" +
            "4 - Lazer\n" +
            "5 - Gastronômicos\n" +
            "6 - Sair", //mensagem
            "PONTOS TURÍSTICOS DE BELÉM", // titulo da janela 
            JOptionPane.INFORMATION_MESSAGE));


                switch(escolha){
                    case 1: atribuir.listarInfo(escolha); break;
                    case 2:atribuir.listarInfo(escolha); break;
                    case 3: atribuir.listarInfo(escolha); break;
                    case 4: atribuir.listarInfo(escolha); break;
                    case 5: atribuir.listarInfo(escolha); break;
                    case 6: retorno = 0; break;
                    default: System.out.println("Opção inválida");

                }

        }

    }
}

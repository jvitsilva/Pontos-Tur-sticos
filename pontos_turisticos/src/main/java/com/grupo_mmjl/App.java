package com.grupo_mmjl;
import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception
    {
        Atribuicoes atribuir = new Atribuicoes();
        atribuir.setInfo();

        // MENU
        boolean retorno = false;
        
        
        while(retorno == false){
            
            try{
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
	            
	            if (escolha < 1 || escolha > 6) {
	            	throw new Exception("Escolha um dos valores de 1 a 6");
	            }
	           
	            switch(escolha){
	            case 1: atribuir.listarInfo(escolha); break;
	            case 2:atribuir.listarInfo(escolha); break;
	            case 3: atribuir.listarInfo(escolha); break;
	            case 4: atribuir.listarInfo(escolha); break;
	            case 5: atribuir.listarInfo(escolha); break;
	            case 6: retorno = true; break;
	            default: System.out.println("Opção inválida");
	            }
	            
            } catch(Exception e) {
            	JOptionPane.showMessageDialog(null, e);
            }

                

        }

    }
}

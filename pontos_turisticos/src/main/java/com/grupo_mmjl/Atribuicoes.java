package com.grupo_mmjl;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Atribuicoes extends Controle{

    
    // Cria o parse de tratamento
    JSONParser parser = new JSONParser();
    
    String json[] = {"ambiental.json", "religioso.json", "historicoartistico.json", "lazer.json", "gastronomico.json"};

    // setando as atribuições no JSON ambinetal.json
    public void setInfo() throws FileNotFoundException, IOException, ParseException {

        for (int i = 0; i<5; i++){
            JSONArray fullJSON = (JSONArray) parser.parse(new InputStreamReader(new FileInputStream(json[i]), "UTF-8"));
            for (Object o : fullJSON) {
                
                JSONObject obj = (JSONObject) o;
                // Salva nas variaveis os dados retirados do arquivo
                String nome = obj.get("nome").toString();
                String endereco = obj.get("endereco").toString();
                String dataFundacao = obj.get("dataFundacao").toString();
                String descricao = obj.get("descricao").toString();

                switch(i){
                    case 0: 
                    Ambiental ambiental_ = new Ambiental(nome, endereco, dataFundacao, descricao);
                    adicionarAmb(ambiental_); 
                    break;

                    case 1:
                    Religiosos religiosos_ = new Religiosos(nome, endereco, dataFundacao, descricao);
                    adicionarRel(religiosos_); 
                    break;

                    case 2:
                    HistoricoArtistico histArt_ = new HistoricoArtistico(nome, endereco, dataFundacao, descricao);
                    adicionarHist(histArt_); 
                    break;

                    case 3:
                    Lazer lazer_ = new Lazer(nome, endereco, dataFundacao, descricao);
                    adicionarLaz(lazer_); 
                    break;

                    case 4:
                    Gastronomico gastr_ = new Gastronomico(nome, endereco, dataFundacao, descricao);
                    adicionarGast(gastr_); 
                    break;
                }
            }
        }
    }


    // listando todos os pontos turisticos 
    public void listarInfo(int n) {

        switch(n){
           case 1: for (PontosTuristicos cont : ambiental) {
            JOptionPane.showMessageDialog(null, cont.toString());
        }    break;
           
           case 2: for (PontosTuristicos cont : religiosos) {
            JOptionPane.showMessageDialog(null, cont.toString());
        } break;

           case 3: for (PontosTuristicos cont : histArtistico) {
            JOptionPane.showMessageDialog(null, cont.toString());
        } break;

           case 4: for (PontosTuristicos cont : lazer) {
            JOptionPane.showMessageDialog(null, cont.toString());
        } break;

           case 5: for (PontosTuristicos cont : gastronomico) {
            JOptionPane.showMessageDialog(null, cont.toString());
        } break;

        }  
    }   
}

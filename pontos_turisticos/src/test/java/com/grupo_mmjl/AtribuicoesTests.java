package com.grupo_mmjl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import org.junit.Test;

public class AtribuicoesTests {
    ArrayList<Ambiental> amb = new ArrayList<>();
    ArrayList<Religiosos> rel = new ArrayList<>();
    ArrayList<HistoricoArtistico> histArt = new ArrayList<>();
    ArrayList<Lazer> laz = new ArrayList<>();
    ArrayList<Gastronomico> gastr = new ArrayList<>();
    Boolean b;

    @Test
    public void setInfoTest() throws FileNotFoundException, IOException, ParseException{
        String json[] = {"ambiental.json", "religioso.json", "historicoartistico.json", "lazer.json", "gastronomico.json"};
        JSONParser parser = new JSONParser();
        
       
       
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
                    amb.add(ambiental_);              
                    break;

                    case 1:
                    Religiosos religiosos_ = new Religiosos(nome, endereco, dataFundacao, descricao);
                    rel.add(religiosos_);                  
                    break;

                    case 2:
                    HistoricoArtistico histArt_ = new HistoricoArtistico(nome, endereco, dataFundacao, descricao);
                    histArt.add(histArt_);                   
                    break;

                    case 3:
                    Lazer lazer_ = new Lazer(nome, endereco, dataFundacao, descricao);
                    laz.add(lazer_);                    
                    break;

                    case 4:
                    Gastronomico gastr_ = new Gastronomico(nome, endereco, dataFundacao, descricao);
                    gastr.add(gastr_);
                    break;
                }
            }
        }

        assertEquals(4, amb.size());
        assertEquals(2, rel.size()); 
        assertEquals(7, histArt.size());
        assertEquals(8, laz.size());
        assertEquals(6, gastr.size());
    }   
    
}

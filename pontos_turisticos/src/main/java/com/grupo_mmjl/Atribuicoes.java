package com.grupo_mmjl;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Atribuicoes extends Controle{

    JSONObject jsonObject;
    // Cria o parse de tratamento
    JSONParser parser = new JSONParser();
    
    

    // setando as atribuições no JSON ambinetal.json
    public void setAmbientais() throws FileNotFoundException, IOException, ParseException {

        JSONArray ambientalJSON = (JSONArray) parser.parse(new InputStreamReader(new FileInputStream("ambiental.json"), "UTF-8"));
        for (Object o : ambientalJSON) {

            JSONObject anb_ = (JSONObject) o;
            // Salva nas variaveis os dados retirados do arquivo
            String nome = anb_.get("nome").toString();
            String endereco = anb_.get("endereco").toString();
            String dataFundacao = anb_.get("dataFundacao").toString();
            String descricao = anb_.get("descricao").toString();

            Ambiental ambiental_ = new Ambiental(nome, endereco, dataFundacao, descricao);
            adicionarAmb(ambiental_);
        }

    }
    // listando todos os pontos turisticos ambientais
    public void listarAmbientais() {
      
        for (PontosTuristicos cont : ambiental) {
            System.out.println("\nNOME: " + cont.getNome() + "\nLOCALIZAÇÃO: " + cont.getEndereco() + "\nFUNDAÇÃO: " + cont.getDataFundacao() + "\nDESCRIÇÃO: " + cont.getDescricao());
            
        }
    }




     // setando as atribuições no JSON religioso.json
     public void setReligiosos() throws FileNotFoundException, IOException, ParseException {

        JSONArray religiososJSON = (JSONArray) parser.parse(new InputStreamReader(new FileInputStream("religioso.json"), "UTF-8"));
        for (Object i : religiososJSON) {
            JSONObject rel_ = (JSONObject) i;
            // Salva nas variaveis os dados retirados do arquivo
            String nome = rel_.get("nome").toString();
            String endereco = rel_.get("endereco").toString();
            String dataFundacao = rel_.get("dataFundacao").toString();
            String descricao = rel_.get("descricao").toString();

            Religiosos religiosos_ = new Religiosos(nome, endereco, dataFundacao, descricao);
            adicionarRel(religiosos_);
        }

    }
    // listando todos os pontos turisticos religiosos
    public void listarReligiosos() {
        for (PontosTuristicos cont : religiosos) {
            System.out.println("\nNOME: " + cont.getNome() + "\nLOCALIZAÇÃO: " + cont.getEndereco() + "\nFUNDAÇÃO: " + cont.getDataFundacao() + "\nDESCRIÇÃO: " + cont.getDescricao());
        }
    }




    // setando as atribuições no JSON historicoartistico.json
    public void setHistArt() throws FileNotFoundException, IOException, ParseException {

        JSONArray historicoJSON = (JSONArray) parser.parse(new InputStreamReader(new FileInputStream("historicoartistico.json"), "UTF-8"));
        for (Object i : historicoJSON) {
            JSONObject his_ = (JSONObject) i;
            // Salva nas variaveis os dados retirados do arquivo
            String nome = his_.get("nome").toString();
            String endereco = his_.get("endereco").toString();
            String dataFundacao = his_.get("dataFundacao").toString();
            String descricao = his_.get("descricao").toString();

            HistoricoArtistico histArt_ = new HistoricoArtistico(nome, endereco, dataFundacao, descricao);
            adicionarHist(histArt_);
        }

    }
    // listando todos os pontos turisticos historico artisticos
    public void listarHistoricos() {
        for (PontosTuristicos cont : histArtistico) {
            System.out.println("\nNOME: " + cont.getNome() + "\nLOCALIZAÇÃO: " + cont.getEndereco() + "\nFUNDAÇÃO: " + cont.getDataFundacao() + "\nDESCRIÇÃO: " + cont.getDescricao());
        }
    }




    // setando as atribuições no JSON lazer.json
    public void setLazer() throws FileNotFoundException, IOException, ParseException {

        JSONArray lazerJSON = (JSONArray) parser.parse(new InputStreamReader(new FileInputStream("lazer.json"), "UTF-8"));
        for (Object i : lazerJSON) {
            JSONObject laz_ = (JSONObject) i;
            // Salva nas variaveis os dados retirados do arquivo
            String nome = laz_.get("nome").toString();
            String endereco = laz_.get("endereco").toString();
            String dataFundacao = laz_.get("dataFundacao").toString();
            String descricao = laz_.get("descricao").toString();

            Lazer lazer_ = new Lazer(nome, endereco, dataFundacao, descricao);
            adicionarLaz(lazer_);
        }

    }
    // listando todos os pontos turisticos de lazer
    public void listarLazer() {
        for (PontosTuristicos cont : lazer) {
            System.out.println("\nNOME: " + cont.getNome() + "\nLOCALIZAÇÃO: " + cont.getEndereco() + "\nFUNDAÇÃO: " + cont.getDataFundacao() + "\nDESCRIÇÃO: " + cont.getDescricao());
        }
    }




    // setando as atribuições no JSON gastronomico.json
    public void setGastr() throws FileNotFoundException, IOException, ParseException {

        JSONArray gastrJSON = (JSONArray) parser.parse(new InputStreamReader(new FileInputStream("gastronomico.json"), "UTF-8"));
        for (Object i : gastrJSON) {
            JSONObject gas_ = (JSONObject) i;
            // Salva nas variaveis os dados retirados do arquivo
            String nome = gas_.get("nome").toString();
            String endereco = gas_.get("endereco").toString();
            String dataFundacao = gas_.get("dataFundacao").toString();
            String descricao = gas_.get("descricao").toString();

            Gastronomico gastr_ = new Gastronomico(nome, endereco, dataFundacao, descricao);
            adicionarGas(gastr_);
        }

    }
    // listando todos os pontos turisticos gastronomico.json
    public void listarGastronomicos() {
        for (PontosTuristicos cont : gastronomico) {
            System.out.println("\nNOME: " + cont.getNome() + "\nLOCALIZAÇÃO: " + cont.getEndereco() + "\nFUNDAÇÃO: " + cont.getDataFundacao() + "\nDESCRIÇÃO: " + cont.getDescricao());
        }
    }
}

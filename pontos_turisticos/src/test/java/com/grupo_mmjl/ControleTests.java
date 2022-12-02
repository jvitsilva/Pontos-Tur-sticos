package com.grupo_mmjl;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

public class ControleTests {
  
    Boolean b;
    @Test
    public void adicionarAmbTest(){
        ArrayList<Ambiental> ambiental = new ArrayList<>();

        Ambiental amb = new Ambiental("wwww", "wwww", "wwww", "wwww");
        
        ambiental.add(amb);
        
        assertEquals(1, ambiental.size());
    
    }

    @Test
    public void adicionarRelTest(){

        ArrayList<Religiosos> religiosos = new ArrayList<>();
        Religiosos rel = new Religiosos("Igreja da Sé", "rrrr", "rrrr", "rrrr");
        religiosos.add(rel);


        for (Religiosos cont : religiosos){
            if (cont.getNome() == "Igreja da Sé"){
                 b = true;
            } else  b = false;
        }
        assertTrue(b);
    }

    @Test
    public void adicionarHistTest(){
        ArrayList<HistoricoArtistico> historico = new ArrayList<>();
        HistoricoArtistico amb = new HistoricoArtistico("aaaa", "Alameda 16, casa 45", "aaaa", "aaaa");
        historico.add(amb);
        
        for (HistoricoArtistico cont : historico){
            if (cont.getEndereco() == "Alameda 16, casa 45"){
                 b = true;
            } else  b = false;
        }
        assertTrue(b);
    
    }

    @Test
    public void adicionarLazTest(){
        ArrayList<Lazer> lazer = new ArrayList<>();

        Lazer amb = new Lazer("llll", "llll", "24 de abril de 1985", "llll");
        
        lazer.add(amb);
        
        for (Lazer cont : lazer){
            if (cont.getDataFundacao() == "24 de abril de 1985"){
                 b = true;
            } else  b = false;
        }
        assertTrue(b);
    
    }

    @Test
    public void adicionarGastTest(){
        ArrayList<Gastronomico> gastronomico = new ArrayList<>();

        Gastronomico amb = new Gastronomico("wwww", "wwww", "wwww", "Bastante frequentado");
        
        gastronomico.add(amb);
        
        for (Gastronomico cont : gastronomico){
            if (cont.getDescricao() == "Bastante frequentado"){
                 b = true;
            } else  b = false;
        }
        assertTrue(b);
    
    }


    
}

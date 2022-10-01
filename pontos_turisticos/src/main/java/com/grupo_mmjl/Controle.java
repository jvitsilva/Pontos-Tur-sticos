package com.grupo_mmjl;
import java.util.ArrayList;

public class Controle {
    ArrayList<Ambiental> ambiental = new ArrayList<>();
    ArrayList<Religiosos> religiosos = new ArrayList<>();
    ArrayList<HistoricoArtistico> histArtistico = new ArrayList<>();
    ArrayList<Lazer> lazer = new ArrayList<>();
    ArrayList<Gastronomico> gastronomico = new ArrayList<>();

    

    public void adicionarAmb(Ambiental adc) {
        ambiental.add(adc);
    }

    public void adicionarRel(Religiosos adc) {
        religiosos.add(adc);
    }

    public void adicionarHist(HistoricoArtistico adc) {
        histArtistico.add(adc);
    }

    public void adicionarLaz(Lazer adc) {
        lazer.add(adc);
    }

    public void adicionarGas(Gastronomico adc) {
        gastronomico.add(adc);
    }
}

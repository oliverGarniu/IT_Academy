package com.jocdedaus.demo.model;

import com.jocdedaus.demo.document.Partida;
import com.jocdedaus.demo.entity.Jugador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JugadorModel {

    //    private int jugadorId;
    private String name;
    private LocalDate date = LocalDate.now();
    private List<PartidaModel> partides = new ArrayList<>();

//    @Transient
//    private Double percentatgeWinner;

    public JugadorModel() {
    }

    public JugadorModel(String name) {
        this.name = name;
//      this.percentatgeWinner = getPercentatgeWinner();
    }

    public JugadorModel(String name, LocalDate date, List<PartidaModel> partides) {
//        this.jugadorId = jugadorId;
        this.name = name;
        this.date = date;
        this.partides = partides;
//      this.percentatgeWinner = percentatgeWinner;
    }

    public void addPartida(PartidaModel partidaModel) {
        partides.add(partidaModel);
        partidaModel.setJugador(this);
    }

    public double calcularPercentatgePartidesWinner() {
        double partidesWinner = 0;
        double percentatgePWDecimals = 0;
        double percentatgePartidesWinner = 0;

        for (PartidaModel partida : partides) {
            if (partida.isWinner()) {
                partidesWinner++;
            }
            int totalPartides = partides.size();
            percentatgePWDecimals = (partidesWinner * 100) / totalPartides;
            // Per retornar només dos decimals
            percentatgePartidesWinner = (Math.round(percentatgePWDecimals * 100.0) / 100.0);
        }
        return percentatgePartidesWinner;
    }

    public void removePartida(Partida partida) {
        partides.remove(partida);
    }

    public void removeAllPartidesFromJugador(List<Partida> partides) {
        partides.removeAll(partides);
    }

//    //  Transformar de JugadorDto a Jugador
//    public static Jugador from(JugadorDto jugadorDto) {
//        Jugador jugador = new Jugador();
//        jugador.setName(jugadorDto.getName());
//        return jugador;
//    }

//    public int getJugadorId() {
//        return jugadorId;
//    }
//
//    public void setJugadorId(int jugadorId) {
//        this.jugadorId = jugadorId;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

//    public Double getPercentatgeWinner() {
//        return percentatgeWinner;
//    }
//
//    public void setPercentatgeWinner(Double percentatgeWinner) {
//        this.percentatgeWinner = percentatgeWinner;
//    }

    public List<PartidaModel> getPartides() {
        return partides;
    }

    public void setPartides(List<PartidaModel> partides) {
        this.partides = partides;
    }

    @Override
    public String toString() {
        return "Jugador{" +
//                "jugadorId=" + jugadorId +
                ", name='" + name + '\'' +
                ", date=" + date +
//                ", percentatgeWinner=" + percentatgeWinner +
                ", partides=" + partides +
                '}';
    }
}



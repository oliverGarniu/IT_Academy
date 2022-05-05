package com.jocdedaus.model;

import com.jocdedaus.model.dto.JugadorDto;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "Jugadors")
public class Jugador {

    @Transient
    public static final String SEQUENCE_NAME = "jugadors_sequence";

    @Id
    private int jugadorId;

    @Field(name = "jugador_name")
    private String name;

    @Field(name = "date")
    private LocalDate date = LocalDate.now();

    private List<Partida> partides = new ArrayList<>();

    public Jugador() {
    }

    public Jugador(String name) {
        this.name = name;
    }

    public Jugador(int jugadorId, String name, LocalDate date, List<Partida> partides) {
        this.jugadorId = jugadorId;
        this.name = name;
        this.date = date;
        this.partides = partides;
    }

    public void addPartida(Partida partida) {
        partides.add(partida);
        partida.setJugador(this);
    }

    public double calcularPercentatgePartidesWinner() {
        double partidesWinner = 0;
        double percentatgePWDecimals = 0;
        double percentatgePartidesWinner = 0;

        for (Partida partida : partides) {
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

    //  Transformar de JugadorDto a Jugador
    public static Jugador from(JugadorDto jugadorDto) {
        Jugador jugador = new Jugador();
        jugador.setName(jugadorDto.getName());
        return jugador;
    }

    public int getJugadorId() {
        return jugadorId;
    }

    public void setJugadorId(int jugadorId) {
        this.jugadorId = jugadorId;
    }

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

    public List<Partida> getPartides() {
        return partides;
    }

    public void setPartides(List<Partida> partides) {
        this.partides = partides;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "jugadorId=" + jugadorId +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", partides=" + partides +
                '}';
    }
}

package com.jocdedaus.model.dto;

import com.jocdedaus.model.Jugador;

import java.time.LocalDate;

public class PlainJugadorDto {
    private int jugadorId;
    private String name;
    private LocalDate date = LocalDate.now();

    public static PlainJugadorDto from(Jugador jugador) {
        PlainJugadorDto plainJugadorDto = new PlainJugadorDto();
        plainJugadorDto.setJugadorId(jugador.getJugadorId());
        plainJugadorDto.setName(jugador.getName());
        plainJugadorDto.setDate(jugador.getDate());
        return plainJugadorDto;
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
}

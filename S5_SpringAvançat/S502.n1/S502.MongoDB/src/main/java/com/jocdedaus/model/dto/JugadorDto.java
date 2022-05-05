package com.jocdedaus.model.dto;

import com.jocdedaus.model.Jugador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JugadorDto {
    private int jugadorId;
    private String name;
    private LocalDate date = LocalDate.now();
    private List<PartidaDto> partidesDto = new ArrayList<>();

    //  Transformar de Jugador a JugadorDto
    public static JugadorDto from(Jugador jugador) {
        JugadorDto jugadorDto = new JugadorDto();
        jugadorDto.setJugadorId(jugador.getJugadorId());
        jugadorDto.setName(jugador.getName());
        jugadorDto.setDate(jugador.getDate());
        jugadorDto.setPartidesDto(jugador.getPartides().stream().map(PartidaDto::from).collect(Collectors.toList()));
        return jugadorDto;
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

    public List<PartidaDto> getPartidesDto() {
        return partidesDto;
    }

    public void setPartidesDto(List<PartidaDto> partidesDto) {
        this.partidesDto = partidesDto;
    }
}
package com.jocdedaus.demo.model.dto;

import com.jocdedaus.demo.model.Partida;

public class PartidaDto {
    private int partidaId;
    private PlainJugadorDto plainJugadorDto;

    public PartidaDto() {
    }

    public PartidaDto(int partidaId) {
        this.partidaId = partidaId;
    }

//  Transformar de Partida a PartidaDto
    public static PartidaDto from(Partida partida) {
        PartidaDto partidaDto = new PartidaDto();
        partidaDto.setPartidaId(partida.getPartidaId());
        return partidaDto;
    }

    public int getPartidaId() {
        return partidaId;
    }

    public void setPartidaId(int partidaId) {
        this.partidaId = partidaId;
    }
}
package com.jocdedaus.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jocdedaus.demo.model.dto.PartidaDto;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "partides")
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partida_id")
    private int partidaId;

    @Column(name = "dau_1")
    private int dau1;

    @Column(name = "dau_2")
    private int dau2;

//    @Column(name = "winner")
    private boolean winner;

//    @Column(name = "percentatge_winner")
//    private Double percentatgeWinner;

    @JsonIgnore  //
    @ManyToOne
    @JoinColumn(name = "jugador_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Jugador jugador;

    public Partida() {
    }

    public Partida(Jugador jugador) {
        this.partidaId = partidaId;
        this.dau1 = randomTiradaDau();
        this.dau2 = randomTiradaDau();
        this.winner = tiradaWinner();
        this.jugador = jugador;
    }

    public Partida(int partidaId, int dau1, int dau2, boolean winner, Jugador jugador) {
        this.partidaId = partidaId;
        this.dau1 = dau1;
        this.dau2 = dau2;
        this.winner = winner;
        this.jugador = jugador;
    }

    //  Transformar de PartidaDto a Partida
    public static Partida from(PartidaDto partidaDto) {
        Partida partida = new Partida();
        partida.setPartidaId(partidaDto.getPartidaId());
        return partida;
    }

    public int getPartidaId() {
        return partidaId;
    }

    public void setPartidaId(int partidaId) {
        this.partidaId = partidaId;
    }

    public int getDau1() {
        return dau1;
    }

    public void setDau1(int dau1) {
        this.dau1 = dau1;
    }

    public int getDau2() {
        return dau2;
    }

    public void setDau2(int dau2) {
        this.dau2 = dau2;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public int randomTiradaDau() {
//        int min = 1;
//        int max = 6;
//        Random random = new Random();
//        int tirada = random.nextInt(max) + min;

        int tirada = (int) Math.floor(Math.random() * 6 + 1);
        return tirada;
    }

    public boolean tiradaWinner() {
        if (this.dau1 + this.dau2 == 7) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Partida{" +
                "partidaId=" + partidaId +
                ", dau1=" + dau1 +
                ", dau2=" + dau2 +
                ", winner=" + winner +
                ", jugador=" + jugador +
                '}';
    }
}

package com.jocdedaus.demo.entity;

import com.jocdedaus.demo.document.Partida;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jugadors")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jugador_id")
    private int jugadorId;

    @Column(name = "jugador_name")
    private String name;

    private LocalDate date = LocalDate.now();

//    @Column(name = "percentatge_winner")
//    private Double percentatgeWinner = calcularPercentatgePartidesWinner();

//    @OneToMany(mappedBy = "jugador", cascade = CascadeType.ALL, orphanRemoval = true)
//  @JoinColumn(name = "jugador_id")
    private List<Partida> partides = new ArrayList<>();

//    @Transient
//    private Double percentatgeWinner;

    public Jugador() {
    }

    public Jugador(String name) {
        this.name = name;
//      this.percentatgeWinner = getPercentatgeWinner();
    }

    public Jugador(int jugadorId, String name, LocalDate date, List<Partida> partides) {
        this.jugadorId = jugadorId;
        this.name = name;
        this.date = date;
        this.partides = partides;
//      this.percentatgeWinner = percentatgeWinner;
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

//    //  Transformar de JugadorDto a Jugador
//    public static Jugador from(JugadorDto jugadorDto) {
//        Jugador jugador = new Jugador();
//        jugador.setName(jugadorDto.getName());
//        return jugador;
//    }

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

//    public Double getPercentatgeWinner() {
//        return percentatgeWinner;
//    }
//
//    public void setPercentatgeWinner(Double percentatgeWinner) {
//        this.percentatgeWinner = percentatgeWinner;
//    }

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
//                ", percentatgeWinner=" + percentatgeWinner +
                ", partides=" + partides +
                '}';
    }
}

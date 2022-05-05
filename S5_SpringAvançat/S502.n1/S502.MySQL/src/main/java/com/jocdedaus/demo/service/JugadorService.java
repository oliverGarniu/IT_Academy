package com.jocdedaus.demo.service;

import com.jocdedaus.demo.model.Jugador;
import com.jocdedaus.demo.model.Partida;
import com.jocdedaus.demo.model.exception.EmptyJugadorListException;
import com.jocdedaus.demo.model.exception.EmptyPartidaListException;
import com.jocdedaus.demo.model.exception.JugadorNotFoundException;
import com.jocdedaus.demo.model.exception.SameJugadorNameInListException;
import com.jocdedaus.demo.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
public class JugadorService {

    private JugadorRepository jugadorRepository;
    private PartidaService partidaService;
//    private ModelMapper mapper;

    @Autowired
    public JugadorService(JugadorRepository jugadorRepository, PartidaService partidaService) {
        this.jugadorRepository = jugadorRepository;
        this.partidaService = partidaService;
    }

    public Jugador addJugador(Jugador jugador) {
        List<Jugador> jugadors = jugadorRepository.findAll();
        int count = 0;
        boolean senseNom = false;

        if (jugador.getName().isBlank()) {
            jugador.setName("Anonymous");
            for (Jugador nomJugador : jugadors) {
                if (nomJugador.getName().equalsIgnoreCase(jugador.getName())) {
                    jugador.setName("Anonymous" + " " + (++count));
                    senseNom = true;
                }
            }
        }

        for (Jugador nomJugador : jugadors) {
            if (nomJugador.getName().equalsIgnoreCase(jugador.getName()) && !senseNom) {
                throw new SameJugadorNameInListException();
            }
        }
        return jugadorRepository.save(jugador);
    }

//    public Jugador actualitzaJugador(Jugador jugador) {
//        return jugadorRepository.save(jugador);
//    }

    public List<Jugador> getAllJugadors() {
        List<Jugador> jugadors = jugadorRepository.findAll();
        if (jugadors.isEmpty()) {
            throw new EmptyJugadorListException();
        }
        return jugadors;
    }
//        public List<Jugador> getAllJugadors() {
//        return StreamSupport
//                .stream(jugadorRepository.findAll().spliterator(), false)
//                .collect(Collectors.toList());
//    }

    public Map<String, Double> getAllJugadorsAndPercentatges(List<Jugador> jugadors) {
        Map<String, Double> jugadorsPercentatge = new HashMap<>();
        if (jugadors.isEmpty()) {
            throw new EmptyJugadorListException();
        }

        String nomJugador;
        Double percentatge = 0.0;

        for (Jugador jugador : jugadors) {
            nomJugador = jugador.getName();
            percentatge = jugador.calcularPercentatgePartidesWinner();
            jugadorsPercentatge.put(nomJugador, percentatge);
        }
        return jugadorsPercentatge;
    }

    public List<Partida> getAllPartidesFromJugador(Jugador jugador) {
        List<Partida> partides = jugador.getPartides();
        if (partides.isEmpty()) {
            throw new EmptyPartidaListException();
        }
        return partides;
    }

    public Jugador getJugador(int jugadorId) {
        return jugadorRepository.findById(jugadorId).orElseThrow(() -> new JugadorNotFoundException(jugadorId));
    }

    public Jugador deleteJugador(int jugadorId) {
        Jugador jugador = getJugador(jugadorId);
        jugadorRepository.delete(jugador);
        return jugador;
    }

    @Transactional
    public Jugador editJugador(int jugadorId, Jugador jugador) {
        Jugador jugadorToEdit = getJugador(jugadorId);
        jugadorToEdit.setName(jugador.getName());
        return jugadorToEdit;
    }

    @Transactional
    public Jugador playPartida(Jugador jugador) {
        Partida partida = partidaService.playPartida(jugador);
        jugador.addPartida(partida);
        return jugador;
    }

//    @Transactional
//    public Jugador addPartidaToJugador(int jugadorId, int partidaId) {
//        Jugador jugador = getJugador(jugadorId);
//        Partida partida = partidaService.getPartida(partidaId);
//        jugador.addPartida(partida);
//        partida.setJugador(jugador);
//        return jugador;
//    }

    @Transactional
    public Jugador removePartidaFromJugador(int jugadorId, int partidaId) {
        Jugador jugador = getJugador(jugadorId);
        Partida partida = partidaService.getPartida(partidaId);
        jugador.removePartida(partida);
        return jugador;
    }

    @Transactional
    public Jugador removeAllPartidesFromJugador(int jugadorId) {
        Jugador jugador = getJugador(jugadorId);
        List<Partida> partides = jugador.getPartides();
        jugador.removeAllPartidesFromJugador(partides);
        return jugador;
    }

//    public List<Partida> getAllPartidesFromAllPlayers(List<Jugador> jugadors) {
//        List<Partida> partidesFromAllJugadors = new ArrayList<Partida>();
//        partidesFromAllJugadors = partidaService.getAllPartides();
//        int numPartidesFromAllJugadors = partidesFromAllJugadors.size();
//        return partidesFromAllJugadors;
//    }

    public String getPercentatgeFromAllJugadors(List<Jugador> jugadors) {
        int totalJugadors = jugadors.size();
        double percentatgeFromAllJugadorsDec;
        double percentatgeFromAllJugadors;
        double totalPercentatgesJugadors = 0.0;
        for (Jugador jugador : jugadors) {
            totalPercentatgesJugadors += jugador.calcularPercentatgePartidesWinner();
        }
        percentatgeFromAllJugadorsDec = totalPercentatgesJugadors / totalJugadors;
        // Per retornar només dos decimals
        percentatgeFromAllJugadors = (Math.round(percentatgeFromAllJugadorsDec * 100.0) / 100.0);
        return "El percentatge Winner de tots els jugadors és: " + percentatgeFromAllJugadors + "%";
    }

    public String getWinnerJugador(Map<String, Double> jugadorsAndPercentatge) {
        String jugador = Collections.max(jugadorsAndPercentatge.entrySet(),
                Comparator.comparingDouble(Map.Entry::getValue)).getKey();

//        double maxValueInMap = (Collections.max(jugadorsAndPercentatge.values()));
//        String jugador = null;
//        for (Map.Entry<String, Double> entry : jugadorsAndPercentatge.entrySet()) {
//            if (entry.getValue() == maxValueInMap) {
//                jugador = entry.getKey();
//            }

        return "El jugador WINNER és: " + jugador;
    }

    public String getLoserJugador(Map<String, Double> jugadorsAndPercentatge) {
        String jugador = Collections.min(jugadorsAndPercentatge.entrySet(),
                Comparator.comparingDouble(Map.Entry::getValue)).getKey();

        return "El jugador LOSER és: " + jugador;
    }
}



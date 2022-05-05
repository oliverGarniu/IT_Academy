package com.jocdedaus.service;

import com.jocdedaus.model.Jugador;
import com.jocdedaus.model.Partida;
import com.jocdedaus.model.exception.PartidaNotFoundException;
import com.jocdedaus.repository.JugadorRepository;
import com.jocdedaus.repository.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidaService {

    private final PartidaRepository partidaRepository;

    @Autowired
    private JugadorRepository jugadorRepository;

//    @Autowired
//    private SequenceGeneratorService sequenceGeneratorService;

    @Autowired
    public PartidaService(PartidaRepository partidaRepository) {
        this.partidaRepository = partidaRepository;
    }

    public Partida getPartida(int partidaId) {
        return partidaRepository.findById(partidaId).orElseThrow(() -> new PartidaNotFoundException(partidaId));
    }

    public Partida playPartida(Jugador jugador) {
        Partida partida = new Partida(jugador);
//        partida.setPartidaId((int) sequenceGeneratorService.generateSequence(Partida.SEQUENCE_NAME));
        jugador.addPartida(partida);
        jugadorRepository.save(jugador);
        partidaRepository.save(partida);
        return partida;
    }

//    public Partida deletePartida(int partidaId) {
//        Partida partida = getPartida(partidaId);
//        partidaRepository.delete(partida);
//        return partida;
//    }

    public List<Partida> getAllPartides() {
        return partidaRepository.findAll();
    }

//    @Transactional
//    public void removePartida(Partida partida) {
//        List<Partida> partides = getAllPartides();
//        partides.remove(partida);
//    }

//    @Transactional
//    public void removeAllPartidesFromJugador(List<Partida> partides) {
//        partides.removeAll(partides);
//    }

//    public List<Partida> getAllPartides() {
//        return StreamSupport
//                .stream(partidaRepository.findAll().spliterator(), false)
//                .collect(Collectors.toList());
//    }
}

//package com.jocdedaus.demo.controller;
//
//import com.jocdedaus.demo.document.Partida;
//import com.jocdedaus.demo.model.dto.PartidaDto;
//import com.jocdedaus.demo.service.PartidaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping("/games")
//public class PartidaController {
//
//    private final PartidaService partidaService;
//
//    @Autowired
//    public PartidaController(PartidaService partidaService) {
//        this.partidaService = partidaService;
//    }
//
////    @PostMapping
////    public ResponseEntity<PartidaDto> addPartida(@RequestBody final PartidaDto partidaDto) {
////        Partida partida = partidaService.addPartida(Partida.from(partidaDto));
////        return new ResponseEntity<>(PartidaDto.from(partida), HttpStatus.OK);
////    }
//
//    @GetMapping
//    public ResponseEntity<List<PartidaDto>> getAllPartides() {
//        List<Partida> partides = partidaService.getAllPartides();
//        List<PartidaDto> partidesDto = partides.stream().map(PartidaDto::from).collect(Collectors.toList());
//        return new ResponseEntity<>(partidesDto, HttpStatus.OK);
//    }
//
//    @GetMapping(value = "{partidaId}")
//    public ResponseEntity<PartidaDto> getPartida(@PathVariable final int partidaId) {
//        Partida partida = partidaService.getPartida(partidaId);
//        return new ResponseEntity<>(PartidaDto.from(partida), HttpStatus.OK);
//    }
//
////    @DeleteMapping(value = "{partidaId}")
////    public ResponseEntity<PartidaDto> deletePartida(@PathVariable final int partidaId) {
////        Partida partida = partidaService.deletePartida(partidaId);
////        return new ResponseEntity<>(PartidaDto.from(partida), HttpStatus.OK);
////    }
//
////    @PutMapping(value = "{partidaId}")
////    public ResponseEntity<PartidaDto> editPartida(@PathVariable final int partidaId, @RequestBody final PartidaDto partidaDto) {
////        Partida editedPartida = partidaService.editPartida(partidaId, Partida.from(partidaDto));
////        return new ResponseEntity<>(PartidaDto.from(editedPartida), HttpStatus.OK);
////    }
//}

package com.rlti.actdigital.pauta.application.api;

import com.rlti.actdigital.pauta.domain.Pauta;
import lombok.Value;

import java.time.LocalDateTime;

@Value
public class PautaResponse {
    Long idPauta;
    String descricao;
    LocalDateTime horarioInicio;
    LocalDateTime horarioFim;

    public PautaResponse(Pauta pauta) {
        this.idPauta = pauta.getIdPauta();
        this.descricao = pauta.getDescricao();
        this.horarioInicio = pauta.getHorarioInicio();
        this.horarioFim = pauta.getHorarioFim();
    }
}

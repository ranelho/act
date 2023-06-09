package com.rlti.actdigital.associados.application.api;

import com.rlti.actdigital.associados.domain.Associado;
import lombok.Value;

import java.util.List;
import java.util.UUID;

@Value
public class AssociadoResponse {
    UUID idAssociado;
    String nome;
    String cpf;
    String status;

    public AssociadoResponse(Associado associado) {
        this.idAssociado = associado.getIdAssociado();
        this.nome = associado.getNome();
        this.cpf = associado.getCpf();
        this.status = associado.getStatus().toString();
    }
    public static List<AssociadoResponse> converte(List<Associado> associados) {
        return associados.stream().map(AssociadoResponse::new).toList();
    }
}

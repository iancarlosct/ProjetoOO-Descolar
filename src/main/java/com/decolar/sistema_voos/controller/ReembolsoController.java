package com.decolar.sistema_voos.controller;

import com.decolar.sistema_voos.service.ReembolsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/reembolso")
@CrossOrigin(origins = "*")
public class ReembolsoController {

    @Autowired
    private ReembolsoService reembolsoService;

    @GetMapping("/calcular")
    public ResponseEntity<ReembolsoResponse> calcular(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataVoo,
            @RequestParam BigDecimal valorTotal) {

        ReembolsoService.ReembolsoResult result = reembolsoService.calcularReembolso(dataVoo, valorTotal);
        ReembolsoResponse response = new ReembolsoResponse(
                result.getValorReembolso(),
                result.getDescricao(),
                result.getPercentual()
        );
        return ResponseEntity.ok(response);
    }

    static class ReembolsoResponse {
        private BigDecimal valorReembolso;
        private String descricao;
        private BigDecimal percentual;

        public ReembolsoResponse(BigDecimal valorReembolso, String descricao, BigDecimal percentual) {
            this.valorReembolso = valorReembolso;
            this.descricao = descricao;
            this.percentual = percentual;
        }

        public BigDecimal getValorReembolso() { return valorReembolso; }
        public String getDescricao() { return descricao; }
        public BigDecimal getPercentual() { return percentual; }
    }
}
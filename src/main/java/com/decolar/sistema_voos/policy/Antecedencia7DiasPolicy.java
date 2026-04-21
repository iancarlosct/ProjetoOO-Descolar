package com.decolar.sistema_voos.policy;

import java.math.BigDecimal;

public class Antecedencia7DiasPolicy extends CancelPolicy {

    @Override
    public BigDecimal getPercentualReembolso() {
        return new BigDecimal("0.90");
    }

    @Override
    public String getDescricao() {
        return "Cancelamento com mais de 7 dias de antecedência: 90% de reembolso.";
    }
}
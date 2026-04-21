package com.decolar.sistema_voos.policy;

import java.math.BigDecimal;

public class Antecedencia2DiasPolicy extends CancelPolicy {

    @Override
    public BigDecimal getPercentualReembolso() {
        return new BigDecimal("0.50");
    }

    @Override
    public String getDescricao() {
        return "Cancelamento entre 2 e 7 dias de antecedência: 50% de reembolso.";
    }
}
package com.decolar.sistema_voos.policy;

import java.math.BigDecimal;

public class Antecedencia0DiasPolicy extends CancelPolicy {

    @Override
    public BigDecimal getPercentualReembolso() {
        return BigDecimal.ZERO;
    }

    @Override
    public String getDescricao() {
        return "Cancelamento com menos de 2 dias de antecedência: sem reembolso.";
    }
}
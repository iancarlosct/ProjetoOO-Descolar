package com.decolar.sistema_voos.policy;

import java.math.BigDecimal;

public class VooJaOcorridoPolicy extends CancelPolicy {

    @Override
    public BigDecimal getPercentualReembolso() {
        return BigDecimal.ZERO;
    }

    @Override
    public String getDescricao() {
        return "O voo já ocorreu. Não há reembolso.";
    }
}
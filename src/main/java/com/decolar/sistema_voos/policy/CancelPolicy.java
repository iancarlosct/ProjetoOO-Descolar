package com.decolar.sistema_voos.policy;

import java.math.BigDecimal;

public abstract class CancelPolicy {

    public abstract BigDecimal getPercentualReembolso();

    public abstract String getDescricao();
}
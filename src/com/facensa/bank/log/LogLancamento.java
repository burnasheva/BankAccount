package com.facensa.bank.log;

import com.facensa.bank.model.LancamentoDTO;

public interface LogLancamento {
	//Todo m�todo de interface � publico e abstrato
	public abstract void novoLancamento(LancamentoDTO lancamentoDTO);
	
}

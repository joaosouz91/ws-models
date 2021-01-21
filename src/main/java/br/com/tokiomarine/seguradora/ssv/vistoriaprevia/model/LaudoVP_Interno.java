package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.model;

import br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model.LaudoVP;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

@SuppressWarnings("serial")
public class LaudoVP_Interno extends LaudoVP {

	private Long idRecepcaoLaudo;
	private Date dataTransmissao;

	public LaudoVP_Interno(LaudoVP laudo) {
		
		try {
			BeanUtils.copyProperties(this, laudo);
		} catch (IllegalAccessException e) {
		} catch (InvocationTargetException e) {
		}
	}
	
	public Long getIdRecepcaoLaudo() {
		return idRecepcaoLaudo;
	}

	public void setIdRecepcaoLaudo(Long idRecepcaoLaudo) {
		this.idRecepcaoLaudo = idRecepcaoLaudo;
	}

	public Date getDataTransmissao() {
		return dataTransmissao;
	}

	public void setDataTransmissao(Date dataTransmissao) {
		this.dataTransmissao = dataTransmissao;
	}
}

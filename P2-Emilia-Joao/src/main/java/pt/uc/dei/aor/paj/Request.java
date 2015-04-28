package pt.uc.dei.aor.paj;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Request implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject Estatistica est;
	@Inject Historial hist;
	@Inject Calculadora calc;
	private String exp;
	public Request() {
		super();	
	}
	public String getEst() {
		return this.est.getResultado();
	}
	public void setEst(String exp) {
		this.est.setResultado(exp);;
	}
	public String getHist() {
		return this.hist.getHist();
	}
	public void setHist(String exp) {
		this.hist.setHist(exp);
	}
	public String getCalc() {
		return this.calc.getExp();
	}
	public void setCalc(String exp) {
		this.calc.setExp(this.exp);
	}	
	
	
}
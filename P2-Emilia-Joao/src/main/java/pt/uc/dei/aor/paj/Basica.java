package pt.uc.dei.aor.paj;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named 
@RequestScoped
public class Basica implements Serializable {
	
	private static final long serialVersionUID = 3730437403554200689L;
	
	@Inject Calculadora calc;
	@Inject Estatistica est;
	@Inject PickListView pickHist;
	
	private String display;
	private String firstdigit;
	private String btnradio;
	private String resultado;
	
	public Basica() {
		this.display = "0.0";
		this.resultado = "0.0";
		this.firstdigit = "true";
		this.btnradio = "rad";
	}

	
	
	public String getDisplay() {
		return resultado;
	}
	
	public void setDisplay(String display) {
		this.display = display;
	}
	
	public void setValor(String display) {
		est.setResultado(display);
	} 
	
	public String getFirstdigit() {
		return firstdigit;
	}

	public void setFirstdigit(String firstdigit) {
		this.firstdigit = firstdigit;
	}

	public String getBtnradio() {
		return btnradio;
	}

	public void setBtnradio(String btnradio) {
		this.btnradio = btnradio;
	}

	public void btnequal() {String aux="";
		pickHist.init(this.display);
		calc.setExp(this.display);
		aux=pickHist.getItemSelect();
		this.resultado=calc.getExp();
		setValor(this.display);
		if (!aux.equals("$"))
			setDisplay(aux);
		this.setFirstdigit("true");
	}
}

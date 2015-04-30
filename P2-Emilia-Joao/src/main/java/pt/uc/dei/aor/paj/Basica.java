package pt.uc.dei.aor.paj;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
//import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named 
@RequestScoped
public class Basica implements Serializable {
	@Inject Calculadora calc ;
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

	public void btnequal() {
	
	    //request.setCalc(display);
		//this.display = request.getCalc();
			//this.resultado="34";
		calc.setExp(this.display);
		this.resultado=calc.getExp();
		this.setFirstdigit("true");
	}
}

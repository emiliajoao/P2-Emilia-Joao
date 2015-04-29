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
	private static final long serialVersionUID = 1L;
	private String display="0.0";
	private String firstdigit="true";
	private String resultado;

	
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

	public void btnequal() {
	
	    //request.setCalc(display);
		//this.display = request.getCalc();
			//this.resultado="34";
		calc.setExp(this.display);
		this.resultado=calc.getExp();
		this.setFirstdigit("true");
	}
}

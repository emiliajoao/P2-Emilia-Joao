package pt.uc.dei.aor.paj;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class Historial implements Serializable{
	private ArrayList<String> hist;

	public Historial(){
		super();
		this.hist = new ArrayList<String>();
	}

	public String getHist() {
		String aux="";
		for(String p:hist)
			aux+=p+"\n";
		return aux;
	}

	public void setHist(String exp) {
		this.hist.add(exp);
	}
	
	
	

}

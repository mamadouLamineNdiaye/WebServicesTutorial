package metier;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="compte")
public class Compte implements Serializable {
	private long idCompte;
	private double solde;
	private Date dateCreation;
	public Compte(long idCompte, double solde, Date dateCreation) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}
	public Compte() {
		super();
	}
	public long getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(long idCompte) {
		this.idCompte = idCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}

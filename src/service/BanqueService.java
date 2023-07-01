package service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import metier.Compte;
import java.util.Random;

@WebService (name="BanqueWS")
public class BanqueService {
	int min = 1, max = 10;
	Random random = new Random();
	
	@WebMethod(operationName="ConversionEuroToCfa")
	public double euroToCfa(@WebParam(name="montant")double montant) {
		return montant * 653.65;
	}
	
	@WebMethod(operationName="ConversionCfaToEuro")
	public double cfaToEuro(@WebParam(name="montant")double montant) {
		return montant / 653.65;
	}
	
	@WebMethod
	public Compte getCompteById(@WebParam(name="identifiantCompte")long id) {
		return new Compte(id, (random.nextInt(max + min) + min)*500, new Date());
	}
	
	@WebMethod
	public List<Compte> getComptes(){
		List<Compte> comptes = new ArrayList<>();
		comptes.add(new Compte(1L, (random.nextInt(max + min) + min)*500, new Date()));
		comptes.add(new Compte(2L, (random.nextInt(max + min) + min)*500, new Date()));
		comptes.add(new Compte(3L, (random.nextInt(max + min) + min)*500, new Date()));
		return comptes;
	}
}

package andereKlasse;

import javax.inject.Inject;
import javax.inject.Provider;

import allInterfaces.IKundenFunction;
import allKlasseImp.KundenFunctionImp;

public class MainKlasse {
	@Inject
	static
	Provider<IKundenFunction> kundenFunction;

	public static void main(String[] args) {
	 KundenFunctionImp test = new KundenFunctionImp();
			
		Kunde neuKunde = new Kunde("Ndjoumessi","Kant", 9 );
		Kunde neuKunde1 = new Kunde("noudjoun","Hermine", 19 );
		
		test.legeKundeAn(neuKunde);
		test.legeKundeAn(neuKunde1);
		System.out.println("done");
		
		test.kundelesen();
		

	}

}

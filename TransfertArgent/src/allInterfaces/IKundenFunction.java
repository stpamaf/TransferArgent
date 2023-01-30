package allInterfaces;

import andereKlasse.Kunde;

public interface IKundenFunction {
	int legeKundeAn(Kunde kunde);
	void loescheKunde(String kundeId);
	void kundeAnmelden(Kunde kunde);
}

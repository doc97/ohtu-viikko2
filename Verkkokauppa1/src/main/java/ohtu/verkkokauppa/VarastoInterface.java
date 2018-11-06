package ohtu.verkkokauppa;

/**
 * Created by Daniel Riissanen on 6.11.2018.
 */
public interface VarastoInterface {

    Tuote haeTuote(int id);

    int saldo(int id);

    void otaVarastosta(Tuote t);

    void palautaVarastoon(Tuote t);
}

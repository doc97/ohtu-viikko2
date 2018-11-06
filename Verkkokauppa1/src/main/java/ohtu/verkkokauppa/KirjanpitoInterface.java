package ohtu.verkkokauppa;

import java.util.ArrayList;

/**
 * Created by Daniel Riissanen on 6.11.2018.
 */
public interface KirjanpitoInterface {
    void lisaaTapahtuma(String tapahtuma);

    ArrayList<String> getTapahtumat();
}

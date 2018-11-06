package ohtu.verkkokauppa;

/**
 * Created by Daniel Riissanen on 6.11.2018.
 */
public interface PankkiInterface {
    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
}

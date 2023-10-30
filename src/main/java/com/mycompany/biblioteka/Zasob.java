/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteka;

/**
 *
 * @author karol
 */
public class Zasob {

    public static Zasob UttworzZasob(
            boolean czyWyporzyczona,
            String tytul,
            int maxCzasWyporzeczenia,
            String autor,
            int rokWydania
    ) {
        return new Zasob(
                czyWyporzyczona,
                tytul,
                maxCzasWyporzeczenia,
                autor,
                rokWydania
        );
    }
    protected boolean CzyWypozyczona;
    protected String Tytul;
    protected int MaxCzasWyporzyczenia;
    protected String Autor;
    protected int RokWydanie;

    private Zasob(
            boolean czyWyporzyczona,
            String tytul,
            int maxCzasWyporzeczenia,
            String autor,
            int rokWydania
    ) {
        this.CzyWypozyczona = czyWyporzyczona;
        this.Tytul = tytul;
        this.MaxCzasWyporzyczenia = maxCzasWyporzeczenia;
        this.Autor = autor;
        this.RokWydanie = rokWydania;
    }

    /**
     * @return the CzyWypozyczona
     */
    public boolean isCzyWypozyczona() {
        return CzyWypozyczona;
    }

    /**
     * @return the Tytul
     */
    public String getTytul() {
        return Tytul;
    }

    /**
     * @return the MaxCzasWyporzyczenia
     */
    public int getMaxCzasWyporzyczenia() {
        return MaxCzasWyporzyczenia;
    }

    /**
     * @return the Autor
     */
    public String getAutor() {
        return Autor;
    }

    /**
     * @return the RokWydanie
     */
    public int getRokWydanie() {
        return RokWydanie;
    }

    /**
     * @param CzyWypozyczona the CzyWypozyczona to set
     */
    public void setCzyWypozyczona(boolean CzyWypozyczona) {
        this.CzyWypozyczona = CzyWypozyczona;
    }

    /**
     * @param Tytul the Tytul to set
     */
    public void setTytul(String Tytul) {
        this.Tytul = Tytul;
    }

    /**
     * @param MaxCzasWyporzyczenia the MaxCzasWyporzyczenia to set
     */
    public void setMaxCzasWyporzyczenia(int MaxCzasWyporzyczenia) {
        this.MaxCzasWyporzyczenia = MaxCzasWyporzyczenia;
    }

    /**
     * @param Autor the Autor to set
     */
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    /**
     * @param RokWydanie the RokWydanie to set
     */
    public void setRokWydanie(int RokWydanie) {
        this.RokWydanie = RokWydanie;
    }

}

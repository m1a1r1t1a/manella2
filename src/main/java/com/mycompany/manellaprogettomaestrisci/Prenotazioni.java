/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manellaprogettomaestrisci;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Marta Manella
 */

public class Prenotazioni  implements Serializable
{
    private int codice;
    private LocalDateTime data;
    private LocalDate data2;
    private String nome;
    private String cognome;
    private String nomeMaestro;
    private String cognomeMaestro;
    
    /**
     * costruttore della classe Prenotazioni
     * @param codice codice numerioco della prenotazione
     * @param anno anno in cui  si vuole fare la lezione
     * @param mese mese in cui  si vuole fare la lezione
     * @param giorno giorno in cui  si vuole fare la lezione
     * @param ora ora in cui  si vuole fare la lezione
     * @param minuti minuti in cui  si vuole fare la lezione
     * @param nome nome del cliente che effettua la prenotazione
     * @param cognome cognome del cliente che effettua la prenotazione
     * @param nomeMaestro nome del maestro con cui si vuole svolgere la lezione
     * @param cognomeMaestro  cognome del maestro con cui si vuole svolgere la lezione
     */
    public Prenotazioni(int codice, int anno, int mese, int giorno, int ora, int minuti , String nome, String cognome, String nomeMaestro, String cognomeMaestro) {
        this.codice = codice;
        this.data = LocalDateTime.of(anno, mese, giorno, ora, minuti);
        this.data2= LocalDate.of(anno, mese, giorno);
        this.nome = nome;
        this.cognome = cognome;
        this.nomeMaestro = nomeMaestro;
        this.cognomeMaestro = cognomeMaestro;
    }
    /**
     * costruttore di copia della classe Prenotazioni, consente di istanziare una nuova prenotazione
     * @param m  prenotazione da cui verrà instanziata una nuova prenotazione
     * la prenotazione instanziata sarà una copia della prenotazione m
     */ 

    Prenotazioni(Prenotazioni m) 
    {
        codice=m.getCodice();
        data=m.getData();
        data2=m.getData2();
        nome=m.getNome();
        cognome=m.getCognome();
        nomeMaestro=m.getNomeMaestro();
        cognomeMaestro=m.getCognomeMaestro();
    }
    

    /**
     * metodo getter che ti fa vedere il valore della variabile
     * @return  valore di codice 
     */
    public int getCodice() 
    {
        return codice;
    }

    /**
     * metodo setter che ti fa settare il valore della variabile
     * @param codice  varibile
     */
    public void setCodice(int codice) 
    {
        this.codice = codice;
    }

    /**
     * metodo getter che ti fa vedere il valore della variabile
     * @return  valore di data
     */
    public LocalDateTime getData() 
    {
        return data;
    }

    /**
     * metodo setter che ti fa settare il valore della variabile
     * @param data  variabile
     */
    public void setData(LocalDateTime data) 
    {
        this.data = data;
    }

    /**
     * metodo getter che ti fa vedere il valore della variabile
     * @return  valore di nome
     */
    public String getNome()
    {
        return nome;
    }

    /**
     * metodo setter che ti fa settare il valore della variabile
     * @param nome stringa
     */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    /**
     * metodo getter che ti fa vedere il valore della variabile
     * @return valore di cognome
     */
    public String getCognome() 
    {
        return cognome;
    }

    /**
     * metodo setter che ti fa settare il valore della variabile
     * @param cognome stringa
     */
    public void setCognome(String cognome) 
    {
        this.cognome = cognome;
    }

    /**
     * metodo getter che ti fa vedere il valore della variabile
     * @return  valore di  nomeMaestro
     */
    public String getNomeMaestro()
    {
        return nomeMaestro;
    }

    /**
     * metodo setter che ti fa settare il valore della variabile
     * @param nomeMaestro strimga
     */
    public void setNomeMaestro(String nomeMaestro)
    {
        this.nomeMaestro = nomeMaestro;
    }

    /**
     * metodo getter che ti fa vedere il valore della variabile
     * @return valore di cognomeMaestro
     */
    public String getCognomeMaestro() 
    {
        return cognomeMaestro;
    }

    /**
     * metodo setter che ti fa settare il valore della variabile
     * @param cognomeMaestro  stringa
     */
    public void setCognomeMaestro(String cognomeMaestro) 
    {
        this.cognomeMaestro = cognomeMaestro;
    }
    
    /**
     * metodo getter che ti fa vedere il valore della variabile
     * @return  valore di data2
     */
    public LocalDate getData2() 
    {
        return data2;
    }

    /**
     * metodo setter che ti fa settare il valore della variabile
     * @param data2  variabile
     */
    public void setData2(LocalDate data2) 
    {
        this.data2 = data2;
    }
    
    @Override
    public String toString()
    {
        return "maestro{" + "codice=" + codice + ", data=" + data + ", data2=" + data2 +", nome=" + nome + ", cognome=" + cognome + ", nomeMaestro=" + nomeMaestro + ", cognomeMaestro=" + cognomeMaestro + '}';
    }

   
    
    

    
     
    
}

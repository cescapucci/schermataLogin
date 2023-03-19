package com.example.schermatalogin;

import java.io.*;
import java.util.ArrayList;

public class Accessi implements Serializable {

    public static ArrayList<Utente> accessi = new ArrayList<>();

    /**
     * serializzazione
     */
    public static void serializza() {
        try {
            ObjectOutputStream salva = new ObjectOutputStream(new FileOutputStream("accessi"));
            salva.writeObject(accessi);
            salva.flush();
            salva.close();
        }
        catch (Exception IOException) {
            System.out.println("errore " + IOException.getMessage());
        }
    }

    /**
     * deserailizzazione
     */
    public static void deserializza() {
        if (new File("accessi").isFile()) {
            try {
                ObjectInputStream carica = new ObjectInputStream(new FileInputStream("accessi"));
                accessi = (ArrayList<Utente>) carica.readObject();
            }
            catch (Exception IOException) {
                System.out.println("errore " + IOException.getMessage());
            }
        }
    }
}





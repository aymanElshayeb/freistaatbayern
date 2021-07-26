package interview.demo.models;

import java.io.Serializable;

public class Einwohner implements Serializable {
    String ID;
    String vorname;
    String nachname;

    public Einwohner() {

    }

    public Einwohner(String ID, String vorname, String nachname) {
        this.ID = ID;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}

package no.hvl.oblig4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Deltagere {

    private List<Deltager> deltagere;

    // Constructor that initializes the list and adds some default participants
    public Deltagere() {
        deltagere = new ArrayList<>();
        
        deltagere.add(new Deltager("Anne", "Panne", "23456789", "kvinne", "passord"));
        deltagere.add(new Deltager("Arne", "Arnesen", "90123456", "mann", "passord"));
        deltagere.add(new Deltager("Lars", "Helland", "12345679", "mann", "passord"));
        deltagere.add(new Deltager("Per", "Viskelær", "34534534", "mann", "passord"));
        deltagere.add(new Deltager("Xx", "Xxx", "12321378", "mann", "passord"));
    }

    // Getter for the list of participants
    public List<Deltager> getDeltagere() {
        return deltagere;
    }

    // Setter for updating the list of participants
    public void setDeltagere(List<Deltager> deltagere) {
        this.deltagere = deltagere;
    }

    // Method to add a new participant to the list
    public void addDeltager(Deltager deltager) {
        deltagere.add(deltager);
        System.out.println("Deltager added: " + deltager);
    }

    public void sortByName() {
        deltagere.sort(Comparator.comparing(Deltager::getFornavn));
    }
}
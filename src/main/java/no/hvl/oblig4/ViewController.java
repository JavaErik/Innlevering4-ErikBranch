package no.hvl.oblig4;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.RequestDispatcher;

@Controller
public class ViewController {

    private Deltagere deltagere = new Deltagere();


    @GetMapping("/skjema")
    public String display(Model model) {
        model.addAttribute("deltager", 
        new Deltager(null, null, null, null, null));
        return "paamelding_med_melding";

    }

    @GetMapping("/deltagerliste")
    public String display2(Model model) {
        this.deltagere.sortByName(); // Sorterer listen før passering av modell
        model.addAttribute("deltagere", this.deltagere.getDeltagere()); // Ensure you add the list correctly
        return "deltagerliste"; 
        }
        

    @PostMapping("/paameldt")
    public String display3(@ModelAttribute Deltager deltager, Model model) {
        this.deltagere.addDeltager(deltager);
        model.addAttribute("deltager", deltager);
        return "paameldt";
    }
    
}  
    


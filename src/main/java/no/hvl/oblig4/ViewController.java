package no.hvl.oblig4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.RequestDispatcher;

@Controller
public class ViewController {

    @Autowired
    private PassordService passordService;

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
        String salt = passordService.genererTilfeldigSalt();
        
        // Hash the password with the generated salt
        String hashedPassword = passordService.hashMedSalt(deltager.getPassord(), salt);

        // Set the hashed password and salt in the Deltager object
        deltager.setPassord(hashedPassword);
        deltager.setSalt(salt); // Ensure `Deltager` has a `salt` field

        // Add the Deltager to the list
        this.deltagere.addDeltager(deltager);

        model.addAttribute("deltager", deltager);
        return "paameldt";
    }
    @GetMapping("/loginn")
    public String visInnlogging(Model model) {
        return "loginn";
    }
    @PostMapping("/logginn")
    public String handleLogin(@RequestParam String mobil, @RequestParam String passord) {
        // TODO: Implementer innloggingslogikk her
        return "redirect:deltagere";
    }
        @PostMapping("/loggut")
    public String handleLogout() {
        // TODO: Implementer utloggingslogikk her
        return "redirect:loginn";
    }
}


    


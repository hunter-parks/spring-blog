package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class DiceController {

    @GetMapping("/roll-dice")
    public String rollDice() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String viewResults(
            @PathVariable int n,
            Model model

    ){

        int diceRoll = (int)(Math.random() * 6) + 1;
        String message;

        if (diceRoll == n) {
            message = "You Guessed Correctly!! :)";
        } else {
            message = "Incorect Guess! Try Again! :(";
        }

        model.addAttribute("n", n);
        model.addAttribute("diceRoll", diceRoll);
        model.addAttribute("message", message);


        return "roll-results";
    }

}

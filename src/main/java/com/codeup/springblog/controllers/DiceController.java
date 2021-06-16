package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;


@Controller
public class DiceController {

//    // Guessing the Number
//    @GetMapping("/roll-dice/{number}")
//    public String getTheGuess(@PathVariable int number, Model model) {
//        model.addAttribute("usersGuess", number);
//        model.addAttribute("alreadyGuessed", true);
//
//        int num = 1 + (int) (Math.random() * (6 - 1));
//
//        model.addAttribute("guess", num);
//
//        return "roll-dice";
//    }
//
//    // Post Guessing
//    @GetMapping("/roll-dice")
//    public String afterGuess(Model model) {
//        model.addAttribute("alreadyGuessed", false);
//
//        return "roll-dice";
//    }
//}


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
            message = "Incorrect Guess! Try Again! :(";
        }

        model.addAttribute("n", n);
        model.addAttribute("diceRoll", diceRoll);
        model.addAttribute("message", message);


        return "roll-results";
    }

}

package com.rest.simplecrm.interactions;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interaction")
public class InteractionController {
    @Autowired
    private InteractionService interactionService;

    @PostMapping("")
    public ResponseEntity<Interaction> saveInteraction(@RequestBody Interaction interaction) {
  
      Interaction newInteraction = interactionService.saveInteraction(interaction);
      return new ResponseEntity<>(newInteraction, HttpStatus.CREATED);
  
    }

    

    @PostMapping("/helloWorld")
    public ResponseEntity<String> helloWrld() {
      return new ResponseEntity<>("Hello world", HttpStatus.CREATED);
  
    }
  

    @GetMapping("")
    public ResponseEntity<ArrayList<Interaction>> getAllInteractions() {
  
      ArrayList<Interaction> allInteraction = interactionService.getAllInteractions();
      return new ResponseEntity<>(allInteraction, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Interaction> getInteraction(@PathVariable int id) {
      Interaction foudnInteraction = interactionService.getInteraction(id);
      return new ResponseEntity<>(foudnInteraction, HttpStatus.OK);
  
    }
  
    // 3. UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Interaction> updateInteraction(@PathVariable int id, @RequestBody Interaction interaction) {
        Interaction updatedInteraction = interactionService.updateInteraction(id, interaction);
        return new ResponseEntity<>(updatedInteraction, HttpStatus.OK);
  
    }
  
    // 4. DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteInteraction(@PathVariable int id) {
        interactionService.deleteInteraction(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

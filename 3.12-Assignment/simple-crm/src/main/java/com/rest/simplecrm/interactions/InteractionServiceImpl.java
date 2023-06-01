package com.rest.simplecrm.interactions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class InteractionServiceImpl implements InteractionService{
    private InteractionRepository interactionRepository;

    public InteractionServiceImpl(InteractionRepository interactionRepository){
        this.interactionRepository = interactionRepository;
    }

    @Override
    public Interaction saveInteraction(Interaction interaction) {
      Interaction newInteraction = interactionRepository.save(interaction);
      return newInteraction;
    }

    @Override
    public Interaction getInteraction(int id) {
        Interaction foundInteraction = interactionRepository.findById(id).get();
        return foundInteraction;
    }

    @Override
    public ArrayList<Interaction> getAllInteractions() {
        List<Interaction> allInteractions = interactionRepository.findAll();
        return (ArrayList<Interaction>) allInteractions;
    }

    @Override
    public Interaction updateInteraction(int id, Interaction interaction){
        Interaction interactionToUpdate = interactionRepository.findById(id).get();
        interactionToUpdate.setRemark(interaction.getRemark());
        interactionToUpdate.setInteractionDate(interaction.getInteractionDate());

        return interactionRepository.save(interactionToUpdate);
    }

    @Override
    public void deleteInteraction(int id){
        interactionRepository.deleteById(id);
    }

}

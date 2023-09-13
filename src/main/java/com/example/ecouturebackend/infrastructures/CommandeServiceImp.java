package com.example.ecouturebackend.infrastructures;

import com.example.ecouturebackend.applications.services.CommandeService;
import com.example.ecouturebackend.applications.services.UserService;
import com.example.ecouturebackend.domaines.entities.Commande;
import com.example.ecouturebackend.domaines.entities.User;
import com.example.ecouturebackend.domaines.repository.CommandeRepository;
import com.example.ecouturebackend.domaines.repository.RoleRepository;
import com.example.ecouturebackend.domaines.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommandeServiceImp implements CommandeService {

    private final CommandeRepository commandeRepository;

    @Override
    public ResponseEntity<?> addCommande(Commande commande) {
        Optional<Commande> commande1 = commandeRepository.findById(commande.getCommandeId());
        if (commande1.isPresent())
        {
            return ResponseEntity.badRequest().body("This commande already exists");
        }
        commandeRepository.save(commande);
        return ResponseEntity.ok().body("commande created successfully");
    }

    @Override
    public List<Commande> getCommande() {
        return commandeRepository.findAll();
    }

    @Override
    public Optional<Commande> getCommandeById(Long commandeId) {
        return commandeRepository.findById(commandeId);
    }

    @Override
    public ResponseEntity<?> updateCommande(Commande commande, Long commandeId) {
        Optional<Commande> commande1 = commandeRepository.findById(commandeId);
        if (commande1.isPresent()){
            Commande commande2 = commande1.get();
            commande2.setDate(commande.getDate());
            commande2.setStatut(commande.getStatut());

            commandeRepository.save(commande2);
            return ResponseEntity.ok("Commande modifier");

        }
        return ResponseEntity.badRequest().body("Commande introvable");
    }

    @Override
    public  ResponseEntity<?> deleteCommande(Long commandeId) {
        Optional<Commande> commande1 = commandeRepository.findById(commandeId);
        if (commande1.isPresent()) {
            commandeRepository.delete(commande1.get());
            return ResponseEntity.ok("Commande deleted successfully");
        }
        return ResponseEntity.badRequest().body("Commande not exist");
    }
}

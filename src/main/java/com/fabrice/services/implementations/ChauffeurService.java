package com.fabrice.services.implementations;

import org.springframework.stereotype.Service;

import com.fabrice.entities.Werknemer.Chauffeur;
import com.fabrice.services.GenericServiceImpl;
import com.fabrice.services.interfaces.IChauffeurService;

@Service
public class ChauffeurService extends GenericServiceImpl<Chauffeur, String> implements IChauffeurService{

}

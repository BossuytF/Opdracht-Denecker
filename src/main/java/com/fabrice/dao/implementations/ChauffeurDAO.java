package com.fabrice.dao.implementations;

import org.springframework.stereotype.Repository;

import com.fabrice.dao.GenericDaoImpl;
import com.fabrice.dao.interfaces.IChauffeurDAO;
import com.fabrice.entities.Werknemer.Chauffeur;

@Repository
public class ChauffeurDAO extends GenericDaoImpl<Chauffeur, String> implements IChauffeurDAO{


}

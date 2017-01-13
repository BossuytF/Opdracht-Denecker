package com.fabrice.dao.implementations;

import org.springframework.stereotype.Repository;

import com.fabrice.dao.GenericDaoImpl;
import com.fabrice.dao.interfaces.IMechaniekerDAO;
import com.fabrice.entities.Werknemer.Mechanieker;

@Repository
public class MechaniekerDAO extends GenericDaoImpl<Mechanieker, String> implements IMechaniekerDAO{

}

package com.fabrice.dao.implementations;

import org.springframework.stereotype.Repository;

import com.fabrice.dao.GenericDaoImpl;
import com.fabrice.dao.interfaces.IBediendeDAO;
import com.fabrice.entities.Werknemer.Bediende;

@Repository
public class BediendeDAO extends GenericDaoImpl<Bediende, String> implements IBediendeDAO{


}

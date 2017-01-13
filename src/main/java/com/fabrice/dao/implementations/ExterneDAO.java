package com.fabrice.dao.implementations;

import org.springframework.stereotype.Repository;

import com.fabrice.dao.GenericDaoImpl;
import com.fabrice.dao.interfaces.IExterneDAO;
import com.fabrice.entities.Werknemer.Externe;

@Repository
public class ExterneDAO extends GenericDaoImpl<Externe, String> implements IExterneDAO{

}

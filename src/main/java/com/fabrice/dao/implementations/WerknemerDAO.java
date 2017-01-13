package com.fabrice.dao.implementations;

import org.springframework.stereotype.Repository;

import com.fabrice.dao.GenericDaoImpl;
import com.fabrice.dao.interfaces.IWerknemerDAO;
import com.fabrice.entities.Werknemer;

@Repository
public class WerknemerDAO extends GenericDaoImpl<Werknemer, String> implements IWerknemerDAO{


}

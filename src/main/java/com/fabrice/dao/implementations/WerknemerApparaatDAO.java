package com.fabrice.dao.implementations;

import org.springframework.stereotype.Repository;

import com.fabrice.dao.GenericDaoImpl;
import com.fabrice.dao.interfaces.IWerknemerApparaatDAO;
import com.fabrice.entities.WerknemerApparaat;

@Repository
public class WerknemerApparaatDAO extends GenericDaoImpl<WerknemerApparaat, Integer> implements IWerknemerApparaatDAO{

}

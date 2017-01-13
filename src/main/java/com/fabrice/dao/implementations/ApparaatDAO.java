package com.fabrice.dao.implementations;

import org.springframework.stereotype.Repository;

import com.fabrice.dao.GenericDaoImpl;
import com.fabrice.dao.interfaces.IApparaatDAO;
import com.fabrice.entities.Apparaat;

@Repository
public class ApparaatDAO extends GenericDaoImpl<Apparaat, String> implements IApparaatDAO{


}

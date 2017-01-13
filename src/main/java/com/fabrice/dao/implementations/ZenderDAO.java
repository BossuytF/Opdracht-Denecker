package com.fabrice.dao.implementations;

import org.springframework.stereotype.Repository;

import com.fabrice.dao.GenericDaoImpl;
import com.fabrice.dao.interfaces.IZenderDAO;
import com.fabrice.entities.Apparaat.Zender;

@Repository
public class ZenderDAO extends GenericDaoImpl<Zender, String> implements IZenderDAO{

}

package com.fabrice.dao.implementations;

import org.springframework.stereotype.Repository;

import com.fabrice.dao.GenericDaoImpl;
import com.fabrice.dao.interfaces.IBadgeDAO;
import com.fabrice.entities.Apparaat.Badge;

@Repository
public class BadgeDAO extends GenericDaoImpl<Badge, String> implements IBadgeDAO{


}

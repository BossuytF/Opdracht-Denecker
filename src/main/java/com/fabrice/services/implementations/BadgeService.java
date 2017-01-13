package com.fabrice.services.implementations;

import org.springframework.stereotype.Service;

import com.fabrice.entities.Apparaat.Badge;
import com.fabrice.services.GenericServiceImpl;
import com.fabrice.services.interfaces.IBadgeService;

@Service
public class BadgeService extends GenericServiceImpl<Badge, String> implements IBadgeService{

}

package com.fabrice.services.implementations;

import org.springframework.stereotype.Service;

import com.fabrice.entities.Werknemer.Externe;
import com.fabrice.services.GenericServiceImpl;
import com.fabrice.services.interfaces.IExterneService;

@Service
public class ExterneService extends GenericServiceImpl<Externe, String> implements IExterneService{

}

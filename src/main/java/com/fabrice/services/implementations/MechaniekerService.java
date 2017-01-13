package com.fabrice.services.implementations;

import org.springframework.stereotype.Service;

import com.fabrice.entities.Werknemer.Mechanieker;
import com.fabrice.services.GenericServiceImpl;
import com.fabrice.services.interfaces.IMechaniekerService;

@Service
public class MechaniekerService extends GenericServiceImpl<Mechanieker, String> implements IMechaniekerService{

}

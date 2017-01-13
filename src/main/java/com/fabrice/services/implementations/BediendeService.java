package com.fabrice.services.implementations;

import org.springframework.stereotype.Service;

import com.fabrice.entities.Werknemer.Bediende;
import com.fabrice.services.GenericServiceImpl;
import com.fabrice.services.interfaces.IBediendeService;

@Service
public class BediendeService extends GenericServiceImpl<Bediende, String> implements IBediendeService{

}

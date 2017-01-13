package com.fabrice.services.implementations;

import org.springframework.stereotype.Service;

import com.fabrice.entities.Apparaat;
import com.fabrice.entities.Werknemer;
import com.fabrice.services.GenericServiceImpl;
import com.fabrice.services.interfaces.IApparaatService;
import com.fabrice.services.interfaces.IWerknemerService;

@Service
public class ApparaatService extends GenericServiceImpl<Apparaat, String> implements IApparaatService{

}

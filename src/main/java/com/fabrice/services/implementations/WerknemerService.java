package com.fabrice.services.implementations;

import org.springframework.stereotype.Service;

import com.fabrice.entities.Werknemer;
import com.fabrice.services.GenericServiceImpl;
import com.fabrice.services.interfaces.IWerknemerService;

@Service
public class WerknemerService extends GenericServiceImpl<Werknemer, String> implements IWerknemerService{

}

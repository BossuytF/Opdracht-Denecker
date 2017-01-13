package com.fabrice.services.implementations;

import org.springframework.stereotype.Service;

import com.fabrice.entities.Apparaat.Zender;
import com.fabrice.services.GenericServiceImpl;
import com.fabrice.services.interfaces.IZenderService;

@Service
public class ZenderService extends GenericServiceImpl<Zender, String> implements IZenderService{

}

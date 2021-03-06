package com.mycom._mashupApp.controller;

import com.mycom._mashupApp.model.TransportWeather;

import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by 5ia15niwallner on 01.02.2018.
 */
@Model
public class TransportWeatherController {

    @Inject
    private FacesContext facesContext;

    @Produces
    @Named
    private TransportWeather TWResult;

    @Named
    private String departure;

    @Named String arrival;

    public void postQuery(String departure, String arrival){
        TWResult = new TransportWeather();
    }


}

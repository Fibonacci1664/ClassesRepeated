package com.davegreen;

/**
 * Created by daveg on 20/06/2017.
 */
public class Car
{
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model)
    {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("m class"))        // The Strings defined here are case sensitive
        {                                                                       // if "Carrera" was type the the output would be
            this.model = model;                                                 // Model is Unknown.
        }
        else
        {
            this.model = "Unknown";
        }
    }

    public String getModel()
    {
        return this.model;
    }
}

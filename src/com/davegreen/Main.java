package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        Car porsche = new Car();
        Car mercedes = new Car();
        System.out.println("Model is " + porsche.getModel());       // This line prints out model is null
                                                                    // due to the model not being set yet.
        porsche.setModel("CarRerA");                        // The argument set here is not case sensitive as it is converted
                                                            // to all lowercase in the setModel() validation check.
        System.out.println("Model is " + porsche.getModel());       // This returns the value of this.model from the
                                                                    // getModel() method and as you can see this.model
                                                                    // i.e. the field is set to the parameter model which has
                                                                    // been defined by the argument given in the porsche.setModel(); statement.







    }
}

package com.CareSoft;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin  {

    private Integer employeeID;


    private String role;
    public ArrayList<String> securityIncidents=new ArrayList<String>();


    public AdminUser(Integer id, String role) {
        super(id);
        this.employeeID=id;
        this.role=role;
    }

//    public ArrayList<String> getSecurityIncidents() {
//        return securityIncidents;
//    }


    public void newIncident(String notes) {
        String report = String.format(
                "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n",
                new Date(), this.id, notes);
        securityIncidents.add(report);
    }

    public void authIncident() {
        String report = String.format(
                "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER");
        securityIncidents.add(report);
    }



    @Override
    public boolean assignPin(int pin) {
        // TODO Auto-generated method stub
        int length = String.valueOf(pin).length();
        if(length>=6) {
            setPin(pin);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        // TODO Auto-generated method stub
        if(id==confirmedAuthID) {
            return true;
        }
        else{
            authIncident();
            return false;
        }
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        // TODO Auto-generated method stub
        return securityIncidents;
    }

    @Override
    public void printSecurityIncidents() {
        HIPAACompliantAdmin.super.printSecurityIncidents();
    }

    @Override
    public boolean adminQATest(ArrayList<String> expectedIncidents) {
        return HIPAACompliantAdmin.super.adminQATest(expectedIncidents);
    }

}
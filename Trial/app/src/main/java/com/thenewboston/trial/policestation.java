package com.thenewboston.trial;

/**
 * Created by CnE on 7/19/2017.
 */

public class policestation {
    private String station;
    private String address;
    private String contact;

    public policestation(String station, String address, String contact) {
        this.station = station;
        this.address = address;
        this.contact = contact;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}

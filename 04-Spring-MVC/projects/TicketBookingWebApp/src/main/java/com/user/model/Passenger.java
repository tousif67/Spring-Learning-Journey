package com.user.model;




public class Passenger {

    private Integer pid;
    private String name;
    private String departure;
    private String arrival;
    private String dateOfJourney;

    public Passenger(Integer pid, String name, String departure, String arrival, String dateOfJourney) {
        this.pid = pid;
        this.name = name;
        this.departure = departure;
        this.arrival = arrival;
        this.dateOfJourney = dateOfJourney;
    }

    public Passenger() {
        super();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDateOfJourney() {
        return dateOfJourney;
    }

    public void setDateOfJourney(String dateOfJourney) {
        this.dateOfJourney = dateOfJourney;
    }
}

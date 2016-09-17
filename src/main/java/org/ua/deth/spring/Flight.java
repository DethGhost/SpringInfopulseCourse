package org.ua.deth.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Flight {

    @Autowired
    private Direction direction;

    @Autowired
    private Airplaine airplaine;
    @Autowired
    private List<Employee> crewList;
    @Autowired
    private Map<String, Ticket> passengerMap;

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }


    public Airplaine getAirplaine() {
        return airplaine;
    }

    public void setAirplaine(Airplaine airplaine) {
        this.airplaine = airplaine;
    }

    public List<Employee> getCrewList() {
        return crewList;
    }

    public void setCrewList(List<Employee> crewList) {
        this.crewList = crewList;
    }

    public Map<String, Ticket> getPassengerMap() {
        return passengerMap;
    }

    public void setPassengerMap(Map<String, Ticket> passengerMap) {
        this.passengerMap = passengerMap;
    }
}

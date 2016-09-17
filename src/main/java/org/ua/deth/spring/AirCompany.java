package org.ua.deth.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirCompany {

    @Autowired
    private List<Flight> flightList;

    public Float calculate(){
        float profit = 0;
        for (Flight flight : flightList) {
            for(Ticket t: flight.getPassengerMap().values()){
                profit += t.getPrice();
            }
            for(Employee employee: flight.getCrewList()){
                profit -= employee.getSalary();
            }
            profit -= flight.getAirplaine().getFuelConsumption()
                    *flight.getDirection().getLenght()
                    *100;
        }
        return profit;
    }
    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }
}

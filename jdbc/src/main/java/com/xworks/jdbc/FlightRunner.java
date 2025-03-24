package com.xworks.jdbc;

import java.util.ArrayList;
import java.util.Collection;

public class FlightRunner {
    public  static Collection<FlightDto> getPassenger(){

        FlightDto passengerInfo1 = new FlightDto("PI01","sneha","female","indian","FI01");

        FlightDto passengerInfo2 = new FlightDto("PI02","sujay","male","maxican","FI02");

        FlightDto passengerInfo3 = new FlightDto("PI03","ram","male","amarican","FI03");

        FlightDto passengerInfo4 = new FlightDto("PI04","ramesh","male","maxican","FI04");

        FlightDto passengerInfo5 = new FlightDto("PI05","priya","female","amarican","FI05");

        FlightDto passengerInfo6 = new FlightDto("PI06","sam","female","maxican","FI06");

        FlightDto passengerInfo7 = new FlightDto("PI07","maxi","female","canadian","FI07");

        FlightDto passengerInfo8 = new FlightDto("PI08","will","male","amarican","FI08");

        FlightDto passengerInfo9 = new FlightDto("PI09","vidya","female","maxican","FI09");

        FlightDto passengerInfo10 = new FlightDto("PI010","rohit","male","indian","FI10");

        FlightDto passengerInfo11= new FlightDto("PI11","shamita","female","maxican","FI11");

        FlightDto passengerInfo12= new FlightDto("PI12","lucus","male","amarican","FI12");

        FlightDto passengerInfo13= new FlightDto("PI13","nancy","female","indian","FI13");

        FlightDto passengerInfo14= new FlightDto("PI14","mike","male","amarican","FI14");

        FlightDto passengerInfo15= new FlightDto("PI15","eleven","female","indian","FI15");

        FlightDto passengerInfo16= new FlightDto("PI16","hooper","male","maxican","FI16");

        FlightDto passengerInfo17= new FlightDto("PI17","tom","male","amarican","FI17");

        FlightDto passengerInfo18= new FlightDto("PI18","suma","female","canadian","FI18");

        FlightDto passengerInfo19= new FlightDto("PI19","sagar","male","canadian","FI19");

        FlightDto passengerInfo20 = new FlightDto("PI20","shwetha","female","maxican","FI20");

        Collection <FlightDto> passengerDtos = new ArrayList<>();

        passengerDtos.add(passengerInfo1);
        passengerDtos.add(passengerInfo2);
        passengerDtos.add(passengerInfo3);
        passengerDtos.add(passengerInfo4);
        passengerDtos.add(passengerInfo5);
        passengerDtos.add(passengerInfo6);
        passengerDtos.add(passengerInfo7);
        passengerDtos.add(passengerInfo8);
        passengerDtos.add(passengerInfo9);
        passengerDtos.add(passengerInfo10);
        passengerDtos.add(passengerInfo11);
        passengerDtos.add(passengerInfo12);
        passengerDtos.add(passengerInfo13);
        passengerDtos.add(passengerInfo14);
        passengerDtos.add(passengerInfo15);
        passengerDtos.add(passengerInfo16);
        passengerDtos.add(passengerInfo17);
        passengerDtos.add(passengerInfo18);
        passengerDtos.add(passengerInfo19);
        passengerDtos.add(passengerInfo20);

        return passengerDtos;
    }
}

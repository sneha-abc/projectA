package com.xworks.jpaOperation;

import javax.persistence.*;
@Entity
@Table(name = "country_info")
@NamedQuery(name="query1",query=" select c from CountryDto c")
@NamedQuery(name="query2",query=" select count(*) from CountryDto c")
@NamedQuery(name="query3",query="select c from CountryDto c where country_name like 'a%' ")
@NamedQuery(name="query4",query="select avg(population) from CountryDto ")
@NamedQuery(name="query5",query=" select min(population) from CountryDto")
@NamedQuery(name="query6",query=" select max(population) from CountryDto")
@NamedQuery(name="query7",query=" select sum(population) from CountryDto")
@NamedQuery(name="query8",query="select c from CountryDto c where population between 2968000 and 285653 ")
@NamedQuery(name="sqlQuery1",query="delete from country_info where country_name='Bhutan'")
@NamedQuery(name="sqlQuery2",query="insert into country_info values(31, 'XYZ', 7895465,'ABC' ")
@NamedQuery(name="sqlQuery3",query="update country_info set president_name='Tom' where country_name='Australia'")

public class CountryDto {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "country_code")
        private int country_code;
        private String country_name;
        private long population;
        private String president_name;

        public CountryDto() {
        }

        public CountryDto(String countryName, int countryCode, long population,String presidentName) {
            this.country_name = countryName;
            this.country_code = countryCode;
            this.population = population;
            this.president_name=presidentName;
        }

        public String getCountryName() {
            return country_name;
        }

        public void setCountryName(String countryName) {
            this.country_name = countryName;
        }

        public int getCountryCode() {
            return country_code;
        }

        public void setCountryCode(int countryCode) {
            this.country_code = countryCode;
        }

        public long getPopulation() {
            return population;
        }

        public void setPopulation(long population) {
            this.population = population;
        }

        public String getPresidentName() {
            return president_name;
        }

        public void setPresidentName(String presidentName) {
            this.president_name = presidentName;
        }

    }

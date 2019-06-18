package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent continentEurope = new Continent("Europe");
        Continent continentNorthAmerica = new Continent("Noth America");
        Continent continentAsia = new Continent("Asia");
        world.addContinents(continentEurope);
        world.addContinents(continentNorthAmerica);
        world.addContinents(continentAsia);

        BigDecimal peoplePoland = new BigDecimal("12345678910");
        BigDecimal peopleEngland = new BigDecimal("98765432109");
        BigDecimal peopleGermany = new BigDecimal("45612378903");
        BigDecimal peopleSpanish = new BigDecimal("78912345696");
        Country countryPoland = new Country("Poland", peoplePoland);
        Country countryEngland = new Country("England", peopleEngland);
        Country countryGermany = new Country("Germany", peopleGermany);
        Country countrySpanish = new Country("France", peopleSpanish);

        BigDecimal peopleUsa = new BigDecimal("99999999994");
        BigDecimal peopleCanada = new BigDecimal("77777777777");
        BigDecimal peopleMexico = new BigDecimal("312325784256");
        Country countryUsa = new Country("USA", peopleUsa);
        Country countryCanada = new Country("Canada", peopleCanada);
        Country countryMexico = new Country("Mexico", peopleMexico);

        BigDecimal peopleRosia = new BigDecimal("85463578999");
        BigDecimal peopleChina = new BigDecimal("45456859857");
        BigDecimal peopleIndia = new BigDecimal("999999999999");
        Country countryRosia = new Country("Brasil",peopleRosia);
        Country countryChina = new Country("Argentina", peopleChina);
        Country countryIndia = new Country("Chile", peopleIndia);

        continentEurope.addCountry(countryPoland);
        continentEurope.addCountry(countryEngland);
        continentEurope.addCountry(countryGermany);
        continentEurope.addCountry(countrySpanish);
        continentNorthAmerica.addCountry(countryUsa);
        continentNorthAmerica.addCountry(countryCanada);
        continentNorthAmerica.addCountry(countryMexico);
        continentAsia.addCountry(countryRosia);
        continentAsia.addCountry(countryChina);
        continentAsia.addCountry(countryIndia);

        //When
        BigDecimal quantity = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("1856659836500"), quantity);
    }
}
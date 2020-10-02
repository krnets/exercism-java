/*
import java.util.HashMap;
import java.util.Map;

class SpaceAge {
    private enum Planet {
        MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE;
    }

    Map<Planet, Double> age = new HashMap<>();

    SpaceAge(double seconds) {
        double ageOnEarth = seconds / 31557600;

        age.put(Planet.EARTH, ageOnEarth);
        age.put(Planet.MERCURY, ageOnEarth / 0.2408467);
        age.put(Planet.VENUS, ageOnEarth / 0.61519726);
        age.put(Planet.MARS, ageOnEarth / 1.8808158);
        age.put(Planet.JUPITER, ageOnEarth / 11.862615);
        age.put(Planet.SATURN, ageOnEarth / 29.447498);
        age.put(Planet.URANUS, ageOnEarth / 84.016846);
        age.put(Planet.NEPTUNE, ageOnEarth / 164.79132);
    }

    double onEarth() {
        return age.get(Planet.EARTH);
    }

    double onMercury() {
        return age.get(Planet.MERCURY);
    }

    double onVenus() {
        return age.get(Planet.VENUS);
    }

    double onMars() {
        return age.get(Planet.MARS);
    }

    double onJupiter() {
        return age.get(Planet.JUPITER);
    }

    double onSaturn() {
        return age.get(Planet.SATURN);
    }

    double onUranus() {
        return age.get(Planet.URANUS);
    }

    double onNeptune() {
        return age.get(Planet.NEPTUNE);
    }

}*/

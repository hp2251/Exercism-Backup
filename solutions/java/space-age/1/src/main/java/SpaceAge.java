class SpaceAge {

    private static double SECONDS_ON_EARTH = 31557600;
    private static double SECONDS_ON_MERCURY = SECONDS_ON_EARTH * 0.2408467;
    private static double SECONDS_ON_VENUS = SECONDS_ON_EARTH * 0.61519726;
    private static double SECONDS_ON_MARS = SECONDS_ON_EARTH * 1.8808158;
    private static double SECONDS_ON_JUPITER = SECONDS_ON_EARTH * 11.862615;
    private static double SECONDS_ON_SATURN = SECONDS_ON_EARTH * 29.447498;
    private static double SECONDS_ON_URANUS = SECONDS_ON_EARTH * 84.016846;
    private static double SECONDS_ON_NEPTUNE = SECONDS_ON_EARTH * 164.79132;

    private double mSeconds;

    SpaceAge(double seconds) {
        mSeconds = seconds;
    }

    double getSeconds() {
        return mSeconds;
    }

    double onEarth() {
        return mSeconds / SECONDS_ON_EARTH;
    }

    double onMercury() {
        return mSeconds / SECONDS_ON_MERCURY;
    }

    double onVenus() {
        return mSeconds / SECONDS_ON_VENUS;
    }

    double onMars() {
        return mSeconds / SECONDS_ON_MARS;
    }

    double onJupiter() {
        return mSeconds / SECONDS_ON_JUPITER;
    }

    double onSaturn() {
        return mSeconds / SECONDS_ON_SATURN;
    }

    double onUranus() {
        return mSeconds / SECONDS_ON_URANUS;
    }

    double onNeptune() {
        return mSeconds / SECONDS_ON_NEPTUNE;
    }

}
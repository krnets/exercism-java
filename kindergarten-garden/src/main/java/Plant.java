enum Plant {

    VIOLETS, RADISHES, CLOVER, GRASS;

    static Plant getPlant(char plantCode) {
        return switch (plantCode) {
            case 'C' -> CLOVER;
            case 'G' -> GRASS;
            case 'R' -> RADISHES;
            case 'V' -> VIOLETS;
            default -> null;
        };

    }
}

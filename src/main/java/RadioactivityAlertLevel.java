public enum RadioactivityAlertLevel {
    Brown(50), Orange(100), Red(150), Yellow(0);

    private final int rateLowerLimit;

    RadioactivityAlertLevel(int rateLowerLimit) {
        this.rateLowerLimit = rateLowerLimit;
    }
}

public class Radioactivity {

    public static final int RED_LOWER_LIMIT = 150;
    public static final int ORANGE_LOWER_LIMIT = 100;
    public static final int BROWN_LOWER_LIMIT = 50;

    public static RadioactivityAlertLevel getColorLevel(int rate) {
        if (rate > RED_LOWER_LIMIT) return RadioactivityAlertLevel.Red;
        if (rate > ORANGE_LOWER_LIMIT) return RadioactivityAlertLevel.Orange;
        if (rate > BROWN_LOWER_LIMIT) return RadioactivityAlertLevel.Brown;
        return RadioactivityAlertLevel.Yellow;
    }
}

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class RadioactivityShould {

    @Test
    @Parameters({"0", "25", "50"})
    public void indicateYellowAlertLevelWhenRadioactivityRateIsBetween0And50(int rate){
        RadioactivityAlertLevel alertLevel = Radioactivity.getColorLevel(rate);
        Assertions.assertThat(alertLevel).isEqualTo(RadioactivityAlertLevel.Yellow);
    }

    @Test
    @Parameters({"51", "78", "100"})
    public void indicateBrownAlertLevelWhenRadioactivityRateIsBetween51And100(int rate){
        RadioactivityAlertLevel alertLevel = Radioactivity.getColorLevel(rate);
        Assertions.assertThat(alertLevel).isEqualTo(RadioactivityAlertLevel.Brown);
    }


    @Test
    @Parameters({"101", "128", "150"})
    public void indicateOrangeAlertLevelWhenRadioactivityRateIsBetween101And150(int rate){
        RadioactivityAlertLevel alertLevel = Radioactivity.getColorLevel(rate);
        Assertions.assertThat(alertLevel).isEqualTo(RadioactivityAlertLevel.Orange);
    }

    @Test
    @Parameters({"151", "178", "404"})
    public void indicateRedAlertLevelWhenRadioactivityRateIsOver150(int rate){
        RadioactivityAlertLevel alertLevel = Radioactivity.getColorLevel(rate);
        Assertions.assertThat(alertLevel).isEqualTo(RadioactivityAlertLevel.Red);
    }



}

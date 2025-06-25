import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class windowLevelCommands {

@Test
public void killChromeDriver()
{
    String commandToRun = "taskkill /F /IM ChromeDriver.exe";
                try {
                    Process process = Runtime.getRuntime().exec(commandToRun);
                    Thread.sleep(1000);
                    process.destroy();
                    System.out.println("Command executed Successfully");
                } catch (Exception e) {
                    Assertions.fail("Issue in running the command"+commandToRun + " with error message ");
                }
            }

}



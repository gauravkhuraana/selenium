//import com.google.common.collect.ImmutableMap;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.devtools.DevTools;
//
//public class readNetworkCalls {
//
//    public static void main(String[] args) {
//        // Set up the ChromeOptions to enable the DevTools
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("w3c", false); // Required for non-W3C compliant DevTools
//        options.setCapability("goog:chromeOptions", ImmutableMap.of("devtools", true));
//
//        // Launch the Chrome browser with DevTools enabled
//        WebDriver driver = new ChromeDriver(options);
//
//        // Connect to the DevTools and enable the network events
//        DevTools devTools = ((ChromeDriver) driver).getDevTools();
//        devTools.createSession();
//        //devTools.send(Network.enable());
//
//        // Navigate to the target website
//        driver.get("https://www.google.com/");
//
//        // Get the captured network events
////        List<Request> requests = devTools.send(Network.get).getRequests();
////        for (Request request : requests) {
////            Headers headers = request.getRequestHeaders();
////            Response response = devTools.send(Network.getResponseBody(request.getRequestId()));
////            System.out.println(request.getUrl());
////            System.out.println(headers);
////            System.out.println(response.getBody());
////        }
////
////        // Clean up
////        driver.quit();
//
////    Selenium is primarily used for automating web browsers and interacting with web elements, but it doesn't provide direct access to network calls. However, you can use a tool called BrowserMob Proxy to intercept network traffic and gather information about network requests and responses.
////
////    Here's an example Java code snippet that uses BrowserMob Proxy with Selenium to capture network traffic:
////
////    java
////    Copy code
////import net.lightbody.bmp.core.har.Har;
////import net.lightbody.bmp.core.har.HarEntry;
////import net.lightbody.bmp.proxy.ProxyServer;
////import org.openqa.selenium.Proxy;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.chrome.ChromeDriver;
////import org.openqa.selenium.chrome.ChromeOptions;
////import java.io.File;
////import java.io.FileOutputStream;
////import java.io.IOException;
////import java.util.List;
////
////    public class NetworkTrafficCaptureExample {
//
////        public static void main(String[] args) throws IOException {
//        // Start the BrowserMob Proxy server
////            ProxyServer proxy = new ProxyServer();
////            proxy.start();
////
////            // Get the Selenium WebDriver with the proxy configured
////            Proxy seleniumProxy = proxy.seleniumProxy();
////            ChromeOptions options = new ChromeOptions();
////            options.setProxy(seleniumProxy);
////            WebDriver driver = new ChromeDriver(options);
////
////            // Enable the capture of network traffic
////            proxy.newHar("google.com");
////
////            // Navigate to the target website
////            driver.get("https://www.google.com/");
////
////            // Get the captured HAR file
////            Har har = proxy.getHar();
////
////            // Process the HAR file to extract the network calls
////            List<HarEntry> entries = har.getLog().getEntries();
////            for (HarEntry entry : entries) {
////                System.out.println(entry.getRequest().getUrl());
////            }
////
////            // Save the HAR file to disk
////            FileOutputStream fos = new FileOutputStream(new File("google.har"));
////            har.writeTo(fos);
////
////            // Clean up
////            driver.quit();
////            proxy.stop();
////        }
//    }
//}
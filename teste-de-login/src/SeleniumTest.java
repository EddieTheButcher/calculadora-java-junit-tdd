import java.nio.file.Paths;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        String caminho = Paths
                .get("teste-de-login", "src", "index.html")
                .toAbsolutePath()
                .toUri()
                .toString();

        driver.get(caminho);

        driver.findElement(By.id("username"))
                .sendKeys("usuario_teste");

        driver.findElement(By.id("password"))
                .sendKeys("senha_secreta");

        driver.findElement(By.id("login"))
                .click();

        boolean loginRealizado = driver
                .findElement(By.id("pagina_principal"))
                .isDisplayed();

        if (loginRealizado) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Falha no login!");
        }

        driver.quit();
    }
}
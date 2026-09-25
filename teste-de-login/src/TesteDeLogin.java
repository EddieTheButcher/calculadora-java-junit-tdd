import java.nio.file.Paths;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TesteDeLogin {

    private WebDriver driver;


    @BeforeEach
    public void setUp() {

        driver = new ChromeDriver();

        String caminho = Paths
                .get("teste-de-login", "src", "index.html")
                .toAbsolutePath()
                .toUri()
                .toString();

        driver.get(caminho);
    }


    @AfterEach
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }


    @Test
    public void loginComSucesso() {

        preencherLogin(
                "usuario_teste",
                "senha_secreta"
        );

        assertTrue(
                driver.findElement(By.id("pagina_principal"))
                        .isDisplayed(),
                "A página principal deveria estar visível após um login válido."
        );
    }


    @Test
    public void loginComUsuarioIncorreto() {

        preencherLogin(
                "usuario_errado",
                "senha_secreta"
        );

        validarMensagemErro(
                "Usuário ou Senha Inválidos"
        );
    }


    @Test
    public void loginComSenhaIncorreta() {

        preencherLogin(
                "usuario_teste",
                "senha_errada"
        );

        validarMensagemErro(
                "Usuário ou Senha Inválidos"
        );
    }


    @Test
    public void loginComCamposVazios() {

        driver.findElement(By.id("login"))
                .click();

        validarMensagemErro(
                "Por favor, preencha os campos"
        );
    }


    private void preencherLogin(String usuario, String senha) {

        driver.findElement(By.id("username"))
                .sendKeys(usuario);

        driver.findElement(By.id("password"))
                .sendKeys(senha);

        driver.findElement(By.id("login"))
                .click();
    }


    private void validarMensagemErro(String mensagemEsperada) {

        String mensagem = driver.findElement(By.id("mensagemErro"))
                .getText();

        assertEquals(
                mensagemEsperada,
                mensagem,
                "A mensagem de erro exibida não é a esperada."
        );
    }
}
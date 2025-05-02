package steps;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import static org.junit.Assert.assertEquals;

public class LoginSteps {
    private Page page;
    private Playwright playwright;
    private Browser browser;

    @Dado("que inseri usuário {string} e senha {string}")
    public void que_inseri_usuário_e_senha(String usuario, String senha) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
        page = browser.newPage();
        page.navigate("https://rlhorochovec.github.io/qa/");
        page.fill("#login", usuario);
        page.fill("#senha", senha);
    }

    @Quando("clicar no botão Entrar")
    public void clicar_no_botão_entrar() {
        page.getByText("Entrar").click();
    }

    @Então("apresentará uma mensagem de {string}")
    public void apresentará_uma_mensagem_de(String mensagem) {
        String msgErro = page.locator("#erro").textContent();
        assertEquals(mensagem, msgErro);
        browser.close();
        playwright.close();
    }
}

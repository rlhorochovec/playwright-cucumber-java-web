package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoginPage {
    private final Page page;
    private final Locator txtUsuario;
    private final Locator txtSenha;
    private final Locator btnEntrar;
    private final Locator msgErro;

    public LoginPage(Page page) {
        this.page = page;
        this.txtUsuario = page.locator("#login");
        this.txtSenha = page.locator("#senha");
        this.btnEntrar = page.locator("button[type='submit']");
        this.msgErro = page.locator("#erro");
    }

    public void abrirSite(String url) {
        this.page.navigate(url);
    }

    public void efetuarLogin(String usuario, String senha) {
        txtUsuario.fill(usuario);
        txtSenha.fill(senha);
    }

    public void clicarEntrar() {
        btnEntrar.click();
    }

    public void validarMensagem(String msg) {
        assertThat(msgErro).hasText(msg);
    }
}
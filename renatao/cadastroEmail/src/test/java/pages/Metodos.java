package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Metodos {

	public static WebDriver driver;

	/**
	 * Abrir navegador
	 * @author abarb
	 * @param appUrl
	 * @param navegador
	 * @param descricaoPasso
	 * @throws IOException
	 */

	public void abrirNavegador(String appUrl, String navegador, String descricaoPasso) throws IOException {

		try {
			if (navegador == "CHROME" || navegador == "FIREFOX") {
				if (navegador == "CHROME") {

					System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
					driver = new ChromeDriver();
					driver.get(appUrl);
					driver.manage().window().maximize();
				} else if (navegador == "FIREFOX") {
					System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
					driver = new FirefoxDriver();
					driver.get(appUrl);
					driver.manage().window().maximize();

				}

			} else {
				System.out.println("Opção inválida escolha CHROME ou FIREFOX");
			}

		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			screnShoot(descricaoPasso);

		}

	}

	/**
	 * preencher
	 * 
	 * @author Renato Vargas
	 * @param preecher elemento
	 * @throws IOException
	 * 
	 */
	public void preencher(By elemento, String texto, String descricaoPasso) throws IOException {
		try {

			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " -- erro ao tentar " + descricaoPasso);
			screnShoot(descricaoPasso);

		}
	}

	/**
	 * clicar
	 * 
	 * @author Renato Vargas
	 * @param clicar no elemento
	 * @throws IOException
	 */
	public void clicar(By elemento, String descricaoPasso) throws IOException {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			screnShoot(descricaoPasso);

		}
	}

	/**
	 * submit
	 * 
	 * @author Renato Vargas
	 * @param submit no elemento
	 * @throws IOException
	 */
	public void submit(By elemento, String descricaoPasso) throws IOException {
		try {
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			screnShoot("erros/" + descricaoPasso);
		}
	}

	/**
	 * tirar foto
	 * 
	 * @author Renato Vargas
	 * @param screenshot
	 */
	public void screnShoot(String printName) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(printName);
		FileUtils.copyFile(SrcFile, DestFile);
	}

	/**
	 * fechar browser
	 * 
	 * @author Renato Vargas
	 * @param fechar
	 * @throws IOException
	 */

	public void fecharBrowser(String descricaoPasso) throws IOException {
		try {
			driver.quit();
		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			screnShoot(descricaoPasso);

		}
	}

	/**
	 * Super click
	 * 
	 * @author Renato Vargas
	 * @param elemento
	 * @param descricaoDoPasso
	 * @throws IOException
	 */
	public void superClick(By elemento, String descricaoPasso) throws IOException {
		try {
			superClick((By) driver.findElement(elemento), descricaoPasso);
		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			screnShoot(descricaoPasso);

		}

	}

	/**
	 * Clicar por texto
	 * 
	 * @author Renato Vargas
	 * @param text
	 * @param descriPasso
	 */

	public void clicarText(String text, String descriPasso) {

		driver.findElement(By.linkText(text)).click();

	}	

	/**
	 * Duplo clique
	 * 
	 * @author Renato Vargas
	 * @param elemento
	 * @param descricaoDoPasso
	 */

	public void duploCliqueNoElemento(By elemento, String descricaoDoPasso) {
		long TIMEOUT = 40;
		Actions action = new Actions(driver);
		try {
			driver.manage().timeouts().pageLoadTimeout(TIMEOUT, TimeUnit.SECONDS);
			action.doubleClick(
					new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.elementToBeClickable(elemento)));
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + " -- erro no passo " + descricaoDoPasso);
		}
	}

	/**
	 * Selecionar Combo por posicao
	 * 
	 * @author Renato Vargas
	 * @param elemento
	 * @param posicao
	 * @param descricaoDoPasso
	 */
	@SuppressWarnings("deprecation")
	public void selecionarComboPosicao(By elemento, int posicao, String descricaoDoPasso) {
		try {
			WebElement webElement = driver.findElement(elemento);
			Select combo = new Select(webElement);
			combo.selectByIndex(posicao);
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + "descri��o do passo");
		}
	}
	
	/**
	 * Selecionar Combo por texto
	 * 
	 * @author Renato Vargas
	 * @param elemento
	 * @param posicao
	 * @param descricaoDoPasso
	 */
	public void selecionarComboTexto(By elemento, String texto, String descricaoDoPasso) {
		try {
			WebElement webElement = driver.findElement(elemento);
			Select combo = new Select(webElement);
			combo.selectByVisibleText(texto);;
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + " erro no passo \" + descricaoDoPasso");
		}
	}

	/**
	 * Esperar ser clicavel
	 * 
	 * @author Renato Vargas
	 * @param element
	 * @param descricaoPasso
	 */
	public void esperarClicavel(By element, String descricaoPasso) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement elemento = wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + " erro no passo \" + descricaoDoPasso");
		}
	}

	/**
	 * Validar página
	 * 
	 * @author Renato Vargas
	 * @param pagina
	 * @param descricaoPasso
	 */
	public void validarPagina(String pagina, String descricaoPasso) {
		try {
			String pag = driver.getTitle();
			assertEquals(pagina, pag);
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + " erro no passo \" + descricaoDoPasso");
		}
	}

	/**
	 * validar texto
	 * 
	 * @author Renato Vargas
	 * @param elemento
	 * @param texto
	 * @param descricaoPasso
	 */
	public void validarTexto(By elemento, String texto, String descricaoPasso) {
		try {
			String msg = driver.findElement(elemento).getText();
			assertEquals(texto, msg);

		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + " erro no passo \" + descricaoDoPasso");
		}

	}
	
	/**
	 * esperarPreencher elemento presente na tela
	 * @author Renato Vargas
	 * 
	 * @param element
	 * @param descricaoPasso
	 */

	public void esperarPreencher(By element, String descricaoPasso) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			boolean elemento = wait.until(ExpectedConditions.elementToBeSelected(element));
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + " erro no passo \" + descricaoDoPasso");
		}
	}

	public void pausa(int tempo, String descricaoPasso) throws InterruptedException {

		try {
			Thread.sleep(tempo);
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + " erro no passo \" + descricaoDoPasso");
		}

	}
	
	/**
	 *  esperar um alert na tela
	 * @author Renato Vargas
	 * @param tempo
	 * @param descricaoPasso
	 */

	public void esperarAlert(int tempo, String descricaoPasso) {
		try {
			new WebDriverWait(driver, tempo).until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + " erro no passo \" + descricaoDoPasso");
		}
	}

}

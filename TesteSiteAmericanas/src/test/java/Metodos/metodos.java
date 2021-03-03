package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class metodos {

	WebDriver driver;

	public void abrirSite(String site, String navegador) {

		if (navegador == "CHROME" || navegador == "FIREFOX") {
			switch (navegador) {
			case "CHROME":
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(site);
				driver.manage().window().maximize();
				
				                 break;

			}
		} else {
			System.out.println("nao suporta outro navegador");
		}

	}

	public void prencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void fechar() {
		driver.quit();

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
public void pausa(int tempo) throws Exception {
	Thread.sleep(tempo);
	
}

}

package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.ConnexionCasPassantPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConnexionCasPassantStepDefinition {

	public ConnexionCasPassantPage connexionCasPassantPage;

	public ConnexionCasPassantStepDefinition() {
		connexionCasPassantPage = new ConnexionCasPassantPage();
	}

	@Given("Je me connecte sur l application")
	public void jeMeConnecteSurLApplication() {
		connexionCasPassantPage.goToUrl();
	}

	@When("je saisis login {string}")
	public void jeSaisisLogin(String name) {
		connexionCasPassantPage.fillAdmin(name);
	}

	@When("je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String pwd) {
		connexionCasPassantPage.fillPassword(pwd);
	}

	@When("je click sur le bouton de connexion")
	public void jeClickSurLeBoutonDeConnexion() throws InterruptedException {
		connexionCasPassantPage.clickOnLogIn();
	}

	@Then("je verifier tableau de bord s affiche.")
	public void jeVerifierTableauDeBordSAffiche() {
		connexionCasPassantPage.checkPage();

	}

}

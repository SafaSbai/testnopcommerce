package com.e2etests.automation.testCases.step_definitions;


import com.e2etests.automation.testCases.page_objects.ConnexionCasNonPassantPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ConnexionCasNonPassantStepDefinition {


		public ConnexionCasNonPassantPage connexionCasNonPassantPage;

		public ConnexionCasNonPassantStepDefinition() {
			connexionCasNonPassantPage = new ConnexionCasNonPassantPage();
		}

		@Given("Je me connecte sur cette application")
		public void jeMeConnecteSurCetteLApplication() {
			connexionCasNonPassantPage.goToUrl();
		}

		@When("je saisis le login {string}")
		public void jeSaisisLeLogin(String name) {
			connexionCasNonPassantPage.fillAdmin(name);
		}

		@When("je saisis  mot de passe {string}")
		public void jeSaisisMotDePasse(String pwd) {
			connexionCasNonPassantPage.fillPassword(pwd);
		}

		@When("je clique sur le bouton de connexion")
		public void jeClickSurLeBoutonDeConnexion() throws InterruptedException {
			connexionCasNonPassantPage.clickOnLogIn();
		}

		@Then("je verifie tableau de bord s affiche.")
		public void jeVerifierTableauDeBordSAffiche() {
			connexionCasNonPassantPage.checkPage();

		}

	}



@smoketest
Feature: Je me connecte sur l application nopCommerce 

 @cnx_Passant
  Scenario: Je verifie la page de connexion - cas de test passant
    Given Je me connecte sur l application 
    When je saisis login "admin@yourstore.com"
    And je saisis le mot de passe "admin"
    And je click sur le bouton de connexion
    Then je verifier tableau de bord s affiche.

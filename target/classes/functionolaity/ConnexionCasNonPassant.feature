@smoketest
Feature: Je me connecte sur l application nopCommerce 

 @cnx_NonPassant
  Scenario: Je verifie que la page de connexion - cas de test nonpassant
    Given Je me connecte sur cette application 
    When je saisis le login "adm@yourstore.com"
    And je saisis  mot de passe "admin"
    And je clique sur le bouton de connexion
    Then je verifie tableau de bord s affiche.

@list  
Feature: Je verifie la presence de liste deroulante
  Background:
		Given Je me connecte sur l application "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
		When je saisis mon login "admin@yourstore.com "
		And je saisis le mot du passe "admin"
		And je clique sur bouton de connexion 
		Then je verifie que tableau de bord s affiche.
		And Je verifie la presence de liste deroulante des ventes .
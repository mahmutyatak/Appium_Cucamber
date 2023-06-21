@browser
Feature: Kullanici browser testi yapar
  Scenario: Kullanici basarili bir sekilde Amazon Web gorevlerini yapar
    Given Kullanici "https://www.amazon.com" adresine gider
    Then Kullanici arama kutusunda "nutella" aratir
    And Kullanici sayfayi kapatir
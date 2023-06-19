@apk
Feature: Apk yukleme
  Scenario: Kullanici istedigi herhengi bir apk dosyasinin kurulumunu yapar.
    Given Kulanici gerekli kurulumlari yaparak "hepsiburada" yukleme islemi gerceklestirir
    Scenario: Kullanici trendyol apk sini yükler
      Given Kulanici gerekli kurulumlari yaparak "trendyol" yukleme islemi gerceklestirir
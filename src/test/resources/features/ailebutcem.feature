
Feature:ailebutcem login page test
  @wip
  Scenario: Kullanici aile butcem uygulamasina basarili giris yaparak ilgili gorevleri yerine getirir
    Given Kullanici kurulumlari tamamlar
    Then ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin
    Then mail ve password bilgilerini girerek kullanici bilgileriyle giris yapin
    Then uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin
    Then sol kisimdaki menuden hesabim bolumune gidin
    Then hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin
    And ardindan degisiklerin yapildigini dogrulayin
    And Uygulama kapatilir

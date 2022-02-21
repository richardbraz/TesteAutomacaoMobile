#Testes Automatizados, desafio técnico neon

Projeto appium com cucumber para automação mobile (plataforma android)

## Ferramentas utilizadas

* Java 8 (JDK 1.8.202)
* Appium 1.18.0
* Maven
* AndroidStudio (Bumblebee) para simular o device.

## Rodando os testes

1. Startando o appium desktop: `$ appium`


2. Rodando os testes no android: `$ mvn clean test -Dcucumber.options="--tags @TesteCadastroUsuario" -Denv.PLATAFORM=ANDROID` (Foi utilizado essa tag como primeira execução e exemplo, a outra tag é: @ExibirInfo)
   (Necessário efetuar algumas pequenas alterações em: resources\capabilities\androidpie.json, alteraçõe como: DeviceName, PlataformName, PlataformVersion, avd.)


3. Gerando relatório: `mvn allure:serve`

## Importante

* Antes de iniciarmos os testes é necessário startar o servidor appium e o emulador android.


## Documentação

* **[maven](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)**
* **[Appium Docs](http://appium.io/)**
* **[Selenium Docs](https://www.seleniumhq.org/docs/)**
* **[Allure reports](https://github.com/allure-framework/allure-maven)**
* **[cucumber.io](https://cucumber.io/docs/guides/10-minute-tutorial/)**
* **[pagefactory](https://github.com/appium/java-client/blob/master/docs/Page-objects.md)**


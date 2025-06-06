# playwright-cucumber-java-web
[![playwright-cucumber-java-web](https://github.com/rlhorochovec/playwright-cucumber-java-web/actions/workflows/ci.yml/badge.svg)](https://github.com/rlhorochovec/playwright-cucumber-java-web/actions/workflows/ci.yml)

Projeto de automação de testes web utilizando Playwright e Cucumber, executando via GitHub Actions e relatório do GitHub Pages.

## Dependências
- JDK: 17
- Apache Maven: 3.6.3
- Playwright: 1.51.0
- Cucumber: 7.20.1
- JUnit: 5.11.3
- Allure Report: 2.29.0

## Instalação
Baixando as dependências

```bash
  cd playwright-cucumber-java-web
  mvn install
```

## Rodando os testes
Para rodar os testes, rode o seguinte comando

```bash
  mvn clean verify test
```

## Relatório dos testes
Gerar o Allure Report

```bash
  allure serve target/allure-results
  allure serve --sigle-file target/allure-results
```

Apagar o Allure Report de execuções anteriores

```bash
  allure generate --clean --output target/allure-results
```

## Relatório dos testes
[Visualizar](https://rlhorochovec.github.io/playwright-cucumber-java-web/)

## Screenshots
<img src="https://github.com/rlhorochovec/playwright-cucumber-java-web/blob/develop/screenshots/intellij.PNG" width="400" /> <img src="https://github.com/rlhorochovec/playwright-cucumber-java-web/blob/develop/screenshots/overview.PNG" width="400" />
<img src="https://github.com/rlhorochovec/playwright-cucumber-java-web/blob/develop/screenshots/githubactions.PNG" width="400" /> <img src="https://github.com/rlhorochovec/playwright-cucumber-java-web/blob/develop/screenshots/falha.PNG" width="400" />
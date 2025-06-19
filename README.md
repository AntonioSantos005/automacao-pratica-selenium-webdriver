
# Automação de Testes Web sem PageFactory - Projeto Prático

Este projeto é um exemplo prático de automação de testes Web utilizando Java e Selenium WebDriver **sem o uso do PageFactory**. Os testes seguem o padrão Page Object Model (POM) e são escritos com Cucumber e JUnit.

## 🧪 Funcionalidades Automatizadas

- Realizar login no sistema
- Cadastrar novo cliente

## 🔧 Tecnologias Utilizadas

- Java 11+
- Selenium WebDriver
- Cucumber (Gherkin)
- JUnit
- Maven
- Allure Reports (para geração de relatórios)

## 📁 Estrutura do Projeto

```
src
├── main
│   └── java
│       └── utils              # Utilitários e setup do WebDriver
├── test
│   ├── java
│   │   ├── pageObjects        # Páginas com elementos acessados via WebDriver direto
│   │   ├── runners            # Runner genérico do Cucumber
│   │   └── stepsFuncional     # Passos dos testes funcionais
│   └── resources
│       ├── features           # Cenários de testes em Gherkin
│       └── allure.properties  # Configuração do Allure
```

## 🚀 Como Executar os Testes

1. Clone este repositório:

```bash
git clone https://github.com/AntonioSantos005/automacao-pratica-selenium-webdriver.git
cd automacao-pratica-selenium-webdriver
```

2. Execute os testes com Maven:

```bash
mvn clean test
```

3. Para gerar o relatório Allure:

```bash
allure serve target/allure-results
```

## 📝 Observações

- Projeto desenvolvido em 2019
- Este projeto é ideal para quem está aprendendo automação com Selenium e deseja entender como interagir com os elementos sem abstrações como o PageFactory.
- Os elementos são instanciados diretamente com `driver.findElement(...)`.

## 👤 Autor

Antônio de Sousa – [LinkedIn](https://www.linkedin.com/in/antoniosousas/)

# Calculadora Java + JUNIT 5

  Exercício de TDD(Test Driven Development) com Java 21 e JUNIT 5

# Objetivo:

  O projeto consiste na criação de uma calculadora simples e de testes automatizados para validar suas operações.
  
  Atualmente, a implementação possui a operação de soma:
  
  ```java
  public int soma(int a, int b) {
      return a + b;
  }
    O TESTE VERIFICA SE 2 + 3 = 5
  ```

# Tecnologias
  Java 21
  JUnit 5
  Visual Studio Code
  Git
  GitHub

O JUnit foi configurado manualmente através do arquivo
(junit-platform-console-standalone.jar)

# Estrutura
  calculadora-java-junit-tdd/
  ├── .gitignore
  ├── .vscode/
  │   └── settings.json
  ├── lib/
  │   └── junit-platform-console-standalone.jar
  └── src/
      ├── Calculadora.java
      └── CalculadoraTest.java

# Desenvolvimento

Durante a configuração do projeto foram encontrados problemas relacionados ao reconhecimento do JUnit pelo VS Code.

A investigação envolveu:

configuração do classpath;
compilação manual com javac;
execução dos testes pelo JUnit;
análise do Java Language Server;
investigação das extensões do VS Code.

Foi confirmado que o código e o JUnit estavam funcionando corretamente. O problema estava relacionado à configuração/extensões do ambiente de desenvolvimento e foi solucionado após a reorganização das extensões Java instaladas.
Também foi identificado que testes JUnit não precisam de um método main(). A execução deve ser feita através do Run Test do JUnit.

# OBSERVAÇÕES:

  Este projeto foi desenvolvido com auxílio de Inteligência Artificial.
  
  A IA foi utilizada como ferramenta de apoio ao aprendizado, principalmente para:
  configuração do ambiente;
  explicação de Java e JUnit;
  análise e resolução de erros;
  investigação do VS Code;
  orientação sobre Git e GitHub;
  documentação do projeto.
O desenvolvimento, execução dos comandos e validação do funcionamento foram realizados no ambiente local.


Feito por Eduardo Iglesias.

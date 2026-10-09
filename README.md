# Simulados de Java

Coleção de seis exercícios de Java executados pelo terminal, com classes de entrada em `tarefasimulado/src/tarefasimulado/`.

## Requisitos

JDK 21, versão configurada no projeto Eclipse.

## Executar um exercício

A partir da raiz do repositório:

```bash
cd tarefasimulado
javac -encoding UTF-8 -d out src/tarefasimulado/Simulado1.java
java -cp out tarefasimulado.Simulado1
```

Troque `Simulado1` pelo nome do exercício desejado, de `Simulado1` a `Simulado6`. Os exercícios podem solicitar informações pelo terminal.

## Estrutura

- `tarefasimulado/src/tarefasimulado/`: código dos exercícios.
- `tarefasimulado/.project` e `.classpath`: configuração do Eclipse.
- `tarefasimulado/.settings/`: preferências do projeto.

## Status

Material de estudo. Não há Maven, Gradle ou testes automatizados configurados.

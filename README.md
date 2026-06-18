 Calculadora Avançada — Java

Calculadora de linha de comando com múltiplas categorias de cálculo, desenvolvida em Java com navegação por menus interativos.

Desenvolvida como projeto prático durante o curso Técnico em Desenvolvimento de Sistemas — SESI-SENAI.


 Funcionalidades

 Geometria


Área: triângulo, quadrado, retângulo, losango, círculo
Perímetro: triângulo, quadrado, retângulo


 Cálculo


Cálculo básico (+, −, ×, ÷)
Delta (Δ = b² − 4ac)
Bhaskara completo (x¹ e x² ou raiz única)


 Financeiro


Juros simples
Juros compostos
Progressão Aritmética (PA)
Progressão Geométrica (PG)



 Tecnologias utilizadas


Java SE
java.util.Scanner — entrada do usuário
java.lang.Math — funções matemáticas



 Estrutura

calculadoras/
├── Calculadora.java        # Calculadora avançada (geometria, cálculo, financeiro)
└── CalculadoraBasica.java  # Calculadora com as 4 operações básicas


 Como executar

Pré-requisito: JDK instalado

bash# Compilar
javac calculadoras/Calculadora.java

# Executar
java calculadoras.Calculadora


 Exemplo de uso

___Calculadora___
Digite 1 para continuar
Digite 0 para finalizar
Escolha uma opção: 1

___CATEGORIAS___
Digite 1 para geometria
Digite 2 para calculo
Digite 3 para financeiro


👤 Autor

Heitor Roque

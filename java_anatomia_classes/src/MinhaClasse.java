public class MinhaClasse {
    
public static void main(String [] args) {

    //variáveis com todas as letras em maiúsculo (BR) não devem sofrer alteração no decorrer do programa. Para isso pode-se colocar a palavra "final" no início.
    //String é uma classe que representa uma sequência de caracteres, por isso é escrita com "S" maiúsculo.

    final String BR = "Brasil";
    //MAIS EXEMPLOS:
    double PI = 3.14;
    int ESTADOS_BRASILEIRO = 27;
    int ANO_2000 = 2000;

    System.out.println(BR + "\n" + PI + "\n" + ESTADOS_BRASILEIRO + "\n" + ANO_2000);
 
    // Declarações inválidas de variáveis:

    int numero&um = 1; // Os únicos símbolos permitidos são _ e $.
    int 1numero = 1; // Uma variável não pode começar com númeral.
    int numero um = 1; // Não pode ter espaço no nome da variável.
    int long = 1; // long faz parte das palavras reservadas da linguagem.

    // Declarações válidas de variáveis:

    int numero$um = 1;
    int numero1 = 1;
    int numeroUm = 1;
    int longo = 1;

}

}

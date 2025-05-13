public class Loppy {
        public static void main (String[] args) {
        int x = 1;
        System.out.println("Before the loop");
        while (x < 4) {
            System.out.println("In the loop");
            System.out.println("Value of x is " + x); 
            x = x + 1;
        }    
         System.out.println("This  is after the loop");
    }
}

//Instruções terminam em ponto e vírgula
//Blocos de código são delimitados por chaves
//Declare int com un nome e um tipo: int x;
//O operador de atribuição é =
//O operador de igualdade é ==
//Um loop while executa tudo dentro de um bloco (definido por chaves) enquanto a condição for verdadeira
// Se o teste for falso, o bloco de codigo do loop while não é executado, e execução passara para a linha seguinte
//Insira um teste booleano entre parênteses: while (x == 4) {   }

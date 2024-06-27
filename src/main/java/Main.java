// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    int escolha;
    int cod;
    String cpf;
    String nomeFilme;
    int numPoltrona;
    float valor = 0;
    int[][] showPoltrona = new int[12][10];
    boolean[] poltronaDisp = new boolean[120];
    boolean endWhile = false;

    Scanner teclado = new Scanner(System.in);
    ArrayList<Ingresso> sala = new ArrayList<Ingresso>();

    do{
    
    System.out.println("############# CINEMA #############\n");
    System.out.println("digite 1 para adiquirir seu ingresso\n");
    System.out.println("digite 2 para alterar seu ingresso\n");
    System.out.println("digite 3 para desistir da compra do ingresso\n");
    System.out.println("digite 4 para sair do programa\n");
    System.out.println("#######################################\n");
    System.out.println("Faça sua escolha:\n");
    escolha = teclado.nextInt();

    switch(escolha){
      //pedir dados (cpf,nomeFilme,numPoltrona)
      //dados a serem passados(valor,numPoltrona)
      case 1:
        System.out.println("############# Adiquirindo seu ingresso #############\n");

        System.out.println("informe seu cpf (modelo XXX.XXX.XXX-XX):\n");
        Ingresso.setCpf(teclado.nextLine());
        cpf = Ingresso.getCpf();

        System.out.println("informe o nome do filme que deseja assistir:\n");
        Ingresso.setNomeFilme(teclado.nextLine());
        nomeFilme = Ingresso.getNomeFilme();

        do{
          System.out.println("Escolha uma poltrona de 1 a 120:\n");
          for(int contX = 0; contX <=11; contX++){
            for(int contY = 0;contY <=9; contY++){
              showPoltrona[contX][contY] = showPoltrona[contX-1][contY-1] + 1;
              System.out.println(showPoltrona[contX][contY]" ");
              if(contY==9){
                System.out.println("\n");
              }
            }
          }
          Ingresso.setNumPoltrona(teclado.nextInt());
          Ingresso.verPoltrDisp();
          Ingresso.getEndWhile();
        }while(endWhile == false);

        System.out.println("Se você deseja pagar a entrada inteira(R$16,00) digite 1\n");
        System.out.println("Se você deseja pagar a entrada meia(R$8,00) digite 2\n");
        Ingresso.setValor(teclado.nextInt());

        System.out.println("aqui estão suas informações:\n");
        System.out.println("valor do ingresso: " valor "\n");
        System.out.println("numero da poltrona:" numPoltrona "\n");
        break;

      case 2:
        System.out.println("############# Alterando seu ingresso #############");
        break;

      case 3:
        System.out.println("############# Desistindo do seu ingresso #############");
        break;

      case 4:
        System.out.println("############# Fim do programa! #############");
        break;

      default:
        System.out.println("Você escolheu uma opção inválida, digite novamente!");
    }
    }while(opção!=4);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
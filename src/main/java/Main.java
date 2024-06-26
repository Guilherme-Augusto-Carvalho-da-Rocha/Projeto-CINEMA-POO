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
    boolean[] poltronaDisp = new boolean[120];
    boolean endWhile = false;;

    Scanner teclado = new Scanner(System.in);
    ArrayList<Ingresso> sala = new ArrayList<Ingresso>();

    do{
    
    System.out.println("############# CINEMA #############");
    System.out.println("digite 1 para adiquirir seu ingresso");
    System.out.println("digite 2 para alterar seu ingresso");
    System.out.println("digite 3 para desistir da compra do ingresso");
    System.out.println("digite 4 para sair do programa");
    System.out.println("#######################################");
    System.out.println("Faça sua escolha:");
    escolha = teclado.nextInt();

    switch(escolha){
      //pedir dados (cpf,nomeFilme,numPoltrona)
      //dados a serem passados(valor,numPoltrona)
      case 1:
        System.out.println("############# Adiquirindo seu ingresso #############");

        System.out.println("informe seu cpf (modelo XXX.XXX.XXX-XX):");
        Ingresso.setCpf(teclado.nextLine());
        cpf = Ingresso.getCpf();

        System.out.println("informe o nome do filme que deseja assistir:");
        Ingresso.setNomeFilme(teclado.nextLine());
        nomeFilme = Ingresso.getNomeFilme();

        do{
          System.out.println("Escolha uma poltrona de 1 a 120:");
          Ingresso.setNumPoltrona(teclado.nextInt());
          Ingresso.verPoltrDisp();
        }while(endWhile == false);

        System.out.println("Se você deseja pagar a entrada inteira(R$16,00) digite 1");
        System.out.println("Se você deseja pagar a entrada meia(R$8,00) digite 2");
        Ingresso.setValor(teclado.nextInt());

        System.out.println("aqui estão suas informações:");
        System.out.println("valor do ingresso: " valor);
        System.out.println("numero da poltrona:" numPoltrona);
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
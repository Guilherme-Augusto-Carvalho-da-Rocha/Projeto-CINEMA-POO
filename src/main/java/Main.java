// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    int escolha;
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
      case 1:
        System.out.println("Adiquirindo seu ingresso");
        break;
      case 2:
        System.out.println("Alterando seu ingresso");
        break;
      case 3:
        System.out.println("Desistindo do seu ingresso");
        break;
      case 4:
        System.out.println("Fim do programa!");
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
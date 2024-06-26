import java.util.Arrays;

public class Ingresso{
  private int cod;//(calculado automaticamente)
  private String cpf;
  private String nomeFilme;
  private int numPoltrona;// (de 1 a 120)
  private float valor = 0;//(16 reais inteira ou 8 reais meia)
  private boolean[] poltronaDisp = new boolean[120];
  private boolean endWhile = false;
  
  for(int i = 0; i+1 <= 120; i++){
    poltronaDisp[i] = true;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }
  public String getCpf(){
    return this.cpf;
  }

  public void setCod(int cod){
    this.cod =(int)(1 + Math.random() * 10000);
  }

  public void setNomeFilme(String nomeFilme){
    this.nomeFilme = nomeFilme;
  }
  public String getNomeFilme(){
    return this.nomeFilme;
  }

  public void setNumPoltrona(int numPoltrona){
    this.numPoltrona = numPoltrona;
  }

  public void setValor(float valor){
    if(valor == 1){
      this.valor = 16;
    } else if(valor == 2){
      this.valor = 8;
    }
  }
  
  public void verPoltrDisp() {
    if(poltronaDisp[numPoltrona-1] == false){
          System.out.println("você escolheu uma poltrona já ocupada");
        } else if(numPoltrona <=0 || numPoltrona >=121){
          System.out.println("você escolheu uma poltrona inexistente");
        } else if(poltronaDisp[numPoltrona-1] == true){
          System.out.println("você escolheu uma poltrona válida");
          poltronaDisp[numPoltrona] = true;
          endWhile = true;
        }
  }
}
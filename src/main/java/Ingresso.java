import java.util.Arrays;

public class Ingresso{
  private int cod;//(calculado automaticamente)
  private String cpf;
  private String nomeFilme;
  private int numPoltrona;// (de 1 a 120)
  private float valor;//(16 reais inteira ou 8 reais meia)


  public void setCpf(String cpf){
    this.cpf = cpf;
  }
  public void setCod(int cod){
    this.cod =(int)(1 + Math.random() * 120);
  }
  public void setNomeFilme(String nomeFilme){
    this.nomeFilme = nomeFilme;
  }
}
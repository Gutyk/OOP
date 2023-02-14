public class Aluno {

    //atributos ou propriedade ou variãvel de instância
    int rm;
    String name;
    double nota1;
    double nota2;



    public double calcMedia(){
        double media;

        media = (nota1 + nota2)/2;

        return media;
    }

    public String status(){
        String status;

        if(calcMedia() >= 6) {
            return "Aprovado";
        }
        return "Reprovado";
    }
}


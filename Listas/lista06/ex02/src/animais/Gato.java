package animais;

public class Gato implements Animal {
    private String arranhar;
    private String ronronar;

    public Gato(){

    }

    @Override
    public void emitirSom(){
        System.out.println("meooooooooow meooooooooow");
    }

    @Override
    public void comer(){
        System.out.println("o gatinho quase destroi a casa exigindo sua ração, então sem opção, seu dono serve e o pobre gatinho aproveita sua deliciosa ração");
    }

    public void setRonronar(String ronronar){
        this.ronronar = ronronar;
    }
    public void getRonronar(){
        System.out.println("ownnn que fofura, o gatinho está ronronando!!");
    }

    public void setArranhar(String arranhar){
        this.arranhar = arranhar;
    }
    public void getArranhar(){
        System.out.println("INHEEEU! ohh não!!! as cortinas foram rasgadas pelo gato!! :O");
    }
}


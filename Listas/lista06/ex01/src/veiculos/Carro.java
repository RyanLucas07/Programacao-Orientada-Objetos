package veiculos;

public class Carro implements Veiculo {
    private String modeloCarro;
    private String buzina;

    public Carro(String modeloCarro){
        this.modeloCarro = modeloCarro;
    }
    public Carro(){

    }

    @Override
    public void acelerar(){
        if (modeloCarro.equals("Mustang GT")) {
         System.out.println("VVVVRRRRUUUUMMMMMMMMMMM"); 
        } else {
        System.out.println("VRUM VRUM");
        }
    }

    @Override 
    public void frear(){
        System.out.println("shshhhhhhhh");
    }

    public void setModeloCarro(String modeloCarro){
        this.modeloCarro = modeloCarro;
    }
    public String getModeloCarro(){
        return this.modeloCarro;
    }

    public void setBuzina(String buzina){
        this.buzina = buzina;
    }
    public void getBuzina(){
        System.out.println("FOOOOOOOOONFOOOOOOOOOOOOOOON");
    }
}

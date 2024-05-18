public class Luta {
    
    FlashAAA barry = new FlashAAA();
    Reverso eobard = new Reverso(); 
    
    public void comecarBatalha(){
        barry.correr();
        eobard.correrSobreAgua();
    }
    
    public void lutaDeVelocidade(){

        if(barry.velocidade >= eobard.velocidade){
            System.out.println(barry.nome + " Venceu uma corrida sobre " + eobard.nome);
            System.out.println("====================");
        }
        else if(eobard.velocidade >= barry.velocidade){
            System.out.println(eobard.nome + " Deixou o velocista " + barry.nome + " comendo poeira");
            System.out.println("====================");
        }
        else if (barry.velocidade == eobard.velocidade){
            System.out.println("OS DOIS VELOCISTAS TERMINAM EM EMPATE!!!!!!!!!");
            System.out.println("====================");
        }       
    }
    public void batalha(){
        eobard.socar();
        barry.vibrarAtomos();
    }
}

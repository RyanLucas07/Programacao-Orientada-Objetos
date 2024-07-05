# coisas que achei importante

## ^^ imprime a String sem aparecer o endereço de memoria
@override
public String toString(){
    return this.oqQuer;
}


## isso daqui faz seu codigo ver que ja tem algo igual na sua lista :D

@Override
public int hashCode(){
    return Integer.parseInt(this.cpf);
}

@Override
public boolean equals(Object object){
    if (object instanceof ClasseQueQuer) {
        ClasseQueQuer nomeClasse = (ClasseQueQuer) object;
        if (classe.atributo.equalsIgnoreCase(this.atributo)) {
            return true;
        }
    }
        return false;
}
        
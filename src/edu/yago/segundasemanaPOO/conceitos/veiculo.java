package edu.yago.segundasemanaPOO.conceitos;

public abstract class veiculo {
    private String chassi;

    public String getchassi() {
        return chassi;
    };
    public void setchassi(String number) {
        this.chassi = chassi;
    };
    public abstract void ligar();  // Abistração pois todos os veiculos precisaram ligar, só não sabe a forma que irá ser feito.

}

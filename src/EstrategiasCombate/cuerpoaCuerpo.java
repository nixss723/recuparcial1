package EstrategiasCombate;

import CambiosdeEstado.Personaje;

public class cuerpoaCuerpo implements EstrategiaCombate{

    @Override
    public void ejecutar(){
        System.out.println("Realizando un ataque cuerpo a cuerpo!");
    }
}

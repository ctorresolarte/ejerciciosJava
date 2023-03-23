package legislador;

import java.util.ArrayList;

public class NominaLegisladores {
    private ArrayList<Legislador>listaLegisladores;
    
    public NominaLegisladores(){
        listaLegisladores = new ArrayList<Legislador>();
    }
    public void agregaLegislador(Legislador nuevoLegislador){
        listaLegisladores.add(nuevoLegislador);
    }
    
    public int getTamaño(){
        return listaLegisladores.size();
    }
    
    public void muestraContenido(){
      for (Legislador tmp: listaLegisladores) {
            System.out.println (tmp.toString());
            System.out.print ("Este Legislador trabaja en la Cámara de ");
            tmp.getCamaraEnQueTrabaja();
            System.out.println("\n");
        }
    }
}

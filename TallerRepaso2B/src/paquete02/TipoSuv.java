package paquete02;

import paquete03.Comprador;

public class TipoSuv extends Vehiculo{
    private double porcentajeSeguroPers;
    private double seguroPersona;

    public TipoSuv(double porcSeg, double segPers, Comprador prop, String mar,
            double precB) {
        super(prop, mar, precB);
        porcentajeSeguroPers = porcSeg;
        seguroPersona = segPers;
    }

    public void establecerPorcentajeSeguroPers(double porcSeg) {
        porcentajeSeguroPers = porcSeg;
    }

    public void establecerSeguroPersona() {
        seguroPersona = precioBase * (porcentajeSeguroPers / 100);
    }
    
    @Override
    public void calcularPrecioFinal() {
        precioFinal = precioBase + seguroPersona;   
    }

    public double obtenerPorcentajeSeguroPers() {
        return porcentajeSeguroPers;
    }

    public double obtenerSeguroPerson() {
        return seguroPersona;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("------>TIPO SUV\n"
                + "%s"
                + "Porcentaje adicional del seguro: %.2f%%\n"
                + "Seguro personas: $%.2f\n"
                + "Precio final: $%.2f\n", 
                super.toString(),
                obtenerPorcentajeSeguroPers(),
                obtenerSeguroPerson(),
                obtenerPrecioFinal());
        return cadena;
    }
}

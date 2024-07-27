package paquete01;

import paquete02.TipoCamioneta;
import paquete02.TipoSedan;
import paquete02.TipoSuv;
import paquete03.Comprador;

public class Ejecutor {
    public static void main(String[] args) {
        
        Comprador comprador1 = new Comprador("Adrian Valverde", "1140039758");
        Comprador comprador2 = new Comprador("Alisson Condoy", "1140078635");

        TipoSedan sedan1 = new TipoSedan(
                12,
                250.0, 
                comprador1, 
                "Toyota", 
                22000, 
                0); 
        sedan1.establecerValorDescuento();
        sedan1.calcularPrecioFinal();

        TipoSedan sedan2 = new TipoSedan(
                18,
                300.0,
                comprador2, 
                "Nissan", 
                24000,
                0); 
        sedan2.establecerValorDescuento();
        sedan2.calcularPrecioFinal();

        TipoSuv suv = new TipoSuv(
                7, 
                600.0, 
                comprador1, 
                "Jeep",
                28000,
                0);
        suv.establecerSeguroPerson();
        suv.calcularPrecioFinal();

        TipoCamioneta camioneta = new TipoCamioneta(
                10, 
                comprador2,
                "Hyundai", 
                32000,
                0); 
        camioneta.establecerValorAdicionalImportacion();
        camioneta.calcularPrecioFinal();

    }
}

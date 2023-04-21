package classes;
import exceptions.ExceptionError;
import interfaces.FiguraGeometrica;

public class Pentagono implements FiguraGeometrica {
    private double lado, apotema, coordenadaX, coordenadaY;
    public Pentagono() {}

public Pentagono(double lado, double apotema, double coordenadaX, double coordenadaY) throws ExceptionError {
    if(lado < 0 || apotema < 0 || coordenadaX < 0 || coordenadaY < 0) throw new ExceptionError("Ninguno de los parámetros puede tener valor negativo.");
    this.lado = lado;
    this.apotema = apotema;
    this.coordenadaX = coordenadaX;
    this.coordenadaY = coordenadaY;
}

public double getLado() { return lado; }

public void setLado(double lado) throws ExceptionError {
    if(lado < 0) throw new ExceptionError("Side cannot have negative value");
    this.lado = lado;
}

public double getApotema() { return apotema; }

public void setApotema(double apotema) throws ExceptionError {
    if(apotema < 0) throw new ExceptionError("The apothem cannot have a negative value");
    this.apotema = apotema;
}

public double getCoordenadaX() { return coordenadaX; }

public void setCoordenadaX(double coordenadaX) throws ExceptionError {
    if(coordenadaX < 0) throw new ExceptionError("The X coordinate cannot have a negative value.");
    this.coordenadaX = coordenadaX;
}

public double getCoordenadaY() { return coordenadaY; }

public void setCoordenadaY(double coordenadaY) throws ExceptionError {
    if(coordenadaY < 0) throw new ExceptionError("The Y coordinate cannot have a negative value.");
    this.coordenadaY = coordenadaY;
}

@Override
public double calcularPerimetro() { return this.getLado() * 5; }

@Override
public double calcularSuperficie() { return calcularPerimetro() * this.getApotema() / 2; }

@Override
public String toString() {
    return String.format("Pentagon{side=%.2f, apothem=%.2f, X-coordinate=%.2f, Y-coordinate=%.2f, perimeter=%.2f, area=%.2f}", 
                        this.getLado(), this.getApotema(), this.getCoordenadaX(), this.getCoordenadaY(), this.calcularPerimetro(), this.calcularSuperficie());
}
}
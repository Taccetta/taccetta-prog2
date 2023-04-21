package classes;
import exceptions.ExceptionError;
import interfaces.FiguraGeometrica;

public class Circulo implements FiguraGeometrica {
    private double radio;
    private double coordenadaX;
    private double coordenadaY;

    public Circulo() {
    }

    public Circulo(double radio, double coordenadaX, double coordenadaY) throws ExceptionError {
        setCoordenada(radio, coordenadaX, coordenadaY);
    }

    public void setCoordenada(double radio, double coordenadaX, double coordenadaY) throws ExceptionError {
        if (radio < 0 || coordenadaX < 0 || coordenadaY < 0) {
            throw new ExceptionError("None of the parameters can have a negative value.");
        }
        this.radio = radio;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public double getCoordenada(String tipo) {
        switch (tipo) {
            case "radio":
                return radio;
            case "coordenadaX":
                return coordenadaX;
            case "coordenadaY":
                return coordenadaY;
            default:
                return 0;
        }
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) throws ExceptionError {
        if(radio < 0) {
            throw new ExceptionError("The radius cannot have a negative value.");
        }
        this.radio = radio;
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) throws ExceptionError {
        if(coordenadaX < 0) {
            throw new ExceptionError("The X coordinate cannot have a negative value");
        }
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) throws ExceptionError {
        if(coordenadaY < 0) {
            throw new ExceptionError("The Y coordinate cannot have a negative value");
        }
        this.coordenadaY = coordenadaY;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.getRadio();
    }

    @Override
    public double calcularSuperficie() {
        return Math.PI * Math.pow(this.getRadio(), 2);
    }

    @Override
    public String toString() {
        return String.format("Circle{radius=%.2f, xcoordinate=%.2f, ycoordinate=%.2f, perimeter=%.2f, area=%.2f}",
            this.getRadio(), this.getCoordenadaX(), this.getCoordenadaY(), this.calcularPerimetro(), this.calcularSuperficie());
    }
}

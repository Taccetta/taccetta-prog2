package classes;
import exceptions.ExceptionError;
import interfaces.FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica {
    private double base, altura, coordenadaX,coordenadaY;

    public Rectangulo() {}

    public Rectangulo(double base, double altura, double coordenadaX, double coordenadaY) throws ExceptionError {
        if(base < 0 || altura < 0 || coordenadaX < 0 || coordenadaY < 0) {
            throw new ExceptionError("None of the parameters can have a negative value.");
        }
        this.base = base;
        this.altura = altura;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public double getBase() { return base; }

    public void setBase(double base) throws ExceptionError {
        if(base < 0) throw new ExceptionError("The base cannot have a negative value.");
        this.base = base;
    }

    public double getAltura() { return altura; }

    public void setAltura(double altura) throws ExceptionError {
        if(altura < 0) throw new ExceptionError("The height cannot have a negative value.");
        this.altura = altura;
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
    public double calcularSuperficie() { return this.getBase() * this.getAltura(); }

    @Override
    public double calcularPerimetro() { return this.getBase() * 2 + this.getAltura() * 2; }

    @Override
    public String toString() {
        return String.format("Rectangulo{base=%.2f, altura=%.2f, coordenadaX=%.2f, coordenadaY=%.2f, perímetro=%.2f, superficie=%.2f}",
                this.getBase(), this.getAltura(), this.getCoordenadaX(), this.getCoordenadaY(), this.calcularPerimetro(), this.calcularSuperficie());
    }
}

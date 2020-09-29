package ru.mirea.prac10.complex;

import ru.mirea.prac10.complex.Complex;

public interface ComplexAbstractFactory {
    public Complex createComplex();
    public Complex createComplex(int real, int image);
}

package com.amazon.utils;
/*
 * @(#) IndexRandom.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import java.util.Random;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class IndexRandom {
    public static int generarIndiceAleatorio(int tamanoArreglo) {
        Random random = new Random();
        return random.nextInt(tamanoArreglo);
    }
}

package com.alkomprar.utils;

import java.util.Random;

public class RandomIndex {
    public static int indiceAleatorio(int numeroMaximo) {
        Random random = new Random();
        return random.nextInt(numeroMaximo);
    }
}

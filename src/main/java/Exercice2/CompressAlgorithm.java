package Exercice2;

public abstract class CompressAlgorithm {
    public final int[] compresser(int[] data) {
        // Étapes communes de compression
        return compressData(data);
    }

    protected abstract int[] compressData(int[] data);
}

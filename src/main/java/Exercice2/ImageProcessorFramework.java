package Exercice2;

public class ImageProcessorFramework {
    private FilterStrategy filterStrategy;
    private CompressAlgorithm compressAlgorithm;

    public void setFilterStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void setCompressAlgorithm(CompressAlgorithm compressAlgorithm) {
        this.compressAlgorithm = compressAlgorithm;
    }

    public int[] processImage(int[] data) {
        if (filterStrategy != null) {
            data = filterStrategy.filter(data);
        }
        if (compressAlgorithm != null) {
            data = compressAlgorithm.compresser(data);
        }
        return data;
    }
}


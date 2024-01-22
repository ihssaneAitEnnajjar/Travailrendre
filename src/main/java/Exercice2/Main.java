package Exercice2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImageProcessorFramework framework = new ImageProcessorFramework();

        System.out.println("Enter the filter class name:");
        String filterClassName = scanner.nextLine();
        System.out.println("Enter the compression class name:");
        String compressClassName = scanner.nextLine();

        try {
            FilterStrategy filter = (FilterStrategy) Class.forName(filterClassName).newInstance();
            CompressAlgorithm compressor = (CompressAlgorithm) Class.forName(compressClassName).newInstance();

            framework.setFilterStrategy(filter);
            framework.setCompressAlgorithm(compressor);

            int[] imageData = {};
            int[] processedData = framework.processImage(imageData);


        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}

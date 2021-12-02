package ru.mirea.exercise27_28;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Итог
//С одним потоком за 3170 мс
//С многопоточностью за 2017 мс

public class exercise27_28 {
    public static void main(String[] args) throws IOException {
        int cores = Runtime.getRuntime().availableProcessors(); // значение 8

        String srcFolder = "src\\ru\\mirea\\exercise27_28\\images";
        String dstFolder = "src\\ru\\mirea\\exercise27_28\\dst";
        File srcDir = new File(srcFolder);

        long start = System.currentTimeMillis();
        File[] files = srcDir.listFiles();


        if (!Files.exists(Paths.get(dstFolder))) {
            Files.createDirectories(Paths.get(dstFolder));
        }

        ExecutorService service = Executors.newFixedThreadPool(cores);
        for (File file : files) {
            BufferedImage image = ImageIO.read(file);
            if (image == null) {
                continue;
            }
            service.execute(new Runnable() {
                @Override
                public void run() {
                    int newWidth = image.getWidth() / 2;
                    int newHeight = (int) Math.round(
                            image.getHeight() / (image.getWidth() / (double) newWidth)
                    );
                    BufferedImage newImage = new BufferedImage(
                            newWidth, newHeight, BufferedImage.TYPE_INT_RGB
                    );

                    int widthStep = image.getWidth() / newWidth;
                    int heightStep = image.getHeight() / newHeight;

                    for (int x = 0; x < newWidth; x++) {
                        for (int y = 0; y < newHeight; y++) {
                            int rgb = image.getRGB(x * widthStep, y * heightStep);
                            newImage.setRGB(x, y, rgb);
                        }
                    }

                    File newFile = new File(dstFolder + "/" + file.getName());
                    try {
                        ImageIO.write(newImage, "jpg", newFile);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });


        }
        service.shutdown();

        System.out.println("Duration: " + (System.currentTimeMillis() - start));
    }
}
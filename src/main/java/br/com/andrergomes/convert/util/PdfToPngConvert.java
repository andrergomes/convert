/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.andrergomes.convert.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;

/**
 *
 * @author Andre
 */
public class PdfToPngConvert {

    private static final String TARGET_EXTENSION = ".png";

    public static void generatePngFromPdf(String sourcePath, String targetPath, Integer page) throws IOException {

        String targetName = new File(sourcePath).getName().replaceFirst("[.][^.]+$", "");

        String targetFileName = Paths.get(targetPath, targetName + "_pg" + page + TARGET_EXTENSION).toString();

        try (PDDocument document = PDDocument.load(new File(sourcePath))) {
            PDFRenderer pdfRenderer = new PDFRenderer(document);

            BufferedImage bim = pdfRenderer.renderImageWithDPI(--page, 300, ImageType.RGB);
            ImageIOUtil.writeImage(bim, targetFileName, 300);
        }
    }

    public static int getSizePdfPages(String sourcePath) throws IOException {
        PDDocument document = PDDocument.load(new File(sourcePath));

        return document.getNumberOfPages();
    }
}

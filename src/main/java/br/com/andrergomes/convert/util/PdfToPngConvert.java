/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.andrergomes.convert.util;

import java.awt.image.BufferedImage;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;

/**
 *
 * @author Andre
 */
public class PdfToPngConvert {

    public static void generatePngFromPdf(String filename, Integer page, String extension) throws IOException {
        try (PDDocument document = PDDocument.load(PdfToPngConvert.class.getClassLoader().getResourceAsStream(filename))) {
            PDFRenderer pdfRenderer = new PDFRenderer(document);

            BufferedImage bim = pdfRenderer.renderImageWithDPI(page, 300, ImageType.RGB);
            ImageIOUtil.writeImage(bim, String.format("pdf-%d.%s", page + 1, extension), 300);
        }
    }

    public static int getSizePdfPages(String filename) throws IOException {
        PDDocument document = PDDocument.load(PdfToPngConvert.class.getClassLoader().getResourceAsStream(filename));

        return document.getNumberOfPages();
    }
}

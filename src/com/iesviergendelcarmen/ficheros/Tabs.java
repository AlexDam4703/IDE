package com.iesviergendelcarmen.ficheros;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.TabSettings;
import com.itextpdf.text.pdf.PdfWriter;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
//import sandbox.WrapToTest;
 
//@WrapToTest
public class Tabs {
 
    public static final String DEST = "FicheroPDF/tabs.pdf";
 
    public static void main(String[] args) throws IOException, DocumentException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new Tabs().createPdf(DEST);
    }
 
    public void createPdf(String dest) throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(dest));
 
        document.open();
        Paragraph p = new Paragraph("Texto sin tabular.");
 
        document.add(p);
 
        p = new Paragraph();
        p.setTabSettings(new TabSettings(56f));
        p.add(Chunk.TABBING);
        document.add(p);
        p.add(new Chunk("Texto con el tabulado al inicio."));
        p = new Paragraph();
        p.add(new Chunk("texto con"));
        p.setTabSettings(new TabSettings(56f));
        p.add(Chunk.TABBING);
        p.add(new Chunk("tabulado en mitad"));
 
        document.add(p);
 
        document.close();
    }
 
}


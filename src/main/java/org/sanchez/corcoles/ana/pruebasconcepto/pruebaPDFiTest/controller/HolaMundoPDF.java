package org.sanchez.corcoles.ana.pruebasconcepto.pruebaPDFiTest.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HolaMundoPDF {

    @RequestMapping("/escribirPdf")
    public String escribirPDF() throws FileNotFoundException, DocumentException {
        FileOutputStream archivo = new FileOutputStream("C:\\hola.pdf");
        Document documento = new Document();
        PdfWriter.getInstance(documento, archivo);
        documento.open();
        documento.add(new Paragraph("Hola Mundo!"));
        documento.close();
        return "OK";
    }
}

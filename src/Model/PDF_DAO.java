package Model;

import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import static com.itextpdf.text.pdf.PdfName.COURIER;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import javax.swing.JOptionPane;

public class PDF_DAO {

    public static void pdf() throws Exception{

        Document doc = null;
        OutputStream os = null;

        try {
             String data;
             String hora;
             
            data = JOptionPane.showInputDialog(null,"Digite a data: ");
            hora = JOptionPane.showInputDialog(null,"Digite a hora: ");
            String preco = JOptionPane.showInputDialog(null,"Digite o preço total: ");
          
            
            //cria o documento tamanho A4, margens de 2,54cm
            doc = new Document(PageSize.A4, 72, 72, 72, 72);

            //cria a stream de saída
            os = new FileOutputStream("ates2.pdf");

            //associa a stream de saída ao
            PdfWriter.getInstance(doc, os);

            //abre o documento
            doc.open();

            Paragraph title= new Paragraph("                                                      NOTA FISCAL");
            doc.add(title);
            Paragraph par = new Paragraph("\n\n\nQUALIMARKET\nRua José Vieira Martins 270\nSão Paulo - SP\n\nCNPJ: 89.455.000/003-00\nDATA:"+data+"  HORÁRIO:"+hora+"\n--------------------------------------------------------------------------------------------------------------\n\nCUPOM FISCAL\n\n\nTOTAL:"+preco+"\nDINHEIRO:\nIMPOSTO:22,5%");
            doc.add(par);

        } finally {

            if (doc != null) {

                //fechamento do documento
                doc.close();
            }

            if (os != null) {
                //fechamento da stream de saída
                os.close();
            }
        }   
        Desktop.getDesktop().open(new File("ates2.pdf"));
    }

    
}
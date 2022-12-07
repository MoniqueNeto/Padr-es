package data_mining;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<DocumentTemplate> docs = new ArrayList<>();
		docs.add(new PDF("myPdf.pdf"));
		docs.add(new CSV("myCsv.csv"));
		docs.add(new DOC("myDoc.doc"));
		docs.add(new XML("myXml.xml"));
		docs.add(new TXT("myTxt.txt"));
		
		for (DocumentTemplate doc: docs) {
			doc.run();
			System.out.println("\n");
		}
	}

}

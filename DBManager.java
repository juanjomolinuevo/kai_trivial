import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DBManager {
	
	/**galdera[lerroa][zutabea]
     * ZUTABEA
     * 0  Kategoria
     * 1  Galdera
     * 2  Erantzun zuzena
     * 3  Erantzun okerra 1
     * 4  Erantzun okerra 2
     * 5  Erantzun okerra 3     */
	
	private static String [][] galderak  = new String[500][6];
	
	public static void readCSV() {
		String csvFile = "galderak.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";       
        
        try {
        	int n = 0;
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] datua = line.split(cvsSplitBy);
                int m = 0;
                while(m<6) {
                	int letraKop = datua[m+2].length();
                	if(m!=5) {
                		galderak[n][m] = datua[m+2].substring(2, letraKop-2);
                	}else {
                		galderak[n][m] = datua[m+2].substring(2, letraKop-3);
                	}             	
                	m = m + 1;
                }
                n = n + 1;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
	}
	
	public void fitxategiaIrakurri() throws Exception {
		java.io.FileInputStream is = new java.io.FileInputStream("Biltegia.dat");
		java.io.ObjectInputStream ois = new java.io.ObjectInputStream(is);
		galderak = (String[][]) ois.readObject();
		ois.close();
	}

	public static void fitxategianGorde() throws FileNotFoundException, IOException {
		java.io.FileOutputStream os = new java.io.FileOutputStream("Biltegia.dat");
		java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(os);
		oos.writeObject(galderak);
		oos.close();
	}
}
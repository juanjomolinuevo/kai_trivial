import java.text.SimpleDateFormat;
import java.util.Date;

public class Partida {

	//private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private Date hasieraData;
	private Date gordetzeData;
	private Taldea taldeak[];
	private int noriDagokio;
	private String[][] galderak;
	
	public Partida() {}
	
	public Partida(Date hD, Taldea t1, Taldea t2, Taldea t3, Taldea t4) {
		hasieraData = hD;
		taldeak[0] = t1;
		taldeak[1] = t2;
		taldeak[2] = t3;
		taldeak[3] = t4;
		noriDagokio = 0;
	}

	public Date getHasieraData() {
		return hasieraData;
	}

	public void setHasieraData(Date hasieraData) {
		this.hasieraData = hasieraData;
	}

	public Date getGordetzeData() {
		return gordetzeData;
	}

	public void setGordetzeData(Date gordetzeData) {
		this.gordetzeData = gordetzeData;
	}

	public Taldea[] getTaldeak() {
		return taldeak;
	}

	public void setTaldeak(Taldea[] taldeak) {
		this.taldeak = taldeak;
	}

	public int getNoriDagokio() {
		return noriDagokio;
	}

	public void setNoriDagokio(int noriDagokio) {
		this.noriDagokio = noriDagokio;
	}
	
	public String[][] getGalderak() {
		return galderak;
	}

	public void setGalderak(String[][] galderak) {
		this.galderak = galderak;
	}
}
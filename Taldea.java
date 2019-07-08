public class Taldea {

	private String taldearenIzena;
	private String taldekideenIzenak;
	private int puntuak;
	private boolean geografia;
	private boolean historia;
	private boolean hizkuntzak;
	private boolean artea;
	private boolean aisialdia;
	private boolean zientzia;
	
	public Taldea() {}
	
	public Taldea(String t1, String t2) {
		taldearenIzena = t1;
		taldekideenIzenak = t2;
		puntuak = 0;		
	}

	public String getTaldearenIzena() {
		return taldearenIzena;
	}

	public void setTaldearenIzena(String taldearenIzena) {
		this.taldearenIzena = taldearenIzena;
	}

	public String getTaldekideenIzenak() {
		return taldekideenIzenak;
	}

	public void setTaldekideenIzenak(String taldekideenIzenak) {
		this.taldekideenIzenak = taldekideenIzenak;
	}

	public int getPuntuak() {
		return puntuak;
	}

	public void setPuntuak(int puntuak) {
		this.puntuak = puntuak;
	}

	public boolean isGeografia() {
		return geografia;
	}

	public void setGeografia(boolean geografia) {
		this.geografia = geografia;
	}

	public boolean isHistoria() {
		return historia;
	}

	public void setHistoria(boolean historia) {
		this.historia = historia;
	}

	public boolean isHizkuntzak() {
		return hizkuntzak;
	}

	public void setHizkuntzak(boolean hizkuntzak) {
		this.hizkuntzak = hizkuntzak;
	}

	public boolean isArtea() {
		return artea;
	}

	public void setArtea(boolean artea) {
		this.artea = artea;
	}

	public boolean isAisialdia() {
		return aisialdia;
	}

	public void setAisialdia(boolean aisialdia) {
		this.aisialdia = aisialdia;
	}

	public boolean isZientzia() {
		return zientzia;
	}

	public void setZientzia(boolean zientzia) {
		this.zientzia = zientzia;
	}
	
	public int kalkulatuPuntuak(Taldea t) {
		int p = 0;
		if(t.isGeografia() == true) {
			p++;
		}
		if(t.isHistoria() == true) {
			p++;
		}
		if(t.isHizkuntzak() == true) {
			p++;
		}
		if(t.isArtea() == true) {
			p++;
		}
		if(t.isAisialdia() == true) {
			p++;
		}
		if(t.isZientzia() == true) {
			p++;
		}
		return p;
	}
}
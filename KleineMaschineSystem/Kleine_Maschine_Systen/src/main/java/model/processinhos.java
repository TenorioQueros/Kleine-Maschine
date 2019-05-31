package model;

public class processinhos {
	private int pid;
	private double cpu;
	private double memoria;
	private String vsz;
	private String rss;
	private String nome;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public double getCpu() {
		return cpu;
	}
	public void setCpu(double cpu) {
		this.cpu = cpu;
	}
	public double getMemoria() {
		return memoria;
	}
	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}
	public String getVsz() {
		return vsz;
	}
	public void setVsz(String vsz) {
		this.vsz = vsz;
	}
	public String getRss() {
		return rss;
	}
	public void setRss(String rss) {
		this.rss = rss;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "processinhos [pid=" + pid + ", cpu=" + cpu + ", memoria=" + memoria + ", vsz=" + vsz + ", rss=" + rss
				+ ", nome=" + nome + "]";
	}
	
	
}

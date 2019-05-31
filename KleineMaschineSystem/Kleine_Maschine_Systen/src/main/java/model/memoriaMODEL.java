package model;

import java.awt.Component;

import javax.swing.JOptionPane;

import org.json.JSONObject;

import oshi.PlatformEnum;
import oshi.SystemInfo;
import oshi.util.FormatUtil;

public class memoriaMODEL {
	static slackModel slack = new slackModel();
	public static String totalRAM() {
		

		SystemInfo sc = new SystemInfo();

		long totalRam = sc.getHardware().getMemory().getTotal();
		// memoria usada

		return FormatUtil.formatBytesDecimal(totalRam);

	}

	public static String ramUSADA() {
		SystemInfo sc = new SystemInfo();

		long totalRam = sc.getHardware().getMemory().getTotal();

		long RAMusada = sc.getHardware().getMemory().getAvailable();
		int RAM = (int) ((RAMusada * 100) / totalRam);

		String ram = null;
		ram = "" + RAM;
		
		return ram + " %";

	}

	public static String nomeProcessador() {
		SystemInfo sc = new SystemInfo();

		String processador = sc.getHardware().getProcessor().getName();

		return processador;

	}

	public static String sistemaOperacional() {
		SystemInfo sc = new SystemInfo();

		PlatformEnum marcaSysO = SystemInfo.getCurrentPlatformEnum();
		String a;
		a = "" + marcaSysO;
		return a;

	}

	// ----------------------------------graficos---------------------------]
	public static int totalRAMM() {
		SystemInfo sc = new SystemInfo();

		long totalRam = sc.getHardware().getMemory().getTotal();
		// memoria usada

		int toTalRAM = (int) ((totalRam * 100) / totalRam);
		return toTalRAM;

	}

	public static int ramUSADAA() throws Exception {
		SystemInfo sc = new SystemInfo();

		long totalRam = sc.getHardware().getMemory().getTotal();

		long RAMusada = sc.getHardware().getMemory().getAvailable();
		int RAM = (int) ((RAMusada * 100) / totalRam);
		
		if (RAM >= 50000) {
			Component rootPane = null;
			 JSONObject message = new JSONObject();
		        message.put("text", "Memória alcançando limite de utilização");
		      slack.insertMessage(message);
			JOptionPane.showMessageDialog(rootPane, "Memória alcançando limite de utilização", "ALERTA",
					JOptionPane.ERROR_MESSAGE, null);

		}
		if (RAM >= 70000) {
			Component rootPane = null;
			JSONObject message = new JSONObject();
	        message.put("text", "Memoria  excedeu limite de utilizacao");
	       slack.insertMessage(message);
			JOptionPane.showMessageDialog(rootPane, "Memória  excedeu limite de utilização", "ALERTA",
					JOptionPane.ERROR_MESSAGE, null);
		}
		
		return RAM;

	}
}
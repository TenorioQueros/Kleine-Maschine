package model;

import oshi.SystemInfo;

import oshi.hardware.HardwareAbstractionLayer;
import oshi.util.FormatUtil;

import static java.lang.Thread.sleep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import oshi.hardware.*;

import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;
import oshi.software.os.OperatingSystem.ProcessSort;

public class processo {

	public static List<processinhos> ps = new ArrayList<processinhos>();

	public static void qualquerCoisa() {
		SystemInfo sistema = new SystemInfo();
		OperatingSystem os = sistema.getOperatingSystem();
		HardwareAbstractionLayer hal = sistema.getHardware();
		GlobalMemory memory = hal.getMemory();

		List<OSProcess> procs = Arrays.asList(os.getProcesses(5, ProcessSort.CPU));

		for (int i = 0; i < procs.size() && i < 5; i++) {

			processinhos ps1 = new processinhos();
			OSProcess p = procs.get(i);
			ps1.setPid(p.getProcessID());
			ps1.setCpu(100d * (p.getKernelTime() + p.getUserTime() / p.getUpTime()));
			ps1.setMemoria(100d * p.getResidentSetSize() / memory.getTotal());
			ps1.setVsz(FormatUtil.formatBytes(p.getVirtualSize()));
			ps1.setRss(FormatUtil.formatBytes(p.getResidentSetSize()));
			ps1.setNome(p.getName());
			ps.add(ps1);
		}

	}

	public static void main(String[] args) throws InterruptedException {

		SystemInfo sistema = new SystemInfo();
		OperatingSystem os = sistema.getOperatingSystem();

		HardwareAbstractionLayer hal = sistema.getHardware();
		GlobalMemory memory = hal.getMemory();

		// Lista os Processos da cpu e suas devidas Porcentagens
		List<OSProcess> procs = Arrays.asList(os.getProcesses(5, ProcessSort.CPU));
		Object dados[][] = new Object[procs.size()][6];
		//aqui lista no console
		// System.out.println(" PID %CPU %MEM VSZ RSS Name");
		// for (int i = 0; i < procs.size() && i < 5; i++) {
		// OSProcess p = procs.get(i);
		// System.out.format(" %5d %5.1f %4.1f %9s %9s %s%n", p.getProcessID(),
		// 100d * (p.getKernelTime() + p.getUserTime()) / p.getUpTime(),
		// 100d * p.getResidentSetSize() / memory.getTotal(),
		// FormatUtil.formatBytes(p.getVirtualSize()),
		// FormatUtil.formatBytes(p.getResidentSetSize()), p.getName());
		// }
		//

		for (int i = 0; i < procs.size() && i < 5; i++) {
			processinhos ps1 = new processinhos();
			OSProcess p = procs.get(i);
			ps1.setPid(p.getProcessID());
			ps1.setCpu(100d * (p.getKernelTime() + p.getUserTime() / p.getUpTime()));
			ps1.setMemoria(100d * p.getResidentSetSize() / memory.getTotal());
			ps1.setVsz(FormatUtil.formatBytes(p.getVirtualSize()));
			ps1.setRss(FormatUtil.formatBytes(p.getResidentSetSize()));
			ps1.setNome(p.getName());
			ps.add(ps1);
		}

		for (int i = 0; i < dados.length; i++) {
			System.out.println(ps.get(i));
		}
	}

}

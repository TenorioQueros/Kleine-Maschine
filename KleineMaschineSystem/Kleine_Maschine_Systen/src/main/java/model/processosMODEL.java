package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;
import oshi.software.os.OperatingSystem.ProcessSort;
import oshi.util.FormatUtil;

public class processosMODEL {

	public static String processos() {
		   String a="";
	 SystemInfo sistema = new SystemInfo();
     OperatingSystem os = sistema.getOperatingSystem();
     
     HardwareAbstractionLayer hal = sistema.getHardware();
     GlobalMemory memory = hal.getMemory();
     
     //Lista os Processos da cpu e suas devidas Porcentagens 
     List<OSProcess> procs = Arrays.asList(os.getProcesses(5, ProcessSort.CPU));
     
     List<Object> dadosRecuperados = new ArrayList<Object>();
     
     for (int i = 0; i < procs.size() && i < 5; i++) {
         OSProcess p = procs.get(i);
//         System.out.format(" %5d %5.1f %4.1f %9s %9s %s%n", p.getProcessID(),
//                 100d * (p.getKernelTime() + p.getUserTime()) / p.getUpTime(),
//                 100d * p.getResidentSetSize() / memory.getTotal(), FormatUtil.formatBytes(p.getVirtualSize()),
//                 FormatUtil.formatBytes(p.getResidentSetSize()), p.getName());
//         
         dadosRecuperados.add(p.getProcessID());
   
         
      
         a+=dadosRecuperados;
         return a;
     }
	return a;
     		
}
	public static String processos2() {
		   String a="";
	 SystemInfo sistema = new SystemInfo();
  OperatingSystem os = sistema.getOperatingSystem();
  
  HardwareAbstractionLayer hal = sistema.getHardware();
  GlobalMemory memory = hal.getMemory();
  
  //Lista os Processos da cpu e suas devidas Porcentagens 
  List<OSProcess> procs = Arrays.asList(os.getProcesses(5, ProcessSort.CPU));
  
  List<Object> dadosRecuperados = new ArrayList<Object>();
  
  for (int i = 0; i < procs.size() && i < 5; i++) {
      OSProcess p = procs.get(i);
//      System.out.format(" %5d %5.1f %4.1f %9s %9s %s%n", p.getProcessID(),
//              100d * (p.getKernelTime() + p.getUserTime()) / p.getUpTime(),
//              100d * p.getResidentSetSize() / memory.getTotal(), FormatUtil.formatBytes(p.getVirtualSize()),
//              FormatUtil.formatBytes(p.getResidentSetSize()), p.getName());
//      
      dadosRecuperados.add((p.getKernelTime() + p.getUserTime()) / p.getUpTime());
 
   
      a+=dadosRecuperados;
      return a;
  }
	return a;
  		
}
	public static String processos3() {
		   String a="";
	 SystemInfo sistema = new SystemInfo();
  OperatingSystem os = sistema.getOperatingSystem();
  
  HardwareAbstractionLayer hal = sistema.getHardware();
  GlobalMemory memory = hal.getMemory();
  
  //Lista os Processos da cpu e suas devidas Porcentagens 
  List<OSProcess> procs = Arrays.asList(os.getProcesses(5, ProcessSort.CPU));
  
  List<Object> dadosRecuperados = new ArrayList<Object>();
  
  for (int i = 0; i < procs.size() && i < 5; i++) {
      OSProcess p = procs.get(i);
//      System.out.format(" %5d %5.1f %4.1f %9s %9s %s%n", p.getProcessID(),
//              100d * (p.getKernelTime() + p.getUserTime()) / p.getUpTime(),
//              100d * p.getResidentSetSize() / memory.getTotal(), FormatUtil.formatBytes(p.getVirtualSize()),
//              FormatUtil.formatBytes(p.getResidentSetSize()), p.getName());
//      
      	//numero 0 fecha tudo
      	dadosRecuperados.add(p.getResidentSetSize() / memory.getTotal());
   
   
      a+=dadosRecuperados;
      return a;
  }
	return a;
  		
}
	public static String processos4() {
		   String a="";
	 SystemInfo sistema = new SystemInfo();
OperatingSystem os = sistema.getOperatingSystem();

HardwareAbstractionLayer hal = sistema.getHardware();
GlobalMemory memory = hal.getMemory();

//Lista os Processos da cpu e suas devidas Porcentagens 
List<OSProcess> procs = Arrays.asList(os.getProcesses(5, ProcessSort.CPU));

List<Object> dadosRecuperados = new ArrayList<Object>();

for (int i = 0; i < procs.size() && i < 5; i++) {
   OSProcess p = procs.get(i);
//   System.out.format(" %5d %5.1f %4.1f %9s %9s %s%n", p.getProcessID(),
//           100d * (p.getKernelTime() + p.getUserTime()) / p.getUpTime(),
//           100d * p.getResidentSetSize() / memory.getTotal(), FormatUtil.formatBytes(p.getVirtualSize()),
//           FormatUtil.formatBytes(p.getResidentSetSize()), p.getName());
//   
   	
  
   		dadosRecuperados.add(FormatUtil.formatBytes(p.getVirtualSize()));

   

   a+=dadosRecuperados;
   return a;
}
	return a;
		
}
	public static String processos5() {
		   String a="";
	 SystemInfo sistema = new SystemInfo();
OperatingSystem os = sistema.getOperatingSystem();

HardwareAbstractionLayer hal = sistema.getHardware();
GlobalMemory memory = hal.getMemory();

//Lista os Processos da cpu e suas devidas Porcentagens 
List<OSProcess> procs = Arrays.asList(os.getProcesses(5, ProcessSort.CPU));

List<Object> dadosRecuperados = new ArrayList<Object>();

for (int i = 0; i < procs.size() && i < 5; i++) {
OSProcess p = procs.get(i);
//System.out.format(" %5d %5.1f %4.1f %9s %9s %s%n", p.getProcessID(),
//        100d * (p.getKernelTime() + p.getUserTime()) / p.getUpTime(),
//        100d * p.getResidentSetSize() / memory.getTotal(), FormatUtil.formatBytes(p.getVirtualSize()),
//        FormatUtil.formatBytes(p.getResidentSetSize()), p.getName());
//
	

	
dadosRecuperados.add(FormatUtil.formatBytes(p.getResidentSetSize()));


a+=dadosRecuperados;
return a;
}
	return a;
		
}
	
	public static String processos6() {
		   String a="";
	 SystemInfo sistema = new SystemInfo();
OperatingSystem os = sistema.getOperatingSystem();

HardwareAbstractionLayer hal = sistema.getHardware();
GlobalMemory memory = hal.getMemory();

//Lista os Processos da cpu e suas devidas Porcentagens 
List<OSProcess> procs = Arrays.asList(os.getProcesses(5, ProcessSort.CPU));

List<Object> dadosRecuperados = new ArrayList<Object>();

for (int i = 0; i < procs.size() && i < 5; i++) {
OSProcess p = procs.get(i);
//System.out.format(" %5d %5.1f %4.1f %9s %9s %s%n", p.getProcessID(),
//     100d * (p.getKernelTime() + p.getUserTime()) / p.getUpTime(),
//     100d * p.getResidentSetSize() / memory.getTotal(), FormatUtil.formatBytes(p.getVirtualSize()),
//     FormatUtil.formatBytes(p.getResidentSetSize()), p.getName());
//
	


dadosRecuperados.add(p.getName());



a+=dadosRecuperados;
return a;
}
	return a;
		
}

	
}

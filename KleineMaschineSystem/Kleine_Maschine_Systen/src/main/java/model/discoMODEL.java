package model;

import java.io.File;
import java.text.DecimalFormat;

import oshi.SystemInfo;
import oshi.hardware.HWDiskStore;
import oshi.software.os.OSFileStore;
import oshi.software.os.OperatingSystem; 

public class discoMODEL {
	 private static SystemInfo systemInfo = new SystemInfo();
		public static OperatingSystem getOs() {
			return systemInfo.getOperatingSystem();
		}

		private static DecimalFormat decimalFormat = new DecimalFormat("###0.00");
		private static double singleDouble;
	    private static String[] arrayString;
	  
		public static String nomeDisco() {

			  SystemInfo sistema = new SystemInfo();
		       
		      String nomeDisco= "";
		        
		       HWDiskStore[] hwDisks = sistema.getHardware().getDiskStores();
		        
		        for(int i = 0; i < hwDisks.length; i ++){
		        	
		            HWDiskStore disk1 = hwDisks[i];
		            String nomedisco = disk1.getModel();
		            
		            nomeDisco+=nomedisco;
		          
	    }
		        return nomeDisco;
		        }
		
		public static String tamanhoDisco() {

			  SystemInfo sistema = new SystemInfo();
		       
		      String tamanho= "";
		        
		       HWDiskStore[] hwDisks = sistema.getHardware().getDiskStores();
		        
		        for(int i = 0; i < hwDisks.length; i ++){
		        	
		            HWDiskStore disk1 = hwDisks[i];
		            long tamanhoDisk = disk1.getSize();
		     
		            
		            tamanho+=tamanhoDisk;
		          
	    }
		        return tamanho;
		        }
		//--------------------------------Graficos
	public static float tamanhoDoDiscoFloat() {

			  SystemInfo sistema = new SystemInfo();
		       
			  float tamanhoDisk = 0;
		        
		       HWDiskStore[] hwDisks = sistema.getHardware().getDiskStores();
		        
		        for(int i = 0; i < hwDisks.length; i ++){
		        	
		            HWDiskStore disk1 = hwDisks[i];
		            tamanhoDisk = disk1.getSize();
		       
	    }
		      
				return tamanhoDisk;
		        }
    public static String[] getDisksUsedPercentageAsString() {
        OSFileStore[] fsArray = getOs().getFileSystem().getFileStores();
        arrayString = new String[fsArray.length];

        for (int count = 0; count < fsArray.length; count++) {
            if (fsArray[count].getTotalSpace() > 0) {
                singleDouble = ((double) (fsArray[count].getTotalSpace() - fsArray[count].getUsableSpace()) / (double) fsArray[count].getTotalSpace()) * 100.0;
                singleDouble = singleDouble < 0 ? 0 : singleDouble;
                arrayString[count] = decimalFormat.format(singleDouble);
            } else {
                arrayString[count] = decimalFormat.format(0);
            }
        }

        return arrayString;
    }
	
	}
	


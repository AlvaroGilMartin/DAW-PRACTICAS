package net.projecto.TransformaCsv_agil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App 
{
	 public static void main( String[] args )
	    {
	    	if (args.length < 1) {
				System.err.println("No has introducido los argumentos necesarios o son erroneos");
				return;
			}

			try {
				File f = new File(args[0]);
				Scanner file = new Scanner( f );

				while (file.hasNext()) {
					String linea = file.nextLine();
					String [] array = linea.split(",");
					for (int i=0; i < array.length ; i++) {
						System.out.println("[" + array[i] + "]");
					}
				}

				file.close();
			} catch (FileNotFoundException e) {
				System.err.println("ERROR: El fichero no se puede abrir");
			}
		}
	}

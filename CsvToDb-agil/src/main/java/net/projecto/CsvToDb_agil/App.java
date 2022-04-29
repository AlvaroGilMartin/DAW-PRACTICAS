package net.projecto.CsvToDb_agil;
import java.io.File;
public class App 
{
    public static void main( String[] args )
    {
    	File f = new File(args[0]);
    	Lectura leo = new Lectura();
    	leo.leer(f);
    }
}

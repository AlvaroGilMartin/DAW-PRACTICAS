package net.agil.ent.String_media;

public class App 
{
    public static void main( String[] args )
    {
     int [] array = {1,5,32,21,4,67,1};
     float media = 0.0f;
     for (int i = 0; i< array.length; i++) {
    	 media+=array[i];
    	 
     }
     media/=array.length;
     System.out.println("la media de todos los numeros es " + media);
     
    }
}

package programa;
import java.util.Scanner;

public class calculo {
public static void main(String[]args){
Scanner guardar= new Scanner(System.in);
float muestra[]=new float[100];
float ordenar[]=new float[100];
float mediana=0,media=0,varianza=0,suma=0,aux;
int c1,c2,nm,cal,va;
System.out.println("Programa que calcula");
System.out.print("\n Mediana, Media y Varianza");
System.out.print("\n Cuantas muestras vas a insertar:");
nm=guardar.nextInt();
for(c1=0;c1<nm;c1++){
System.out.print("\n Muestra "+(c1+1)+":");
muestra[c1]=guardar.nextFloat();
ordenar[c1]=muestra[c1];
suma=suma+muestra[c1];
}
for(c1=0;c1<nm;c1++)
{
for(c2=0;c2<(nm-1);c2++){
if(ordenar[c2]>ordenar[(c2+1)]){
aux=ordenar[c2];
ordenar[c2]=ordenar[c2+1];
ordenar[c2+1]=aux;
}
}
}
cal=nm%2;
if(cal==0){
va=nm/2;
mediana=(ordenar[va-1]+ordenar[va])/2;
}
if(cal==1){
va=nm/2;
mediana=ordenar[va];
}
System.out.print("\n La mediana es:"+mediana);
media=suma/nm;
System.out.print("\n La media es:"+media);
suma=0;
for(c1=0;c1<nm;c1++){
suma=suma+((muestra[c1]-media)*(muestra[c1]-media));
}
varianza=suma/(nm-1);
System.out.print("\n La Varianza es:"+varianza);
}
}

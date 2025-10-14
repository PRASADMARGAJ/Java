

public class SrtringMethods {
    public static void main(String[] args) {
String aven;
String str="Avengars";

System.out.println("Orignal String: " +str);

str.concat(" Assembaly");
System.out.println("After concat(String): " + str);

aven=str.concat(" Assmbaly ");
System.out.println("result:" + aven);





StringBuffer sb = new StringBuffer("Avenger");
System.out.println("String buffer :" + sb);

sb.append(" Assmbaly");
System.out.println("result :" +sb);
    }


}

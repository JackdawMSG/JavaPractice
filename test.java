import java.time.*;
public class test{ 
public static void main(String[]args){

  /*
  import java.util.Locale;
  import java.sql.Time;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
  int birthYear;
  int birthDay;
  int yearNow;
  int birthMonth;
  yearNow = 2024;
  Scanner birthDayScan = new Scanner(System.in);
  Scanner birthMonthScan = new Scanner(System.in);
  Scanner birthYearScanner = new Scanner(System.in);
  System.out.println("What is your birth day?");
    birthDay = birthDayScan.nextInt();
    System.out.println("What is your birth month?");
    birthMonth = birthMonthScan.nextInt();
    System.out.println("What is your birth year?");
    birthYear = birthYearScanner.nextInt();
   System.out.println("Your age is"+" "+age(birthYear, yearNow));

   String firstName = "Mustafa Kemal";
    String lastName = "Çakaloğlu";
    String backendLanguages="JS,TS,Python and C#";
    String tenetToliveby ="I treat every human endeavour I do as my main gig to become some who's unable to be outcompeted.";
    String resumeMy="And I'm a fresh web developmer graduate.";
 String txt1="Hello,\n Could you please introduce yourself?";
 String txt2="Nice to meet you! \nMy name is "+ firstName+" "+lastName+".";
 String txt3=resumeMy;
 String txt4="What's your skill-set,talents?";
 String txt5="Well,I'm specialized in Front-end designing and I also do practice copywriting.";
 String txt6="Quite wonderful, do you do Copywriting as a side huste or as a hobby?";
 String txt7=tenetToliveby;
 String txt8="Wow, I must say that's a strong statement as it gets.";
 String txt9="Thank you, are there any work related questions you want to ask?";
 String txt10="Oh yeah, are you also familiar with Back-End development? Our Back-End developers are inadequate.";
 String txt11="Sure, I started my coding journey with Back-End programming languages and softwares such as "+backendLanguages+". And I think you're wondering if I'm capable at Data structers?";
 String txt12="I must say, you're already the Developer that our company's searching for. You got the job, but if you're capable at Data structers as you claim, it'd be wonderful.";
 String txt13="My word is my bond ma'am.";
 System.out.println(txt1);
 System.out.println(txt2);
 System.out.println(txt3);
 System.out.println(txt4);
 System.out.println(txt5);
 System.out.println(txt6);
 System.out.println(txt7);
 System.out.println(txt8);
 System.out.println(txt9);
 System.out.println(txt10);
 System.out.println(txt11);
 System.out.println(txt12);
System.out.println(txt13);
Math.max(12,23);
Math.min(12, 23);
Math.sqrt(12);
Math.abs(-12.25);
int randomNum1 = (int)(Math.random()*654);
int randomNum2 = (int)(Math.random()*654);
System.out.println(randomNum1);
System.out.println(randomNum1>randomNum2);
if(randomNum1>randomNum2){
  System.out.println("randomNum1 is greater than randomNum2");
}else {
  System.out.println("randomNum1 is less than randomNum2");
}

/* 
static void testServer(String[]args){
  int mySayi=4;
  float myFloat = 4.25f;
  char myHarf= 'f';
  boolean myBoolean = false;
  String myDizi= "Ananı Sikim";
}
static void testserver2(String[]args){
 int x = 14, y = 15, z = 6;
int a,b,c;
a = b=c=80;
 System.out.println(x/y);
System.out.println(x+y);
System.out.println(z*y);
System.out.println(a+b+c);
byte myByteNums;
myByteNums = 127;
short myKisaNums;
myKisaNums= -32768;
int myIntNums;
myIntNums = 2147483647;
float myUcanNums;
myUcanNums = 5.75f;
double myCiftliSayi;
myCiftliSayi = 19.99;
boolean isJavaFun = true;
boolean isFishTasty = false;
String name1 = "Mustafa";
String lastName1="Çakaloğlu";




}
static void testTime(String[]args){
  int m,minutes,minutesPerHour;
  m=minutes=minutesPerHour=60;
}
}
*/
int saat = java.time.LocalTime.now().getHour();

int gun = java.time.LocalDate.now().getDayOfMonth();
String gunAdi = java.time.LocalDate.now().getDayOfWeek().toString();
Month ay = Month.from(LocalDate.now());    
if (saat>5&&saat<11){
  System.out.println("Günaydın, şaun saat:"+" "+saat+" ve tarih "+gun+"/"+ay);
} else if (saat>11&&saat<17){
  System.out.println("İyi günler, şuan saat:"+" "+saat+" ve tarih "+gun+"/"+ay);
} else if (saat>17&&saat<23){
  System.out.println("İyi akşamlar, şuan saat"+" "+saat+" ve tarih "+gun+"/"+ay);
} else {
System.out.println("İyi geceler, şuan saat:"+" "+saat+" ve tarih "+gun+"/"+ay);
}
switch(gunAdi){
  case "MONDAY":
  System.out.println("Bugün günlerden Pazartesi");
  break;
  case "TUESDAY":
  System.out.println("Bugün günlerden Salı");
  break;
  case "WEDNESDAY":
  System.out.println("Bugün günlerden Çarşamba");
  break;
  case "THURSDAY":
  System.out.println("Bugün günlerden Perşembe");
  break;
  case "FRIDAY":
  System.out.println("Bugün günlerden Cuma");
  break;
  case "SATURDAY":
  System.out.println("Bugün günlerden Cumartesi");
  break;
  case "SUNDAY":
  System.out.println("Bugün günlerden Pazar");
  break;
  default:
  System.out.println("Kıyamet bugündür ya ummeti Muhammed!");
}
/*
int sayi1= 230;
int sayi2= 120;
int fark = sayi1-sayi2;
while(fark<169){
   System.out.println(fark);
  fark++;
}
int i =3;
do{
  System.out.println(i);
   i++;
}while(i<20);

for(int k =1;k<=10;k++){
System.out.println("dış loop"+k);
for(int l = 60; l <= 62;l ++){
  System.out.println("iç loop"+l);
}
}
String[] arabalar = {"Volvo","Lamborghini","Bugatti","Koenigseg"};
for (String p : arabalar){
  System.out.println(p);
}
for(int t=1; t<10;t++){
  if (t==7){
  break;}
 
  System.out.println(t);
}
for(int r=6;r<12;r++){
  if(r>9){
    System.out.println(r);
    continue;
  }
}

int randomNumToto = (int)(Math.random()*89);
int randomNumToto2 = (int)(Math.random()*89);
int randomNumToto3 = (int)(Math.random()*89);
int randomNumToto4 = (int)(Math.random()*89);
int randomNumToto5 = (int)(Math.random()*89);
int randomNumToto6= (int)(Math.random()*89);
int randomNumToto7 = (int)(Math.random()*89);
//System.out.println(randomNumToto+" "+randomNumToto2+" "+randomNumToto3+" "+randomNumToto4+" "+randomNumToto5+" "+randomNumToto6+" "+randomNumToto7);
int[] myToto = {randomNumToto,randomNumToto2,randomNumToto3,randomNumToto4,randomNumToto5,randomNumToto6,randomNumToto7};

for(int t=0;t<myToto.length;t++){
  System.out.println(myToto[t]);
}
for(int y : myToto){
  System.out.println(y);
}
int [][] mydoubleLoop={{1,2,3,4},{5,6,7}};
System.out.println(mydoubleLoop[1][2]);
for(int f=0;f<mydoubleLoop.length;++f){
  for(int g=0;g<mydoubleLoop[f].length;++g){
    System.out.println(mydoubleLoop[f][g]);
  }
}
*/
}



}

class Second{
  public static void main(String[] args){
    int [][] numaralarim={{2,3,4,5,6},{4,5,6,7,8}};
    for (int i=0;i<numaralarim.length;i++){
      for(int j=0;j<numaralarim[i].length;j++){
        System.out.println(numaralarim[i][j]);
    
      }
    }

  }
}
class carsClass{
  public static void main(String[] args){
    //for loop example
    String[] cars = {"volvo", "BMW", "Ford","Toyota"};
    for(int i=0;i < cars.length;i++){
      System.out.println(cars[i]);
    }
//for-each loop example
   String[] gymsIveGone = {"Fitbulls","VipClass","TeamFitnessXL","Gelişim Fitness"};
   for ( String l: gymsIveGone){
    System.out.println(l);
   }

  }
}
class multidimensionalArrays{
  public static void main(String[] args){
    int[][] hoeCount={{1,2,3,4},{5,6,7,8}};
    System.out.println(hoeCount[1][2]);
  }
}
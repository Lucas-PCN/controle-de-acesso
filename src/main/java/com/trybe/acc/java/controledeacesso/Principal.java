package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Short> allCustomers = new ArrayList<Short>();
    
    int numberOption;
    String age;
    
    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostrar relatório");
      String chosenOption = scanner.next();
      numberOption = Integer.parseInt(chosenOption);
      
      if (numberOption != 1 && numberOption != 2) {
        System.out.println("Entre com uma opção válida");
      }
      
      if (numberOption == 1) {
        System.out.println("Entre com a idade:");
        age = scanner.next();
        Short ageNumber = Short.parseShort(age);
        
        allCustomers.add(ageNumber);
        
        if (ageNumber < 18) {
          System.out.println("Pessoa cliente menor de idade, catraca liberada!");
        } else if (ageNumber >= 18 && ageNumber <= 49) {
          System.out.println("Pessoa adulta, catraca liberada!");
        } else {
          System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
        }
      }
    } while (numberOption != 2);
    scanner.close();
    
    System.out.println("----- Quantidade -----");
    int underAges = 0;
    int adults = 0;
    int overFifty = 0;
    for (int index = 0; index < allCustomers.size(); index += 1) {
      if (allCustomers.get(index) < 18) {
        underAges += 1;
      } else if (allCustomers.get(index) >= 18 && allCustomers.get(index) < 50) {
        adults += 1;
      } else {
        overFifty += 1;
      }
    }
    
    System.out.println("menores: " + underAges);
    System.out.println("adultas: " + adults);
    System.out.println("a partir de 50: " + overFifty);
    
    DecimalFormatSymbols formatSeparator = new DecimalFormatSymbols(Locale.US);
    formatSeparator.setDecimalSeparator('.');
    DecimalFormat decimal = new DecimalFormat("0.0", formatSeparator);
    
    if (allCustomers.size() == 0) {
      System.out.println("----- Percentual -----");
      System.out.println("menores: 0%");
      System.out.println("adultas: 0%");
      System.out.println("a partir de 50: 0%");
      System.out.println("TOTAL: 0");
    }
    
    if (allCustomers.size() != 0) {
      float allCustomersFloat = (float) allCustomers.size();
      float underAgePercentage = (underAges / allCustomersFloat) * 100;
      float adultsPercentage = (adults / allCustomersFloat) * 100;
      float overFiftyPercentage = (overFifty / allCustomersFloat) * 100;

      System.out.println("----- Percentual -----");
      System.out.println("menores: " + decimal.format(underAgePercentage).toString() + "%");
      System.out.println("adultas: " + decimal.format(adultsPercentage).toString() + "%");
      System.out.println("a partir de 50: " + decimal.format(overFiftyPercentage).toString() + "%");
      System.out.println("TOTAL: " + allCustomers.size());
    }
  }
}

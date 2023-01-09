package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Short> allCustomers = new ArrayList<Short>();
    
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
        int age = scanner.next();
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
  }
}

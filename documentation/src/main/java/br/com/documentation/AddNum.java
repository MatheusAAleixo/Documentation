package br.com.documentation;

import java.io.*;

/**
* <b>Adicione Dois Numeros!</b>
* O programa AddNum implementa uma aplicacao que
* simplesmente adiciona dois numeros inteiros fornecidos e imprime
* a saida na tela.
* <p>
* <b>Observacao:</b> Dar comentarios adequados em seu programa torna mais
* amigavel e assume-se como um codigo de alta qualidade.
*
* @author  Matheus Aleixo
* @version 1.0
* @since   2022-06-15
*/
public class AddNum {
/**
   * Este metodo e usado para adicionar dois numeros inteiros. 
   * Isto e a forma mais simples de um metodo de classe, apenas para
   * mostra o uso de varias tags javadoc.
   * @param numA Este e o primeiro parametro do metodo addNum
   * @param numB Este e o segundo parametro do metodo addNum
   * @return int Retorna a soma de numA e numB.
   */
   public int addNum(int numA, int numB) {
      return numA + numB;
   }

   /**
   * Este e o metodo principal que utiliza o metodo addNum.
   * @exception IOException Utilizado em erros de entrada.
   * @see IOException
   */

   public static void main(String args[]) throws IOException {
      AddNum obj = new AddNum();
      int sum = obj.addNum(10, 20);

      System.out.println("Sum of 10 and 20 is :" + sum);
   }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversorbinario;

/**
 *
 * @author letic
 */
public class CalculosBinarios {
    public String calcularDecBit(String a){
       char[] n = a.toCharArray();
        int tamanho = a.length();
        double dec = 0;
        int i,ii = tamanho;
        for(i = 0 ; i < tamanho ; i++){
            if(n[i] == '1'){
                dec = dec + Math.pow(2, (ii-1));
            }
            ii--;
        }
        
        return Integer.toString((int) dec);
    }
    

}

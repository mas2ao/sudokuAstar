/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokua;

import java.util.HashMap;

/**
 *
 * @author shaolin
 */
public class SudokuA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Sudoku sk = new Sudoku();
        sk = sk.makeTabuleiro("benchmark/9x9puzzle/40-clue-3.sudoku");
        int max = sk.getOrdem()*sk.getOrdem();
        int maxCiclos = 100000;
        int maxPQ = 300000;
        int nSave = 1000;
        
        sk.resolve(sk, max, maxCiclos, maxPQ, nSave);
        
        
        
        
        
        
//        Sudoku.printSudoku(sk, max);
//        Sudoku.randTab(sk, max);
//        System.out.println("preenchido");
//        Sudoku.printSudoku(sk, max);
//        System.out.println("");
//        Sudoku.calcCUsto(sk, max);
//        System.out.println(Sudoku.ehSolucao(sk, max));
//        System.out.println("trocado");
//        Sudoku.troca(sk, filhos, max);
//        Sudoku.printSudoku(sk, max);
//        Sudoku.getMelhor(filhos, max);
//        Sudoku.fazFilhos(sk, filhos, max);
    }
    
}

package edu.lp2.criandopastas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Random;

/**
 *
 * @author cg3017311
 */
public class CriandoPastas {
    
    public static void main(String[] args) throws IOException {
        int N[] = new int[]{100, 1000, 10000, 50000, 100000};
        Random r = new Random();
        
        for (int i = 0; i <= N.length - 1; i++) {
            File pasta = new File(String.valueOf(N[i]));

            if (!pasta.exists()) {
                pasta.mkdir();
            }
                        
            int intervalo = N[i];
            int min = 0;
            int max = intervalo;
            
            intervalo = N[i];
            max = intervalo;
            
            for(int j = 1; j <= 10; j++){
                String caminhoPasta = pasta.getAbsolutePath();
                String nomeArquivo = "arq" + j + ".txt";
                String caminhoArquivo = (caminhoPasta + "/" + nomeArquivo);
                File arquivo = new File(caminhoArquivo);
                arquivo.createNewFile();
                
            System.out.println(arquivo.getName() + " foi criado com sucesso");
                BufferedWriter output = new BufferedWriter(new FileWriter(arquivo, true));

            for (int k = 0; k<N[i]; k++){
                    output.write(r.nextInt(max - min) + min + "\n");
                    
            }
            output.close();
            min += intervalo;
            max = min + intervalo;
            }
        }
    }
}

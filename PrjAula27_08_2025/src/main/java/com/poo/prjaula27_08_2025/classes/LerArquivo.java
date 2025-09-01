package com.poo.prjaula27_08_2025.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerArquivo {
    public List<String> ler(){
        List<String> dados = new ArrayList();
        try{
            File f = new File("c:\\Atividade27-08.txt");

            FileReader fr = new FileReader(f);

            BufferedReader br = new BufferedReader(fr);

            while(br.ready()){
                dados.add(br.readLine());
            }

            fr.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        return dados;
    }
}

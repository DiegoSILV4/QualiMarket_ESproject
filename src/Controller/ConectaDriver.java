/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

public class ConectaDriver {
    public static void CarregaDriver(){
               try { // Conecttando o driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver carregado com sucesso!");




       } catch (Exception ex) { // Erro driver não encontrado
            System.out.println("Driver nao pode ser carregado!");
        }

    }
       }

    


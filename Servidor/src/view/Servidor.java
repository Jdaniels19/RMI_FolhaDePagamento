package view;

import java.rmi.registry.*;
import controller.*;
import rmi.*;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;

public class Servidor {
    public static void main(String[] args){
        try{
            Registry conexao = LocateRegistry.createRegistry(1100);
            System.out.println("Servidor Iniciado! ");
            Interface servico = new InterfarceImplementação();
            ////////////////Ainda falta a implementação das funções da Interface////////////////


        }catch(AlreadyBoundException e){
            System.out.println("Erro na conexão:  "+e.getMessage());
        }catch(RemoteException e ){
            System.out.println("Erro na chamada so seviço:  "+e.getMessage());
        }
    }
}

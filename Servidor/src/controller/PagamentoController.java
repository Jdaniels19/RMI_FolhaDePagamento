package controller;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PagamentoController  extends UnicastRemoteObject implements PagamentoInterface {
    public PagamentoController()throws RemoteException{}
}

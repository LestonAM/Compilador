package Compilador;

import Compilador.Scanner_1.*;
import java.util.*;


public class First { //implementa os conjuntos first p/ alguns n.terminais

    static public final RecoverySet init = new RecoverySet();
    static public final RecoverySet classe = new RecoverySet();
    static public final RecoverySet criarvariavel = new RecoverySet();
    static public final RecoverySet condicao = new RecoverySet();
    static public final RecoverySet buscarswitch = new RecoverySet();
    static public final RecoverySet condicaoelse = new RecoverySet();
    static public final RecoverySet buscarfor = new RecoverySet();
    static public final RecoverySet buscarwhile = new RecoverySet();
    static public final RecoverySet buscardowhile = new RecoverySet();

    static {

        classe.add(new Integer(Scanner_1Constants.IF));
        classe.add(new Integer(Scanner_1Constants.SWITCH));
        classe.add(new Integer(Scanner_1Constants.FOR));
        classe.add(new Integer(Scanner_1Constants.WHILE));
        classe.add(new Integer(Scanner_1Constants.EOF));
        
        criarvariavel.add(new Integer(Scanner_1Constants.EOF));
        criarvariavel.add(new Integer(Scanner_1Constants.IF));
        criarvariavel.add(new Integer(Scanner_1Constants.SWITCH));
        criarvariavel.add(new Integer(Scanner_1Constants.FOR));
        criarvariavel.add(new Integer(Scanner_1Constants.WHILE));
       
        condicao.add(new Integer(Scanner_1Constants.IF));
        condicao.add(new Integer(Scanner_1Constants.SWITCH));
        condicao.add(new Integer(Scanner_1Constants.FOR));
        condicao.add(new Integer(Scanner_1Constants.WHILE));
        condicao.add(new Integer(Scanner_1Constants.EOF));
        
        condicaoelse.add(new Integer(Scanner_1Constants.IF));
        condicaoelse.add(new Integer(Scanner_1Constants.SWITCH));
        condicaoelse.add(new Integer(Scanner_1Constants.FOR));
        condicaoelse.add(new Integer(Scanner_1Constants.WHILE));
        condicaoelse.add(new Integer(Scanner_1Constants.EOF));
        
        buscarswitch.add(new Integer(Scanner_1Constants.IF));
        buscarswitch.add(new Integer(Scanner_1Constants.SWITCH));
        buscarswitch.add(new Integer(Scanner_1Constants.FOR));
        buscarswitch.add(new Integer(Scanner_1Constants.WHILE));
        buscarswitch.add(new Integer(Scanner_1Constants.EOF));
        
        buscarfor.add(new Integer(Scanner_1Constants.IF));
        buscarfor.add(new Integer(Scanner_1Constants.SWITCH));
        buscarfor.add(new Integer(Scanner_1Constants.FOR));
        buscarfor.add(new Integer(Scanner_1Constants.WHILE));
        buscarfor.add(new Integer(Scanner_1Constants.EOF));
        
        buscarwhile.add(new Integer(Scanner_1Constants.IF));
        buscarwhile.add(new Integer(Scanner_1Constants.SWITCH));
        buscarwhile.add(new Integer(Scanner_1Constants.FOR));
        buscarwhile.add(new Integer(Scanner_1Constants.WHILE));
        buscarwhile.add(new Integer(Scanner_1Constants.EOF));
        
        buscardowhile.add(new Integer(Scanner_1Constants.IF));
        buscardowhile.add(new Integer(Scanner_1Constants.SWITCH));
        buscardowhile.add(new Integer(Scanner_1Constants.FOR));
        buscardowhile.add(new Integer(Scanner_1Constants.WHILE));
        buscardowhile.add(new Integer(Scanner_1Constants.EOF));

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package novoselac;

//import novoselac.util.PocetniInsert;
import java.math.BigDecimal;
import novoselac.controller.ObradaPosjeta;
import novoselac.controller.ObradaUsluga;
import novoselac.model.Dijete;
import novoselac.model.Posjeta;
import novoselac.model.Usluga;
import novoselac.util.NovoselacException;

/**
 *
 * @author Administrator
 */
public class Start {

    public static void main(String[] args) {
//      new PocetniInsert(); nakon importa maknut inesert

        ObradaUsluga ou = new ObradaUsluga();

        Usluga usluga = new Usluga();
        usluga.setNaziv("Rođendaonica");
        usluga.setCijena(new BigDecimal(10));
        ou.setEntitet(usluga);
        try {
            ou.create();
        } catch (NovoselacException e) {
            System.out.println(e.getPoruka());
        }

//    for (Usluga u: ou.read()){
//        System.out.println(u.getNaziv());
//        
//   }
//        ObradaPosjeta uo = new ObradaPosjeta();
//
//        for (Posjeta p : uo.read()) {
//            System.out.println(p.getNapomena());
//            System.out.println(p.getDjelatnik().getIme());
//            for (Dijete d : p.getDjeca()) {
//                System.out.println("\t" + d.getIme());

//            }
//        }
    }
}

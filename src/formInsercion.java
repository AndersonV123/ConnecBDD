import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formInsercion {
    private JButton conectarALaBaseButton;
    public JPanel form1;
    private JTextField nombreTF;
    private JLabel nombre;
    private JLabel cedula;
    private JLabel calif;
    private JButton Insertarbutton;
    private JButton Borrarbutton;
    private JTextField cedulaTF;
    private JTextField calif1TF;
    private JTextField calif2TF;
    private JLabel calif2;


    public formInsercion() {
        conectarALaBaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conexionBDD miconexion=new conexionBDD();
                miconexion.conexionLocal("jdbc:mysql//localhost:3306/estudiantes","root","");
//                mensajeTxt.seText((miconexion.getMensaje));
            }
        });
        Borrarbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombre.setText("");
                cedula.setText("");
                calif.setText("");
                calif2.setText("");

            }
        });
        Insertarbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InsertarDatos insertardatos=new InsertarDatos();
                insertardatos.ingresoDatos(nombre.getText(), cedula.getText(),Integer.parseInt(calif.getText()),Integer.parseInt(calif2.getText()));
                nombre.getText();

            }
        });

    }
}

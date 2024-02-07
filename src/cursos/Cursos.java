
package cursos;

import javax.swing.JOptionPane;

public class Cursos {

  
    public static void main(String[] args) {
        
        int Curso_tomar;
        
        Curso_tomar=Integer.parseInt(JOptionPane.showInputDialog("Digita el Curso que deseas tomar"));
        
        
        switch(Curso_tomar)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"El Curso selecionado es Windows \n  su precio es de:  $150");
            break;
            case 2:
                JOptionPane.showMessageDialog(null,"El Curso selecionado es Excel \n su precio es de: $300");
            break;
            case 3:
                JOptionPane.showMessageDialog(null,"El Curso selecionado es Diseño\n su precio es de: $200");
            break;
            case 4:
                JOptionPane.showMessageDialog(null,"El Curso selecionado es Sistemas operativos \n su precio es de: $250");
            break;
            default:
                JOptionPane.showMessageDialog(null, "No has selecionado ningun Curso");
            
        }
        
        
    }
    
}

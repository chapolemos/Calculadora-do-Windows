
import javax.swing.*;
import java.awt.*;
import java.awt.font.*;
import java.awt.event.*;

public class Calculadora extends JFrame
{
    private JFrame calculadora;
    private JTextField calc_campo, calc_campo2;
    private Container calc_container, field_container;
    private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, bt_dot, bt_equals, bt_slash ,bt_asterisk,bt_minus,bt_plus, bt_limpar;
    private String display, display2;
    private double val1, val2, resultado;
    private int op;
    private boolean ordem = true; 
    
    
    public Calculadora()
    {
        //JTextFields calc_campos             
        Font font1 = new Font("Arial", Font.PLAIN, 10);
        Font font2 = new Font("Arial", Font.BOLD, 20);
        

        calc_campo = new JTextField ("",10);
        calc_campo.setHorizontalAlignment(JTextField.RIGHT);
        calc_campo.setEditable(false);
        calc_campo.setFont(font1);
         
        calc_campo2 = new JTextField ("0",10);
        calc_campo2.setHorizontalAlignment(JTextField.RIGHT);
        calc_campo2.setEditable(false);
        calc_campo2.setFont(font2);
        
        //JButtons
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 = new JButton("5");
        bt6 = new JButton("6");
        bt7 = new JButton("7");
        bt8 = new JButton("8");
        bt9 = new JButton("9");
        bt0 = new JButton("0");
        bt_dot = new JButton(".");
        bt_equals = new JButton("=");
        bt_slash = new JButton("/");
        bt_asterisk = new JButton("*");
        bt_minus = new JButton("-");
        bt_plus = new JButton("+");
        bt_limpar = new JButton("Limpar");    
        
        //ActionListener
        Calcular top = new Calcular();
        
        bt1.addActionListener(top);
        bt2.addActionListener(top);
        bt3.addActionListener(top);
        bt4.addActionListener(top);
        bt5.addActionListener(top);
        bt6.addActionListener(top);
        bt7.addActionListener(top);
        bt8.addActionListener(top);
        bt9.addActionListener(top);
        bt0.addActionListener(top);
        bt_dot.addActionListener(top);
        bt_slash.addActionListener(top);
        bt_asterisk.addActionListener(top);
        bt_minus.addActionListener(top);
        bt_plus.addActionListener(top);
        bt_limpar.addActionListener(top);
        
        //Container field_container
        field_container = new Container();
        field_container.setLayout(new GridLayout(2,1));
        
        field_container.add(calc_campo);
        field_container.add(calc_campo2);
        
        //Container calc_container
        calc_container = new Container();
        calc_container.setLayout(new GridLayout(4,4));
        
        calc_container.add(bt7);
        calc_container.add(bt8);
        calc_container.add(bt9);
        calc_container.add(bt_slash);
        calc_container.add(bt4);
        calc_container.add(bt5);
        calc_container.add(bt6);
        calc_container.add(bt_asterisk);
        calc_container.add(bt1);
        calc_container.add(bt2);
        calc_container.add(bt3);
        calc_container.add(bt_minus);
        calc_container.add(bt0);
        calc_container.add(bt_dot);
        calc_container.add(bt_equals);
        calc_container.add(bt_plus);
        
        
        
        //JFrame calculadora
        calculadora = new JFrame("Calculadora");
        calculadora.setLayout(new BorderLayout());
        
        calculadora.add(field_container, BorderLayout.NORTH);
        calculadora.add(calc_container, BorderLayout.CENTER);
        calculadora.add(bt_limpar, BorderLayout.SOUTH);
        
        calculadora.setSize(300,200);
        calculadora.setVisible(true);
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private class Calcular implements ActionListener
    {
        String display = calc_campo.getText();
        String display2 = ("");
        double val1, val2, resultado = 0;
        int op = 0;
        public void actionPerformed(ActionEvent e){
            
                
                
                if(e.getSource()==bt0)
                {
                    if(ordem == true){
                        calc_campo2.setText("");
                        ordem = false;
                    }
                    display = calc_campo.getText();
                    calc_campo.setText(display + "0");
                    
                    
                    
                    display2 = calc_campo2.getText();
                    calc_campo2.setText(display2 + "0");
                }
                if(e.getSource()==bt1)
                {
                    if(ordem == true){
                        calc_campo2.setText("");
                        ordem = false;
                    }
                    display = calc_campo.getText();
                    calc_campo.setText(display + "1");
                    
                    
                    display2 = calc_campo2.getText();
                    calc_campo2.setText(display2 + "1");
                }
                 if(e.getSource()==bt2)
                {
                    if(ordem == true){
                        calc_campo2.setText("");
                        ordem = false;
                    }
                    display = calc_campo.getText();
                    calc_campo.setText(display + "2");
                    
                    
                    display2 = calc_campo2.getText();
                    calc_campo2.setText(display2 + "2");
                }
                 if(e.getSource()==bt3)
                {
                    if(ordem == true){
                        calc_campo2.setText("");
                        ordem = false;
                    }
                    display = calc_campo.getText();
                    calc_campo.setText(display + "3");
                    
                    
                    display2 = calc_campo2.getText();
                    calc_campo2.setText(display2 + "3");
                }
                 if(e.getSource()==bt4)
                {
                    if(ordem == true){
                        calc_campo2.setText("");
                        ordem = false;
                    }
                    display = calc_campo.getText();
                    calc_campo.setText(display + "4");
                    
                    
                    display2 = calc_campo2.getText();
                    calc_campo2.setText(display2 + "4");
                }
                 if(e.getSource()==bt5)
                {
                    display = calc_campo.getText();
                    calc_campo.setText(display + "5");
                    
                    
                    display2 = calc_campo2.getText();
                    calc_campo2.setText(display2 + "5");
                }
                 if(e.getSource()==bt6)
                {
                    if(ordem == true){
                        calc_campo2.setText("");
                        ordem = false;
                    }
                    display = calc_campo.getText();
                    calc_campo.setText(display + "6");
                    

                    display2 = calc_campo2.getText();
                    calc_campo2.setText(display2 + "6");
                }
                 if(e.getSource()==bt7)
                {
                    if(ordem == true){
                        calc_campo2.setText("");
                        ordem = false;
                    }
                    display = calc_campo.getText();
                    calc_campo.setText(display + "7");
                    
                    
                    display2 = calc_campo2.getText();
                    calc_campo2.setText(display2 + "7");
                }
                 if(e.getSource()==bt8)
                {
                    if(ordem == true){
                        calc_campo2.setText("");
                        ordem = false;
                    }
                    display = calc_campo.getText();
                    calc_campo.setText(display + "8");
                    
                    display2 = calc_campo2.getText();
                    calc_campo2.setText(display2 + "8");
                }
                 if(e.getSource()==bt9)
                {
                    if(ordem == true){
                        calc_campo2.setText("");
                        ordem = false;
                    }
                    display  = calc_campo.getText();
                    calc_campo.setText(display + "9");
                    
                    display2 = calc_campo2.getText();
                    calc_campo2.setText(display2 + "9");
                }
                if(e.getSource()==bt_dot)
                {
                    if(ordem == true){
                        calc_campo2.setText("");
                        ordem = false;
                    }
                    display = calc_campo.getText();
                    calc_campo.setText(display + ".");
                    

                    display2 = calc_campo2.getText();
                    calc_campo2.setText(display2 + ".");
                }
                if(e.getSource()==bt_slash)
                {
                   display = calc_campo.getText();
                   calc_campo.setText(display + "/");
                   op = 1;
                   
                   
                   val1 = Double.parseDouble(calc_campo2.getText());
                   calc_campo2.setText("");
                }
                if(e.getSource()==bt_asterisk)
                {
                   display = calc_campo.getText();
                   calc_campo.setText(display + "*");
                   op = 2;
                   calc_campo2.setText("");
                }
                if(e.getSource()==bt_minus)
                {
                   display = calc_campo.getText();
                   calc_campo.setText(display + "-");
                   op = 3;
                   calc_campo2.setText("");
                }
                if(e.getSource()==bt_plus)
                {
                   display = calc_campo.getText();
                   calc_campo.setText(display + "+");
                   op = 4;
                   calc_campo2.setText("");
                }
                //Equal
                if(e.getSource()==bt_equals)
                {
                    if(op == 1){
                        val2 = Double.parseDouble(calc_campo2.getText());
                        
                        resultado = val1/val2;
                        calc_campo2.setText(String.valueOf(resultado));
                    }
                    if(op == 2){
                        val2 = Double.parseDouble(calc_campo2.getText());
                        
                        resultado = val1*val2;
                        calc_campo2.setText(String.valueOf(resultado));                   
                    }
                    if(op == 3){
                        val2 = Double.parseDouble(calc_campo2.getText());
                        
                        resultado = val1-val2;
                        calc_campo2.setText(String.valueOf(resultado));                   
                    }
                    if(op == 4){
                        val2 = Double.parseDouble(calc_campo2.getText());
                        
                       resultado = val1+val2;
                       calc_campo2.setText(String.valueOf(resultado)); 
                    }
                }
                if(e.getSource()== bt_limpar)
                {
                    calc_campo.setText("");
                    calc_campo2.setText("0");
                    op = 0;
                    val1 = 0;
                    val2 = 0;
                    ordem = true;
                }
                
            }
  }
}
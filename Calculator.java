import java.awt.*;
 import java.awt.event.*;
 class CalFrame extends Frame implements ActionListener {
    Button digit []= new Button[10];
    Button opPlus =new Button("+");
    Button opEqual =new Button("=");
    TextField display = new TextField("0");
      double operand1;
      double operand2;
      char operator;
      int flag=0;
     CalFrame() {
      super("Calculator");
      Panel buttonPanel = new Panel(new GridLayout(3,4,20,20));
      buttonPanel.setBackground(Color.black);
      setLayout(new BorderLayout(50,50));
      add(display,BorderLayout.NORTH);
      add(buttonPanel, BorderLayout.CENTER);
      for(int i=0; i<10; i++){
       {
        digit[i]=new Button(""+i);
         buttonPanel.add(digit[i]);
        digit[i].addActionListener(this);
      }
        buttonPanel.add(opPlus);
        buttonPanel.add(opEqual); 
        opPlus.addActionListener(this);
        opEqual.addActionListener(this);
        setBackground(Color.red);
        setSize(300,300);
        setVisible(true);
       }
       public void actionPerformed(ActionEvent e)
     {
        String cmd =e.getActionCommand();
        String  displayString;
       if(cmd.equals("+"))
          {
           displayString = display.getText();
            operand1 = Double.parseDouble(displayString);
           operator ='+';
            flag = 0;
          return ;
          }
       if(cmd.equals("="))
      { 
       displayString = display.getText();
       operand2 = Double.parseDouble(displayString);
      flag =0;
      switch(operator)
        {
        case'+':operand1+=operand2;
        display.setText(""+operand1);
         break;
       }
        return ;
   }
   if(flag == 0 )
   {
    display.setText(" ");
    flag=1;
    }
    displayString = display.getText();
    display.setText(displayString+cmd);
    }
   }
  public class Calculator {
    public static void main(String ar[]) 
  {
    CalFrame cf =new CalFrame();
  }
}


import java.awt.*;
import java.util.*;
///import javax.script.ScriptEngineManager;
//import javax.script.ScriptEngine;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class main extends JFrame implements ActionListener,KeyListener {

	//m=new main();
	//f=new JFrame("Scientific Calculator");
	//private JTextField t;
	JTextField t = new JTextField(80);
	private JFrame f;
	private JPanel p;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,bm,bs,bd,ba,bl,be,bsq,bp,bb,bc,btan,bsin,bcos;
	 
	public main()
	 {   //t.new JTextField(30);
		Font font=new Font("Serif", Font.PLAIN, 40);
		 Font font1=new Font("Serif", Font.PLAIN, 20); 
		 f=new JFrame("Evaluator");
		 p=new JPanel();
		 
		 f.setResizable(false);
		 f.setVisible(true);
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		 //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		 //double width = screenSize.getWidth();
		 //double height = screenSize.getHeight();
		 //int w=width/2;
		 //int h=height/2;
		 f.setSize(400, 500);
		 f.setLocationRelativeTo(null);
		 f.setBackground(Color.WHITE);
		 p.setLayout(new GridLayout(5,5));
		 ///////////////////
		 bl=new JButton("log");
		 be=new JButton("e");
		 bsq=new JButton("sqrt");
		 bp=new JButton("^");
		 btan=new JButton("tan");
		 bcos=new JButton("cos");
		 bsin=new JButton("sin");
		 bc=new JButton("Clear");
		 bb=new JButton("<-");
		 ////////////////////
		 b1=new JButton("7");
	     b2=new JButton("8");
	     b3=new JButton("9");
	     b4=new JButton("4");
	     b5=new JButton("5");
	     b6=new JButton("6");
	     b7=new JButton("1");
	     b8=new JButton("2");
	     b9=new JButton("3");
	     b10=new JButton("0"); 
	     b11=new JButton(".");
	     b12= new JButton("=");
	     bd=new JButton("/");
	     bm=new JButton("X");
	     bs=new JButton("-");
	     ba=new JButton("+");
	     //////////////////////////
	     bl.setFont(font1);
	     be.setFont(font1);
	     btan.setFont(font1);
	     bsin.setFont(font1);
	     bcos.setFont(font1);
	     bsq.setFont(font1);
	     bp.setFont(font1);
	     bc.setFont(font1);
	     bb.setFont(font1);
	     
	     
	     ///////////////////
	     b1.setFont(font1);
	     b2.setFont(font1);
	     b3.setFont(font1);
	     b4.setFont(font1);
	     b5.setFont(font1);
	     b6.setFont(font1);
	     b7.setFont(font1);
	     b8.setFont(font1);
	     b9.setFont(font1);
	     b10.setFont(font1);
	     b11.setFont(font1);
	     b12.setFont(font1);
	     bd.setFont(font1);
	     bs.setFont(font1);
	     bm.setFont(font1);
	     ba.setFont(font1);
         /////////////////////////////////////
	     bl.setBackground(Color.WHITE);
         bl.setForeground(Color.gray);
         bb.setBackground(Color.WHITE);
         bb.setForeground(Color.gray);
         bc.setBackground(Color.WHITE);
         bc.setForeground(Color.gray);
         btan.setBackground(Color.WHITE);
         btan.setForeground(Color.gray);
         bsin.setBackground(Color.WHITE);
         bsin.setForeground(Color.gray);
         bcos.setBackground(Color.WHITE);
         bcos.setForeground(Color.gray);
         be.setBackground(Color.WHITE);
         be.setForeground(Color.gray);
         bsq.setBackground(Color.WHITE);
         bsq.setForeground(Color.gray);
         bp.setBackground(Color.WHITE);
         bp.setForeground(Color.gray);
         ////////////////////////////////
	     b1.setBackground(Color.WHITE);
         b1.setForeground(Color.gray);
         b2.setBackground(Color.WHITE);
         b2.setForeground(Color.gray);
         b3.setBackground(Color.WHITE);
         b3.setForeground(Color.gray);
         b4.setBackground(Color.WHITE);
         b4.setForeground(Color.gray);
         b5.setBackground(Color.WHITE);
         b5.setForeground(Color.gray);
         b6.setBackground(Color.WHITE);
         b6.setForeground(Color.gray);
         b7.setBackground(Color.WHITE);
         b7.setForeground(Color.gray);
         b8.setBackground(Color.WHITE);
         b8.setForeground(Color.gray);
         b9.setBackground(Color.WHITE);
         b9.setForeground(Color.gray);
         b10.setBackground(Color.WHITE);
         b10.setForeground(Color.gray);
         b11.setBackground(Color.WHITE);
         b11.setForeground(Color.gray);
         b12.setBackground(new Color(255,192,63));
         b12.setForeground(Color.white);
         bm.setBackground(Color.WHITE);
         bm.setForeground(Color.gray);
         bs.setBackground(Color.WHITE);
         bs.setForeground(Color.gray);
         ba.setBackground(Color.WHITE);
         ba.setForeground(Color.gray);
         bd.setBackground(Color.WHITE);
         bd.setForeground(Color.gray);
         b1.addActionListener(this);         
         b2.addActionListener(this);         
         b3.addActionListener(this);         
         b4.addActionListener(this);         
         b5.addActionListener(this);         
         b6.addActionListener(this);         
         b7.addActionListener(this);         
         b8.addActionListener(this);         
         b9.addActionListener(this);         
         b10.addActionListener(this);         
         b11.addActionListener(this);
         b12.addActionListener(this);
         ba.addActionListener(this);
         bm.addActionListener(this);
         bd.addActionListener(this);
         bs.addActionListener(this);
         ///////////////////////////
         bl.addActionListener(this);
         bp.addActionListener(this);
         bsq.addActionListener(this);
         btan.addActionListener(this);
         bcos.addActionListener(this);
         bsin.addActionListener(this);
         bc.addActionListener(this);
         bb.addActionListener(this);
         be.addActionListener(this);
         //////////////////////////// 
         // b12.setBackground(new Color(255,192,63));
	     //b12.setForeground(Color.WHITE);
	     //p.add(t,"NORTH");
	     //p.setLayout(new BorderLayout());
	     p.add(bsq);// square root
         p.add(bl);//log
         p.add(be);// exponential
         p.add(bp);// power
	     p.add(bb);// back space
         p.add(b1);//7
		 p.add(b2);//8
		 p.add(b3);//9
		 p.add(ba);//+
		 p.add(bsin);//sin
		 p.add(b4);//4
		 p.add(b5);//5
		 p.add(b6);//6
		 p.add(bs);//-
		 p.add(bcos);//cos
		 p.add(b7);//1
		 p.add(b8);//2
		 p.add(b9);//3
		 p.add(bm);//x
		 p.add(btan);// tan
		 p.add(b10);//0
	     p.add(b11);//"."
		 p.add(b12);//=
	     p.add(bd);// "/"
		 p.add(bc);// clear
	     t.setFont(font);
	     t.setHorizontalAlignment(JTextField.CENTER);
		 f.setLayout(new BorderLayout());
	    // f.add(p,BorderLayout.CENTER);
	     //f.setLayout(new BorderLayout());
	     f.add(p, GridLayout(5,5));
	     //f.add(b11, BorderLayout.SOUTH);
	     f.add(t, BorderLayout.NORTH);
         // keyListener
	     
	     t.setHorizontalAlignment(SwingConstants.RIGHT);
	     t.setPreferredSize(new Dimension(300, 80));
	     t.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent e) {
	           char c = e.getKeyChar();
	           if (!(Character.isDigit(c) || c=='+'|| c=='-'|| c=='.'|| c=='^'|| c=='/'||c=='('||c==')'))
	        		   
	           {
	                e.consume();
	            System.out.println("typed"); 
	           }
	         
	         }
	       		});
	 }
	 int flag=0;
	String t1="tan";
	String s1="sin";
	String c2="cos";
	 public void actionPerformed(ActionEvent e)
	     {
		
			if (e.getSource()==b12)
   	 		{
   		 //Evaluation
				flag=1;
				String testString = t.getText();
				String e1=convertToPostfix(testString);
				// System.out.println(e1);
				String e2=e1.substring(1);
				/*if (e2.contains(t1))
				{
					System.out.println("in tan func");
					int i=e2.indexOf(t1.charAt(0));
				    String sub=e2.substring(i,indexOf(" "));
				   System.out.println(sub);
				}
				
				if (e2.contains(s1))
				{
					System.out.println("in sin func");
					int i=e2.indexOf(s1.charAt(0));
				    String sub=e2.substring(i,indexOf(" "));
				   System.out.println(sub);
				}if (e2.contains(t1))
				{
					System.out.println("in tan func");
					int i=e2.indexOf(t1.charAt(0));
				    String sub=e2.substring(i,indexOf(" "));
				   System.out.println(sub);
				}
				*/
				System.out.println(e2);
				
				float ans=func(e2);
				if (ans-(int)ans==0)
				{
					t.setText((int)ans+"");
					System.out.println("ans "+(int)ans);
				}
				else
				{
				System.out.println("ans "+ans);
				t.setText(ans+"");
				}
   	 		
   	 		
   	 		}
        

		     if (e.getSource()==b1)
        	 {
        		if (flag==1)
        		{
        			t.setText("7");
        		   flag=0;
        		}
        		else
        		{
        			t.setText(t.getText()+"7");
        		}
        	 }
         
            
		     if (e.getSource()==b2)
        	 {
        		 if (flag==1)
         		{
         			t.setText("8");
         		   flag=0;
         		}
         		else
         		{
         			t.setText(t.getText()+"8");
         		}
        	 }
        	 if (e.getSource()==b3)
        	 {
        		 if (flag==1)
         		{
         			t.setText("9");
         		   flag=0;
         		}
         		else
         		{
         			t.setText(t.getText()+"9");
         		}
        	 }
        	 if (e.getSource()==b4)
        	 {
        		 if (flag==1)
         		{
         			t.setText("4");
         		    flag=0;
         		}
         		else
         		{
         			t.setText(t.getText()+"4");
         		}
        	 }
        	 if (e.getSource()==b5)
        	 {
        		 if (flag==1)
         		{
         			t.setText("5");
         		   flag=0;
         		}
         		else
         		{
         			t.setText(t.getText()+"5");
         		}
        	 }
        	 if (e.getSource()==b6)
        	 {
        		 if (flag==1)
         		{
         			t.setText("6");
         		    flag=0;
         		}
         		else
         		{
         			t.setText(t.getText()+"6");
         		}
        	 }
        	 if (e.getSource()==b7)
        	 {
        		 if (flag==1)
         		{
         			t.setText("1");
         		    flag=0;
         		}
         		else
         		{
         			t.setText(t.getText()+"1");
         		}
        	 }
        	 if (e.getSource()==b8)
        	 {
        		 if (flag==1)
         		{
         			t.setText("2");
         			flag=0;
         		}
         		else
         		{
         			t.setText(t.getText()+"2");
         		}
        	 }
        	 if (e.getSource()==b9)
        	 {
        		 if (flag==1)
          		{
          			t.setText("3");
          			flag=0;
          		}
          		else
          		{
          			t.setText(t.getText()+"3");
          		}
        	 }
        	 if (e.getSource()==b10)
        	 {
        		 if (flag==1)
          		{
          			t.setText("0");
          			flag=0;
          		}
          		else
          		{
          			t.setText(t.getText()+"0");
          		}
        	 }    	 
        	 if (e.getSource()==b11)
        	 {
        		 String s=t.getText();
        		 boolean f=false;
        		 for (int i=0;i<s.length();i++)
        		 {
        		 char ch=s.charAt(i);
        		 if (ch=='.')
        		 {
        		   f=true;
        			 break;
        		 }
             }
        		if (f==false)
        		{
        			
        		t.setText(t.getText()+".");
        		}
        	}    	 
            
        	 if (e.getSource()==ba)
        	 {
        		 String s=t.getText(); 
        		 if (s.charAt(s.length()-1)=='x' || s.charAt(s.length()-1)=='-' ||s.charAt(s.length()-1)=='/' ||s.charAt(s.length()-1)=='^' ||s.charAt(s.length()-1)=='e')
        			 
        		 {
        			String u= (t.getText()).replace(s.charAt(s.length()-1),'+');
        			t.setText(u); 
        		 }
        		 	
        		 if (s.charAt(s.length()-1)=='n' || s.charAt(s.length()-1)=='g' )
        			 
        		 { String u= s.substring(0,s.length()-3);
        		   t.setText(u+"+"); 
        		 }
         		 if (s.charAt(s.length()-1)=='t'  )
        			 
        		 { String u= s.substring(0,s.length()-4);
        		   t.setText(u+"+"); 
        		 }
  
        		 if ((t.getText()).charAt(t.getText().length()-1)=='+')
        		 {
        			 return;
        		 }
        		 else 
        	     {
        			 t.setText(t.getText()+"+");
        	     }
        	 }
        	 
        	 if (e.getSource()==bs)
        	 {
        		 String s=t.getText(); 
        		 if (s.charAt(s.length()-1)=='x' || s.charAt(s.length()-1)=='+' ||s.charAt(s.length()-1)=='/' ||s.charAt(s.length()-1)=='^' ||s.charAt(s.length()-1)=='e')
        			 
        		 {
        			String u= (t.getText()).replace(s.charAt(s.length()-1),'-');
        			t.setText(u); 
        		 }
        		 	
        		 if (s.charAt(s.length()-1)=='n' || s.charAt(s.length()-1)=='g' )
        			 
        		 { String u= s.substring(0,s.length()-3);
        		   t.setText(u+"-"); 
        		 }
         		 if (s.charAt(s.length()-1)=='t'  )
        			 
        		 { String u= s.substring(0,s.length()-4);
        		   t.setText(u+"-"); 
        		 }
        		 	
        		 if ((t.getText()).charAt(t.getText().length()-1)=='-')
        		 {
        			 return;
        		 }
        		 else 
        	     {
        			 t.setText(t.getText()+"-");
        	     }
        	 }
        	
        	 if (e.getSource()==bd)
        	 {
        		 String s=t.getText(); 
        		 if (s.charAt(s.length()-1)=='x' || s.charAt(s.length()-1)=='-' ||s.charAt(s.length()-1)=='+' ||s.charAt(s.length()-1)=='^' ||s.charAt(s.length()-1)=='e')
        			 
        		 {
        			String u= (t.getText()).replace(s.charAt(s.length()-1),'/');
        			t.setText(u); 
        		 }
        		 	
        		 if (s.charAt(s.length()-1)=='n' || s.charAt(s.length()-1)=='g' )
        			 
        		 { String u= s.substring(0,s.length()-3);
        		   t.setText(u+"/"); 
        		 }
         		 if (s.charAt(s.length()-1)=='t'  )
        			 
        		 { String u= s.substring(0,s.length()-4);
        		   t.setText(u+"/"); 
        		 }
        		 	
        		 if ((t.getText()).charAt(t.getText().length()-1)=='/')
        		 {
        			 return;
        		 }
        		 else 
        	     {
        			 t.setText(t.getText()+"/");
        	     }
        	 }
        	
        	 if (e.getSource()==bm)
        	 {
        		 String s=t.getText(); 
        		 if (s.charAt(s.length()-1)=='+' || s.charAt(s.length()-1)=='-' ||s.charAt(s.length()-1)=='/' ||s.charAt(s.length()-1)=='^' ||s.charAt(s.length()-1)=='e')
        			 
        		 {
        			String u= (t.getText()).replace(s.charAt(s.length()-1),'x');
        			t.setText(u); 
        		 }
        		 	
        		 if (s.charAt(s.length()-1)=='n' || s.charAt(s.length()-1)=='g' )
        			 
        		 { String u= s.substring(0,s.length()-3);
        		   t.setText(u+"x"); 
        		 }
         		 if (s.charAt(s.length()-1)=='t'  )
        			 
        		 { String u= s.substring(0,s.length()-4);
        		   t.setText(u+"x"); 
        		 }        		 	
        		 if ((t.getText()).charAt(t.getText().length()-1)=='x')
        		 {
        			 return;
        		 }
        		 else 
        	     {
        			 t.setText(t.getText()+"x");
        	     }
        	}
        	 
        	 if (e.getSource()==bl)
        	  { 
        		 String s=t.getText();
        
        		 if (flag==1)
        			{
        				t.setText("log");
        				flag=0;
        			}
        		 else
        			{
        				t.setText(t.getText()+"log");
        			}
        	  }
        	  	
        	 if (e.getSource()==btan)
       	  {
       		if (flag==1)
       			{
       				t.setText("tan");
       				flag=0;
       			}
       		else
       			{
       				t.setText(t.getText()+"tan");
       			}
       	  }
        	 if (e.getSource()==bsin)
       	  {
       		if (flag==1)
       			{
       				t.setText("sin");
       				flag=0;
       			}
       		else
       			{
       				t.setText(t.getText()+"sin");
       			}
       	  }
        	 if (e.getSource()==bcos)
       	  {
       		if (flag==1)
       			{
       				t.setText("cos");
       				flag=0;
       			}
       		else
       			{
       				t.setText(t.getText()+"cos");
       			}
       	  }
        	 if (e.getSource()==bp)
       	  {
       		if (flag==1)
       			{
       				t.setText("^");
       				flag=0;
       			}
       		else
       			{
       				t.setText(t.getText()+"^");
       			}
       	  }
        	 if (e.getSource()==bsq)
       	  {
       		if (flag==1)
       			{
       				t.setText("sqrt");
       				flag=0;
       			}
       		else
       			{
       				t.setText(t.getText()+"sqrt");
       			}
       	  }
        	 if (e.getSource()==be)
       	  {
       		if (flag==1)
       			{
       				t.setText("e");
       				flag=0;
       			}
       		else
       			{
       				t.setText(t.getText()+"e");
       			}
       	  }
        	 if (e.getSource()==bc)
        	 	{
        		
        		 t.setText("");
        		}
        	
        	 	if (e.getSource()==bb)
       	  		{
        	 		if (t.getText().isEmpty())
        	 		{
        	 			return;
        	 		}
        	 		else
        	 		{
        	 			String s=t.getText();
        	 			if(s.charAt(s.length()-1)=='n')
        	 				
        	 			{
        	 				String s1=t.getText().substring(0,t.getText().length()-3);
            	 			t.setText(s1);
        	 			}
        	 			else if (s.charAt(s.length()-1)=='t')
        	 			{
        	 				String s1=t.getText().substring(0,t.getText().length()-4);
            	 			t.setText(s1);
        	 				
        	 			}
        	 			else if (s.charAt(s.length()-1)=='g')
        	 				{
        	 				String s1=t.getText().substring(0,t.getText().length()-3);
        	 				t.setText(s1);
        	 				}
        	 			else
        	 			{
        	 				String s1=t.getText().substring(0,t.getText().length()-1);
        	 				t.setText(s1);
        	 			}
        	 		
        	 		}
       	  		}
       	
        	      
	     }
         
private int indexOf(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

/*public void KeyPressed(KeyEvent e)
 {
	 char c=e.getKeyChar();
	 if (c!='0'||c!='1'||c!='2'||c!='3'||c!='4'||c!='5'||c!='6'||c!='7'||c!='8'||c!='9'||c!='.'||c!='+'||c!='-'||c!='*'||c!='/'||c!='=')
	 {
		return; 
	 }
	 else 
	 {
		 t.setText(t.getText()+c);
	 }
 }*/
	
	private Object GridLayout(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

//TRying////////////////////////////////////////////
	   private boolean isOperator(char c) { // Tell whether c is an operator.

		     return c == '+'  ||  c == '-'  ||  c == 'x'  ||  c == '/'  ||  c == '^'
		           || c=='(' || c==')';
		   
		   }//end isOperator

		 

		   private boolean isSpace(char c) {  // Tell whether c is a space.

		     return (c == ' ');
		   
		   }//end isSpace


		   private boolean lowerPrecedence(char op1, char op2) {
		      // Tell whether op1 has lower precedence than op2, where op1 is an
		      // operator on the left and op2 is an operator on the right.
		      // op1 and op2 are assumed to be operator characters (+,-,*,/,^).
		      
		      switch (op1) {

		         case '+':
		         case '-':
		            return !(op2=='+' || op2=='-') ;

		         case 'x':
		         case '/':
		            return op2=='^' || op2=='(';

		         case '^':
		            return op2=='(';

		         case '(': return true;

		         default:  // (shouldn't happen)
		            return false;
		      }
		 
		   } // end lowerPrecedence


		// Method to convert infix to postfix:

		   public String convertToPostfix(String infix) {
		      // Return a postfix representation of the expression in infix.

		     Stack operatorStack = new Stack();  // the stack of operators

		     char c;       // the first character of a token
		   
		     StringTokenizer parser = new StringTokenizer(infix,"+-x/^() ",true);
		                   // StringTokenizer for the input string

		     StringBuffer postfix = new StringBuffer(infix.length());  // result
		 
		     // Process the tokens.
		        while (parser.hasMoreTokens()) {     
		                                            
		           String token = parser.nextToken();          // get the next token
		                                                             // and let c be
		           c = token.charAt(0);         // the first character of this token
		   
		           if ( (token.length() == 1) && isOperator(c) ) {    // if token is
		                                                             //  an operator
		     
		              while (!operatorStack.empty() &&
		                  !lowerPrecedence(((String)operatorStack.peek()).charAt(0), c))
		                 // (Operator on the stack does not have lower precedence, so
		                 //  it goes before this one.)
		             
		                 postfix.append(" ").append((String)operatorStack.pop());

		              if (c==')') {
		                 // Output the remaining operators in the parenthesized part.
		                    String operator = (String)operatorStack.pop();
		                    while (operator.charAt(0)!='(') {
		                       postfix.append(" ").append(operator);
		                       operator = (String)operatorStack.pop();  
		                    }
		              }
		              else
		                 operatorStack.push(token);// Push this operator onto the stack.
		   
		           }
		           else if ( (token.length() == 1) && isSpace(c) ) {    // else if
		                                                        // token was a space
		             ;                                                  // ignore it
		           }
		           else {  // (it is an operand)
		             postfix.append(" ").append(token);  // output the operand
		           }//end if
		 
		         }// end while for tokens
		 
		     // Output the remaining operators on the stack.
		        while (!operatorStack.empty())
		           postfix.append(" ").append((String)operatorStack.pop());
		     
		     // Return the result.

		        return postfix.toString();


		   }//end convertToPostfix
////////////////////////////////////////////////////////////////
	////////	   PostfixEvaluation   //////////////////////////
		   public  float func(String s)
		   {
		   	//System.out.println("Im here");
		   Stack<Float> operand = new Stack<Float>();
		   String[] ar=s.split(" ");
		   int l=ar.length;
		   //System.out.println(l);
		   for (int i=0;i<l;i++)
		   {
		   	System.out.println(ar[i]);	
		   }

		   for (int i=0;i<l;i++)
		   {
		   	
		   	 
		   	 if (ar[i].charAt(0)=='+'|| ar[i].charAt(0)=='x' || ar[i].charAt(0)=='-'|| ar[i].charAt(0)=='/'|| ar[i].charAt(0)=='^')
		        {  
		   		 
		   		// System.out.print("here1");
		        	Float v1=(operand.pop());
		       	System.out.println(v1);
		        	Float v2=(operand.pop());
		       	System.out.println(v2);
		        	Float result;
		       	if (ar[i].charAt(0)=='+')
		           { //     System.out.println("true");
		       	//	System.out.println("here2");
		               	result=(v2+v1);
		                   operand.push(result);
		           }
		       	if (ar[i].charAt(0)=='-')
		           {
		               	result=v2-v1;
		               	 operand.push(result);
		           }
		       	if (ar[i].charAt(0)=='/')
		           {
		               	result=v2/v1;
		               	 operand.push(result);       
		           }
		       	if (ar[i].charAt(0)=='x')
		           {
		               	result=v2*v1;
		               	 operand.push(result);
		           }
		       	if (ar[i].charAt(0)=='^')
		           {
		               	 result=(float) Math.pow(v2,v1);
		               	 operand.push(result);
		           }
		      
		        }
		   	 else
		   		 {
		   		 if (ar[i].charAt(0)=='t')
		   	     {  
		   			 if (ar[i].charAt(3)=='-')
		   	     {
		   				float rs=(float) Math.tan(Math.toRadians(Float.parseFloat(ar[i].substring(4)))); 
			   			System.out.println("it is "+Float.parseFloat(ar[i].substring(3)));
			   			System.out.println("tan is "+rs);
			   			operand.push(-rs);   
		   	     }
		   			
		   			 else
		   				 {
		   				 float rs=(float) Math.tan(Math.toRadians(Float.parseFloat(ar[i].substring(3)))); 
		   				 System.out.println("it is "+Float.parseFloat(ar[i].substring(3)));
		   				 System.out.println("tan is "+rs);
		   				 operand.push(rs);   
		   				 }
		   			 }
		   		
		   		 else if (ar[i].charAt(0)=='s' && ar[i].charAt(1)=='i')
		   	     {
		   			float rs=(float) Math.sin(Math.toRadians(Float.parseFloat(ar[i].substring(3)))); 
		   			
		   			System.out.println("it is "+Float.parseFloat(ar[i].substring(3)));
		   			System.out.println("sin is "+rs);
		   			operand.push(rs);   
		   	     }
		   		 else if (ar[i].charAt(0)=='c')
		   	     {
		   			float rs=(float) Math.cos(Math.toRadians(Float.parseFloat(ar[i].substring(3)))); 
		   			
		   			System.out.println("it is "+Float.parseFloat(ar[i].substring(3)));
		   			System.out.println("cos is "+rs);
		   			operand.push(rs);   
		   	     }
		   		else if (ar[i].charAt(0)=='l')
		   	     {
		   			float rs=(float) Math.log10(Float.parseFloat(ar[i].substring(3))); 
		   			
		   			System.out.println("it is "+Float.parseFloat(ar[i].substring(3)));
		   			System.out.println("log is "+rs);
		   			operand.push(rs);   
		   	     }
		   		else if (ar[i].charAt(0)=='e')
		   	     {
		   			float rs=(float) Math.exp(Float.parseFloat(ar[i].substring(1))); 
		   			
		   			System.out.println("it is "+Float.parseFloat(ar[i].substring(1)));
		   			System.out.println("exp is "+rs);
		   			operand.push(rs);   
		   	     }
		   		else if (ar[i].charAt(0)=='s' && ar[i].charAt(1)=='q'&& ar[i].charAt(2)=='r'&& ar[i].charAt(3)=='t')
		   	     {
		   			float rs=(float) Math.sqrt(Float.parseFloat(ar[i].substring(4))); 
		   			
		   			System.out.println("it is "+Float.parseFloat(ar[i].substring(4)));
		   			System.out.println("square root is "+rs);
		   			operand.push(rs);   
		   	     }
		   		
		   		
		   		else
		   	     {
		   		  float r=Float.parseFloat(ar[i]);
		   		   operand.push(r);

		   		 }
		   		 		   	   //  System.out.println(r);
		   		 }
		   }

		   //System.out.println("hello");
		  		   return operand.pop();
		   //System.out.println("ans "+ operand.pop());
		   }

///////////////End of postfix evaluation //////////////////////////////////
	public static void main(String[] args) {
	
		new main();
	}

	//@Override
	public void keyPressed(KeyEvent e) 
	{
      if (e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
      {
    	  if (t.getText().isEmpty())
	 		{
	 			return;
	 		}
	 		else
	 		{
	 			String s=t.getText();
	 			if(s.charAt(s.length()-1)=='n')
	 				
	 			{
	 				String s1=t.getText().substring(0,t.getText().length()-2);
  	 			t.setText(s1);
	 			}
	 			else if (s.charAt(s.length()-1)=='t')
	 			{
	 				String s1=t.getText().substring(0,t.getText().length()-3);
  	 			t.setText(s1);
	 				
	 			}
	 			else if (s.charAt(s.length()-1)=='g')
	 				{
	 				String s1=t.getText().substring(0,t.getText().length()-2);
	 				t.setText(s1);
	 				}
	 			else
	 			{
	 				String s1=t.getText().substring(0,t.getText().length());
	 				t.setText(s1);
	 			}
	 		
	 		}
	  		
    	  
      }
	
      if (e.getKeyCode()==KeyEvent.VK_DELETE)
      {
    	  t.setText("");
      }
   
/*	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	*/}
}

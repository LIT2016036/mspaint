package mysecondproject;
import java.awt.*;
import java.awt.event.*;
class msmain extends Frame implements ActionListener,MouseMotionListener,MouseListener,WindowListener 
{
	mspaint1 b1;
	mspaint2 b2;
	mspaint3 b3;
	mspaint4 b4;
	mspaint5 b5;
	mspaint6 b6;
	mspaint7 b7;
	mspaint8 b8;
	mspaint9 b9;
	mspaint10 b10;
	mspaint11 b11;
	String shape=" ";
	int s=0;
	int x1,x2,y1,y2;
	msmain()
	{
		this.setLayout(null);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addWindowListener(this);
		b1=new mspaint1();
		b2=new mspaint2();
		b3=new mspaint3();
		b4=new mspaint4();
		b5=new mspaint5();
		b6=new mspaint6();
		b6.setLabel("E");
		b7=new mspaint7();
		b7.setLabel("+");
		b8=new mspaint8();
		b8.setLabel("-");
		b9=new mspaint9();
		b10=new mspaint10();
		b11=new mspaint11();
		b1.setBounds(10,10,80,60);
		b2.setBounds(100,10,80,60);
		b3.setBounds(10,80,80,60);
		b4.setBounds(100,80,80,60);
		b5.setBounds(10,160,80,60);
		b6.setBounds(100,160,80,60);
		b7.setBounds(10,240,80,60);
		b8.setBounds(100,240,80,60);
		b9.setBounds(10,320,80,60);
		b10.setBounds(100,320,80,60);
		b11.setBounds(10,400,80,60);
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
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		this.add(b10);
		this.add(b11);
		this.setVisible(true);
		this.setSize(400,400);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button b=(Button)e.getSource();
		if(b==b1)
		shape="draw_Rect";
		if(b==b2)
		shape="fill Rect";
		if(b==b3)
		shape="draw oval";
		if(b==b4)
		shape="fill Oval";
		if(b==b5)
		shape="line";
		if(b==b6)
		shape="erase";
		if(b==b7)
		shape="+";
		if(b==b8)
		shape="-";
		if(b==b9)
		shape="round rect";
		if(b==b10)
		shape="fillround rect";
		if(b==b11)
		shape="fill color";
	}
	public void paint(Graphics g)
	{
		if(shape.equals("draw_Rect"))
		g.drawRect(x1,y1,x2-x1,y2-y1);
		if(shape.equals("fill Rect"))
		g.fillRect(x1,y1,x2-x1,y2-y1);
		if(shape.equals("draw oval"))
		g.drawOval(x1,y1,x2-x1,y2-y1);
		if(shape.equals("fill Oval"))
		g.fillOval(x1,y1,x2-x1,y2-y1);
		if(shape.equals("line"))
		g.drawLine(x1,y1,x2-x1,y2-y1);
		if(shape.equals("erase"))
		g.clearRect(x1,y1,x2-x1,y2-y1);
        if(shape.equals("+"))
        g.clearRect(x1,y1,x2-x1+10,y2-y1+10);
        if(shape.equals("-"))
        g.clearRect(x1,y1,x2-x1-10,y2-y1-10);
	    if(shape=="round rect")
	    g.drawRoundRect(x1,y1,x2-x1,y2-y1,10,10);
        if(shape=="fillround rect")
        g.fillRoundRect(x1,y1,x2-x1,y2-y1,10,10);
        if(shape=="fill color")
        g.setColor(Color.green);
	}
	
	public static void main(String ar[])
	{
		//@SuppressWarnings("unused")
		msmain m=new msmain();
	}
	
	public void mousePressed(MouseEvent e)
	{
	x1=e.getX();
	y1=e.getY();
	}
	public void mouseReleased(MouseEvent e)
	{
	}
	public void mouseClicked(MouseEvent e)
	{
	}
	public void mouseEntered(MouseEvent e)
	{
	}
	public void mouseExited(MouseEvent e)
	{
	}
	public void mouseMoved(MouseEvent e)
	{
	}
	public void mouseDragged(MouseEvent e)
	{
		x2=e.getX();
		y2=e.getY();
		this.repaint();
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		this.dispose();
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	}



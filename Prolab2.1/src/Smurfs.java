import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuKeyEvent;
import javax.swing.plaf.TextUI;
import javax.swing.text.StyledEditorKit.BoldAction;

import java.awt.Color;
import java.awt.Dialog;

import javax.naming.InitialContext;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.awt.Panel;
import java.awt.Point;
import java.awt.Canvas;
import java.awt.Label;
import java.awt.LayoutManager;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;


public class Smurfs extends JFrame   {
	JLabel puanGosterJLabel=new JLabel();
	Oyuncu2TS tembelsirinOyuncu2ts=new Oyuncu2TS();
	Karakter djsKarakter=new Karakter();
	String nameString="";
	JButton oyuncuGozlukluSirin;
	JButton oyuncuTembelSirin;
	Oyuncu1GS oyuncu1gs=new Oyuncu1GS();
	Oyuncu2TS oyuncu2ts=new Oyuncu2TS();
	JLabel gozluklu = new JLabel("");
	JLabel tembel = new JLabel("");
	JLabel sirineicon = new JLabel();
	JLabel arkaplan = new JLabel("");
	JLabel Dusman1 = new JLabel("D1");
	JLabel Dusman2 = new JLabel("D2");
	JLabel blok = new JLabel("UPS! Blok");
	String name="";
	Altin altin=new Altin();
	JLabel altinLabel = new JLabel("");
	int randx=384,randy=84,objex,objey;
	Random random=new Random();
	JLabel MantarLabel = new JLabel("");
	JLabel deneme=new JLabel();
	private JPanel contentPane;
	ArrayList<Lokasyon> findpathArrayList;
	int sayac=0; //Timer icin
	int Skor=20;
	Karakter newkKarakter=new Karakter();
	Dusman dusmanyolDusman;
	public String secim;
	Dusman1A dusman1A=new Dusman1A();
	Dusman2G dusman2g=new Dusman2G();
	Lokasyon ots=new Lokasyon();
	String secim2;
	int xuzaklık=0,yuzaklık=0;
	int altins=0;
	public ArrayList<Lokasyon> pathArrayList=new ArrayList<Lokasyon>();
	
	private int maze[][]= 
	{
			{0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	1,	0,	0},
			{0,	1,	1,	1,	1,	0,	1,	1,	1,	1,	1,	1,	0},
			{0,	1,	0,	1,	1,	1,	1,	1,	1,	0,	0,	1,	0},
			{0,	1,	1,	1,	1,	0,	1,	0,	1,	1,	0,	1,	0},
			{0,	1,	0,	1,	0,	0,	1,	0,	1,	0,	0,	1,	0},
			{1,	1,	0,	1,	1,	1,	2,	0,	1,	0,	1,	1,	0},
			{0,	1,	0,	0,	1,	1,	1,	0,	1,	1,	1,	1,	0},
			{0,	1,	0,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1},
			{0,	1,	0,	1,	0,	0,	0,	0,	0,	1,	1,	1,	0},
			{0,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	0},
			{0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0}
	};
	
	
	public String putMaze() 
	{
		String html="<html><center><table cellspacing='0' cellpadding='0' border='0'></center>";
		for(int row=0; row<maze.length; row++) 
		{
			html+="<tr>";
			for(int column=0; column<maze[row].length; column++) 
			{
				if(maze[row][column]==0) 
				{
					html+="<td bgcolor='gray' width='50' height='50' border='1' ></td>";
				}
				else if(maze[row][column]==1) 
				{
					html+="<td bgcolor='white' width='50' height='50' border='1' ></td>";
				}
				else
					html+="<td bgcolor='#1aaef0' width='50' height='50' border='1' ></td>";
			}
			html+="</tr>";
		}
		html+="</table></html>";
		//System.out.println(html);
		return html;
	}
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Smurfs frame = new Smurfs();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	
		
	}
	
	

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	
	public Smurfs() throws IOException 
	{
		this.secim=secim;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(134, 185, 66));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 
		contentPane.add(deneme);
		deneme.setBounds(20, 101, 565, 46);
		
		//Geçici Karakter Seçim
		
		if(secim=="Gozluklu") 
		{
			oyuncuSecim("Gozluklu");
		}
		else
		{
			oyuncuSecim("Tembel");
		}
		
		deneme.setText(secim);
		Dusman();
		Sirineicon();
		blokuyarı() ;
		
		AltinGoster();
		MantarGoster();
		puan(Skor);
		
		//deneme.setText("Yol = " + yol);
		labirentcizim();
		
		
	}
	
	
	public void oyuncuSecim(String name) 
	{
		//Gozluklu Key
		if(name=="Gozluklu") 
		{
			
		
				JButton oyuncuGozlukluSirin = new JButton(new ImageIcon(Smurfs.class.getResource("/images/gozluklu.png")));
				oyuncuGozlukluSirin.setVisible(true);
				
				oyuncuGozlukluSirin.setBounds(683, 334, 50, 50);
				oyuncuGozlukluSirin.setOpaque(true);
				getContentPane().add(oyuncuGozlukluSirin);
				contentPane.add(oyuncuGozlukluSirin);
				oyuncuGozlukluSirin.addKeyListener(new KeyAdapter() 
				{
					@Override
					public void keyPressed(KeyEvent e) 
					{
						if(e.getKeyCode()==KeyEvent.VK_RIGHT) 
						{
							if(maze[(oyuncuGozlukluSirin.getY()-84)/50][((oyuncuGozlukluSirin.getX()+100)-383)/50]!=0 && maze[(oyuncuGozlukluSirin.getY()-84)/50][((oyuncuGozlukluSirin.getX()+50)-383)/50]!=0) 
								{
										
										oyuncuGozlukluSirin.setLocation(oyuncu1gs.Right(),oyuncuGozlukluSirin.getY()); 
										
										blok.setVisible(false);
										if(oyuncuGozlukluSirin.getX()==altinLabel.getX() && oyuncuGozlukluSirin.getY()==altinLabel.getY() || oyuncuGozlukluSirin.getX()==altinLabel.getX()+50 && oyuncuGozlukluSirin.getY()==altinLabel.getY()) 
										{
											altinLabel.setVisible(false);
											Skor+=25;
											puan(Skor);
										}
										if(oyuncuGozlukluSirin.getX()==MantarLabel.getX() && oyuncuGozlukluSirin.getY()==MantarLabel.getY() || oyuncuGozlukluSirin.getX()==MantarLabel.getX()+50 && oyuncuGozlukluSirin.getY()==MantarLabel.getY()) 
										{
											MantarLabel.setVisible(false);
											Skor+=50;
											puan(Skor);
										}
										if(oyuncuGozlukluSirin.getX()==983 && oyuncuGozlukluSirin.getY()==434) 
										{
											JOptionPane.showMessageDialog(null, "Kazandınız");
										}
										
								}
							else 
								{
									altinLabel.setVisible(true);
									MantarLabel.setVisible(true);
									blok.setVisible(true);;
								}
							
						}
						if(e.getKeyCode()==KeyEvent.VK_LEFT) 
						{
							if(maze[(oyuncuGozlukluSirin.getY()-84)/50][((oyuncuGozlukluSirin.getX()-100)-383)/50]!=0 && maze[(oyuncuGozlukluSirin.getY()-84)/50][((oyuncuGozlukluSirin.getX()-50)-383)/50]!=0)
								{
									oyuncuGozlukluSirin.setLocation(oyuncu1gs.Left(), oyuncuGozlukluSirin.getY()); 
									blok.setVisible(false);
									if(oyuncuGozlukluSirin.getX()==altinLabel.getX() && oyuncuGozlukluSirin.getY()==altinLabel.getY() || oyuncuGozlukluSirin.getX()==altinLabel.getX()-50 && oyuncuGozlukluSirin.getY()==altinLabel.getY() ) 
									{
										altinLabel.setVisible(false);
										Skor+=25;
										puan(Skor);
									}
									if(oyuncuGozlukluSirin.getX()==MantarLabel.getX() && oyuncuGozlukluSirin.getY()==MantarLabel.getY() || oyuncuGozlukluSirin.getX()==MantarLabel.getX()-50 && oyuncuGozlukluSirin.getY()==MantarLabel.getY()) 
									{
										MantarLabel.setVisible(false);
										Skor+=50;
										puan(Skor);
									}
									
									
								}
							else 
							{
								altinLabel.setVisible(true);
								MantarLabel.setVisible(true);
								blok.setVisible(true);
							}
						}
						if(e.getKeyCode()==KeyEvent.VK_DOWN) 
						{
							if(maze[((oyuncuGozlukluSirin.getY()+100)-84)/50][(oyuncuGozlukluSirin.getX()-383)/50]!=0 && maze[((oyuncuGozlukluSirin.getY()+50)-84)/50][(oyuncuGozlukluSirin.getX()-383)/50]!=0)
								{
										oyuncuGozlukluSirin.setLocation(oyuncuGozlukluSirin.getX(), oyuncu1gs.Down()); 
										blok.setVisible(false);
										if(oyuncuGozlukluSirin.getX()==altinLabel.getX() && oyuncuGozlukluSirin.getY()==altinLabel.getY() || oyuncuGozlukluSirin.getX()==altinLabel.getX() && oyuncuGozlukluSirin.getY()==altinLabel.getY()+50 ) 
										{
											altinLabel.setVisible(false);
											Skor+=25;
											puan(Skor);
										}
										if(oyuncuGozlukluSirin.getX()==MantarLabel.getX() && oyuncuGozlukluSirin.getY()==MantarLabel.getY() || oyuncuGozlukluSirin.getX()==MantarLabel.getX() && oyuncuGozlukluSirin.getY()==MantarLabel.getY()+50) 
										{
											MantarLabel.setVisible(false);
											Skor+=50;
											puan(Skor);
										}
										
								}
							else 
							{
								altinLabel.setVisible(true);
								MantarLabel.setVisible(true);
								blok.setVisible(true);
							}
						}
						if(e.getKeyCode()==KeyEvent.VK_UP) 
						{
							if(maze[((oyuncuGozlukluSirin.getY()-100)-84)/50][(oyuncuGozlukluSirin.getX()-383)/50]!=0 && maze[((oyuncuGozlukluSirin.getY()-50)-84)/50][(oyuncuGozlukluSirin.getX()-383)/50]!=0)
								{
									oyuncuGozlukluSirin.setLocation(oyuncuGozlukluSirin.getX(), oyuncu1gs.Up()); 
									blok.setVisible(false);
									if(oyuncuGozlukluSirin.getX()==altinLabel.getX() && oyuncuGozlukluSirin.getY()==altinLabel.getY() || oyuncuGozlukluSirin.getX()==altinLabel.getX() && oyuncuGozlukluSirin.getY()==altinLabel.getY()-50) 
									{
										altinLabel.setVisible(false);
										Skor+=25;
										puan(Skor);
									}
									if(oyuncuGozlukluSirin.getX()==MantarLabel.getX() && oyuncuGozlukluSirin.getY()==MantarLabel.getY() ||oyuncuGozlukluSirin.getX()==MantarLabel.getX() && oyuncuGozlukluSirin.getY()==MantarLabel.getY()-50 ) 
									{
										altinLabel.setVisible(true);
										Skor+=50;
										puan(Skor);
									}
									
								}	
							else 
							{
								altinLabel.setVisible(true);
								MantarLabel.setVisible(true);
								blok.setVisible(true);
							}
						}
						
					}
				});
	}
		else if(name=="Tembel") 
		{
			//Tembel Sirin Key 
			JButton oyuncuTembelSirin = new JButton(new ImageIcon(Smurfs.class.getResource("/images/tembelsirin.png")));
			oyuncuTembelSirin.setVisible(true);
			oyuncuTembelSirin.setBounds(683, 334, 50, 50);
			oyuncuTembelSirin.setOpaque(true);
			contentPane.add(oyuncuTembelSirin);
			oyuncuTembelSirin.addKeyListener(new KeyAdapter() 
			{
				@Override
				public void keyPressed(KeyEvent e) 
				{
					if(e.getKeyCode()==KeyEvent.VK_RIGHT) 
					{
						if(maze[(oyuncuTembelSirin.getY()-84)/50][((oyuncuTembelSirin.getX()+50)-383)/50]!=0) 
							{
								oyuncuTembelSirin.setLocation(oyuncu2ts.Right(),oyuncuTembelSirin.getY());
								
								blok.setVisible(false);
								
								if(oyuncuTembelSirin.getX()==altinLabel.getX() && oyuncuTembelSirin.getY()==altinLabel.getY()) 
								{
									
									altinLabel.setVisible(false);
									Skor+=25;
									puan(Skor);
								}
								if(oyuncuTembelSirin.getX()==MantarLabel.getX() && oyuncuTembelSirin.getY()==MantarLabel.getY()) 
								{
									MantarLabel.setVisible(false);
									Skor+=50;
									puan(Skor);
								}
								if(oyuncuTembelSirin.getX()==983 && oyuncuTembelSirin.getY()==434 && Skor>=20) 
								{
									JOptionPane.showMessageDialog(null, "Kazandınız");
								}
								ots.setX((oyuncuTembelSirin.getX()-383)/50); ots.setY((oyuncuTembelSirin.getY()-84)/50);
								DusmanGYol();
								
							}
						else 
						{
							MantarLabel.setVisible(true);
							altinLabel.setVisible(true);
							blok.setVisible(true);
						}
					}
					if(e.getKeyCode()==KeyEvent.VK_LEFT) 
					{
						if(maze[(oyuncuTembelSirin.getY()-84)/50][((oyuncuTembelSirin.getX()-50)-383)/50]!=0)
							{
								oyuncuTembelSirin.setLocation(oyuncu2ts.Left(), oyuncuTembelSirin.getY());
								
								if(oyuncuTembelSirin.getX()==altinLabel.getX() && oyuncuTembelSirin.getY()==altinLabel.getY())
								{
									altinLabel.setVisible(false);
									Skor+=25;
									puan(Skor);
								}
								if(oyuncuTembelSirin.getX()==MantarLabel.getX() && oyuncuTembelSirin.getY()==MantarLabel.getY()) 
								{
									MantarLabel.setVisible(false);
									Skor+=50;
									puan(Skor);
								}
								blok.setVisible(false);
								ots.setX((oyuncuTembelSirin.getX()-383)/50); ots.setY((oyuncuTembelSirin.getY()-84)/50);
								DusmanGYol();
							}
						else 
						{
							MantarLabel.setVisible(true);
							altinLabel.setVisible(true);
							blok.setVisible(true);
						}
					}
					if(e.getKeyCode()==KeyEvent.VK_DOWN) 
					{
						if(maze[((oyuncuTembelSirin.getY()+50)-84)/50][(oyuncuTembelSirin.getX()-383)/50]!=0 )
							{
								oyuncuTembelSirin.setLocation(oyuncuTembelSirin.getX(), oyuncu2ts.Down());
								if(oyuncuTembelSirin.getX()==altinLabel.getX() && oyuncuTembelSirin.getY()==altinLabel.getY()) 
								{
									altinLabel.setVisible(false);
									Skor+=25;
									puan(Skor);
								}
								if(oyuncuTembelSirin.getX()==MantarLabel.getX() && oyuncuTembelSirin.getY()==MantarLabel.getY()) 
								{
									MantarLabel.setVisible(false);
									Skor+=50;
									puan(Skor);
								}
								blok.setVisible(false);
								ots.setX((oyuncuTembelSirin.getX()-383)/50); ots.setY((oyuncuTembelSirin.getY()-84)/50);
								DusmanGYol();
								
							}
						else 
						{
							altinLabel.setVisible(true);
							MantarLabel.setVisible(true);
							blok.setVisible(true);
						}
					}
					if(e.getKeyCode()==KeyEvent.VK_UP) 
					{
						if(maze[((oyuncuTembelSirin.getY()-50)-84)/50][(oyuncuTembelSirin.getX()-383)/50]!=0 && maze[((oyuncuTembelSirin.getY()-50)-84)/50][(oyuncuTembelSirin.getX()-383)/50]!=0)
							{
								oyuncuTembelSirin.setLocation(oyuncuTembelSirin.getX(), oyuncu2ts.Up());
								if(oyuncuTembelSirin.getX()==altinLabel.getX() && oyuncuTembelSirin.getY()==altinLabel.getY()) 
								{
									altinLabel.setVisible(false);
									Skor+=25;
									puan(Skor);
								}
								if(oyuncuTembelSirin.getX()==MantarLabel.getX() && oyuncuTembelSirin.getY()==MantarLabel.getY()) 
								{
									MantarLabel.setVisible(false);
									Skor+=50;
									puan(Skor);
								}
								blok.setVisible(false);
								ots.setX((oyuncuTembelSirin.getX()-383)/50); ots.setY((oyuncuTembelSirin.getY()-84)/50);
								DusmanGYol();
								
								
								
							}
						else 
						{
							MantarLabel.setVisible(true);
							altinLabel.setVisible(true);
							blok.setVisible(true);
						
						}
					}
				}
			});
		}
	}
	public void Dusman() 
	{
		String dusmanAdString=""; int a=0,b=0;
		String file="/images/harita.txt";
		Scanner scanner = new Scanner(this.getClass().getResourceAsStream(file));
		String lineString;
		while(scanner.hasNextLine()) 
		{
			lineString=scanner.nextLine();
			if(lineString.startsWith("Karakter:")) 
			{
				for(String name:lineString.split(",")) 
				{
					name=name.substring(name.indexOf(":")+1);
					if(name.length()>1) 
					{
						dusmanAdString=name;
					}
					else 
					{
						switch (name) 
						{
						case "C":
							 a=384;
							 b=334;
							 break;
						case "D":
							 a=534;
							 b=584;
							 break;
						case "A":
							 a=534;
							 b=84;
							 break;
						case "B":
							 a=884;
							 b=84;
							 break;
						
							
						}
							
							
					}
				}
				if(dusmanAdString.startsWith("Gargamel")) 
				{
					Dusman1.setIcon(new ImageIcon(Smurfs.class.getResource("/images/gargamell.png")));
					Dusman1.setBounds(a, b, 50, 50);
					
					contentPane.add(Dusman1);	
					
				}
				
				else if(dusmanAdString.startsWith("Azman")) 
				{
					Dusman2.setIcon(new ImageIcon(Smurfs.class.getResource("/images/azman.png")));
					Dusman2.setBounds(a, b, 50, 50);
					
					contentPane.add(Dusman2);
				}
			}
		}
		
		
	}
	public void DusmanGYol() 
	{
		/*ArrayList<Lokasyon> yolArrayList=new ArrayList<Lokasyon>();
		Lokasyon dg=new Lokasyon((Dusman1.getX()-383)/50, (Dusman1.getY()-84)/50);
		yolArrayList=dijkstra(maze, ots, dg);
		deneme.setText(yolArrayList.get(0)+"");
		
		//deneme.setText("Oyuncu "+ots + "Dusman " + dg);
		//deneme.setText("aaaaa"+pathArrayList.get(0).getX() + pathArrayList.get(0).getY());
		Lokasyon denemeLokasyon=new Lokasyon();
		pathArrayList=dijkstra(maze, ots, dg);
		
		Dusman1.setLocation(yolArrayList.get(0).getX(),yolArrayList.get(0).getY());
		/*for(int i=0; i<pathArrayList.size(); i++) 
		{
			Dusman1.setLocation((pathArrayList.get(i).getX()*50)+383, (pathArrayList.get(i).getY()*50)+84);
			deneme.setText(""+pathArrayList.get(i).getX()+ " " + pathArrayList.get(i).getY());
		}*/
		
	}
	public void Sirineicon() 
	{
		//Sirine icon
		
		sirineicon.setForeground(Color.DARK_GRAY);
		sirineicon.setIcon(new ImageIcon(Smurfs.class.getResource("/images/sirine.png")));
		sirineicon.setBounds(1040, 430, 60, 60);
		sirineicon.setBackground(Color.BLACK);
		contentPane.add(sirineicon);
	}
	public void blokuyarı() 
	{
		//Blok Uyarı Label
		blok.setFont(new Font("TR Impact", Font.PLAIN, 21));
		blok.setBounds(671, 660, 220, 27);
		blok.setBackground(new Color(134, 185, 66));
		blok.setVisible(false);
		contentPane.add(blok);
	}
	public void puan(int puan) 
	{
		
		puanGosterJLabel.setFont(new Font("TR Impact", Font.PLAIN, 21));
		puanGosterJLabel.setBounds(0, 0, 420, 27);
		puanGosterJLabel.setBackground(new Color(134, 185, 66));
		puanGosterJLabel.setText("Puan:  " + puan);
		contentPane.add(puanGosterJLabel);
	}
	public void AltinGoster()
	{
		
		altinLabel.setIcon(new ImageIcon(Smurfs.class.getResource("/images/altin.png")));
		altinLabel.setVisible(true);
		contentPane.add(altinLabel);
		TimerTask altinTimerTask=new TimerTask() 
		{
			@Override
			public void run() 
			{
				
					
				randx=random.nextInt(12);
				randy=random.nextInt(10);
				objex=(randx*50)+383;
				objey=(randy*50)+84;
				if(maze[randy][randx]==1) 
				{
					altinLabel.setBounds(objex, objey, 50, 50);
					//altinLabel.setLocation(objex, objey);
					
				}
				
			}
		};
		
		Timer timer=new Timer();
		timer.schedule(altinTimerTask, 500,1300);
	}
	public void MantarGoster() 
	{
		MantarLabel.setIcon(new ImageIcon(Smurfs.class.getResource("/images/mantar.png")));
		altinLabel.setVisible(true);
		contentPane.add(MantarLabel);
		TimerTask MantarTimerTask=new TimerTask() 
		{
			@Override
			public void run() 
			{
				randx=random.nextInt(12);
				randy=random.nextInt(10);
				objex=(randx*50)+383;
				objey=(randy*50)+84;
				if(maze[randy][randx]==1) 
				{
					MantarLabel.setBounds(objex, objey, 50, 50);
				}
				
			}
		};
		
		Timer timer=new Timer();
		timer.schedule(MantarTimerTask, 700,2000);
	}
	public void ObjePaunHesap(int oyuncux,int oyuncuy,int objex,int objey) 
	{
		
			JLabel puanGoster=new JLabel();
			puanGoster.setFont(new Font("TR Impact", Font.PLAIN, 21));
			puanGoster.setBounds(0, 0, 420, 27);
			puanGoster.setBackground(new Color(134, 185, 66));
			puanGoster.setText(" "+oyuncux + "" +oyuncuy +"" +objex+""+ objey);
			contentPane.add(puanGoster);
		
	}
	
	public void labirentcizim() 
	{
		//Labirent Çizim
		JLabel putmazelabel = new JLabel(putMaze());
		putmazelabel.setBounds(383, 84, 650, 550);
		contentPane.add(putmazelabel);	
	}
	public boolean WinG() 
	{
		if(oyuncuGozlukluSirin.getX()==sirineicon.getX() && oyuncuGozlukluSirin.getY()==sirineicon.getY()) 
		{
			return true;
		}
		return false;
	}
	
	
	
}

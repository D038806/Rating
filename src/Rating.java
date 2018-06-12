import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Rating
{
	int op;

	Rank A = new Rank("死侍",0,0);
	Rank B = new Rank("復仇者聯盟3",0,0);
	Rank C = new Rank("真心話大冒險",0,0);
	Rank D = new Rank("星際大戰外傳",0,0);
	
	private JFrame Rating1;
	private JFrame Rating2;
	private JFrame frontPage;
	private JFrame Ranking;
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Rating gui = new Rating();
        gui.run();
	}
	
	public void run() 
	{

		frontPage = new JFrame();
		frontPage.setTitle("首頁");
		frontPage.setBounds(100, 100, 450, 300);
		frontPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frontPage.getContentPane().setLayout(null);
		
		Rating1 = new JFrame();
		Rating1.setTitle("評分_1");
		Rating1.setBounds(100, 100, 450, 300);
		Rating1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Rating1.getContentPane().setLayout(null);
		
		//Rating 2
		Rating2 = new JFrame();
		Rating2.setTitle("評分_2");
		Rating2.setBounds(100, 100, 450, 300);
		Rating2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Rating2.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("分數(1-10)");
		label.setBounds(88, 91, 100, 15);
		Rating2.getContentPane().add(label);
		
		JTextField getPoints = new JTextField();
		getPoints.setBounds(175, 88, 96, 21);
		Rating2.getContentPane().add(getPoints);
		getPoints.setColumns(10);
		
		JButton btnsubmit = new JButton("提交");
		btnsubmit.setBounds(293, 87, 87, 23);
		Rating2.getContentPane().add(btnsubmit);
		
		Ranking = new JFrame();
		Ranking.setTitle("統計表");
		Ranking.setBounds(100, 100, 450, 300);
		Ranking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ranking.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("往返");
		btnBack.setBounds(164, 200, 87, 23);
		Ranking.getContentPane().add(btnBack);
		
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frontPage.setVisible(true);
				Ranking.setVisible(false);
			}
		});
		
		JLabel lblmName = new JLabel("電影名稱");
		lblmName.setBounds(75, 24, 70, 15);
		Ranking.getContentPane().add(lblmName);
		
		JLabel lblavg = new JLabel("平均分數");
		lblavg.setBounds(205, 24, 70, 15);
		Ranking.getContentPane().add(lblavg);
		
		JLabel lblpeople = new JLabel("評分人數");
		lblpeople.setBounds(312, 24, 70, 15);
		Ranking.getContentPane().add(lblpeople);
		
		JLabel rank1 = new JLabel("死侍2");
		rank1.setBounds(75, 78, 80, 15);
		Ranking.getContentPane().add(rank1);
		
		JLabel rank2 = new JLabel("復仇者聯盟3");
		rank2.setBounds(75, 103, 80, 15);
		Ranking.getContentPane().add(rank2);
		
		JLabel rank3 = new JLabel("真心話大冒險");
		rank3.setBounds(75, 128, 80, 15);
		Ranking.getContentPane().add(rank3);
		
		JLabel rank4 = new JLabel("星際大戰外傳");
		rank4.setBounds(75, 155, 80, 15);
		Ranking.getContentPane().add(rank4);
		
		JLabel no1avg = new JLabel("尚未有人評分");
		no1avg.setBounds(205, 78, 80, 15);
		Ranking.getContentPane().add(no1avg);
		
		JLabel no2avg = new JLabel("尚未有人評分");
		no2avg.setBounds(205, 103, 80, 15);
		Ranking.getContentPane().add(no2avg);
		
		JLabel no3avg = new JLabel("尚未有人評分");
		no3avg.setBounds(205, 128, 80, 15);
		Ranking.getContentPane().add(no3avg);
		
		JLabel no4avg = new JLabel("尚未有人評分");
		no4avg.setBounds(205, 155, 80, 15);
		Ranking.getContentPane().add(no4avg);
		
		JLabel no1p = new JLabel("尚未有人評分");
		no1p.setBounds(312, 78, 80, 15);
		Ranking.getContentPane().add(no1p);
		
		JLabel no2p = new JLabel("尚未有人評分");
		no2p.setBounds(312, 103, 80, 15);
		Ranking.getContentPane().add(no2p);
		
		JLabel no3p = new JLabel("尚未有人評分");
		no3p.setBounds(312, 128, 80, 15);
		Ranking.getContentPane().add(no3p);
		
		JLabel no4p = new JLabel("尚未有人評分");
		no4p.setBounds(312, 155, 80, 15);
		Ranking.getContentPane().add(no4p);
		
		//首頁畫面
		JButton btnCurrent = new JButton("現有電影");
		btnCurrent.setBounds(157, 80, 87, 23);
		frontPage.getContentPane().add(btnCurrent);
		
		btnCurrent.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Rating1.setVisible(true);
				frontPage.setVisible(false);
			}
		});
		
		JButton btnRanking = new JButton("統計表");
		btnRanking.setBounds(157, 140, 87, 23);
		frontPage.getContentPane().add(btnRanking);
		
		btnRanking.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Rank[] all = new Rank[4];
				all[0] = A;
				all[1] = B;
				all[2] = C;
				all[3] = D;
				for(int i = 0;i<all.length;i++)
				{
					if(i == 0)
					{
						String s = String.valueOf(all[i].countP);
						no1p.setText(s);
						if(all[i].countP != 0)
						{
							float avg = (float)all[i].sum /(float)all[i].countP;
							s = String.valueOf(avg);
							no1avg.setText(s);
						}
					}
					else if(i == 1)
					{
						String s = String.valueOf(all[i].countP);
						no2p.setText(s);
						if(all[i].countP != 0)
						{
							float avg = (float)all[i].sum /(float)all[i].countP;
							s = String.valueOf(avg);
							no2avg.setText(s);
						}
					}
					else if(i == 2)
					{
						String s = String.valueOf(all[i].countP);
						no3p.setText(s);
						if(all[i].countP != 0)
						{
							float avg = (float)all[i].sum /(float)all[i].countP;
							s = String.valueOf(avg);
							no3avg.setText(s);
						}
						
					}
					else
					{
						String s = String.valueOf(all[i].countP);
						no4p.setText(s);
						if(all[i].countP != 0)
						{
							float avg = (float)all[i].sum /(float)all[i].countP;
							s = String.valueOf(avg);
							no4avg.setText(s);
						}
					}
				}
				
				
				
				Ranking.setVisible(true);
				frontPage.setVisible(false);

			}
		});
		
		//Rating1 畫面
		JLabel lblNewLabel = new JLabel("死侍2");
		lblNewLabel.setBounds(115, 41, 90, 15);
		Rating1.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("復仇者聯盟3");
		lblNewLabel_1.setBounds(115, 83, 90, 15);
		Rating1.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("真心大冒險");
		lblNewLabel_2.setBounds(115, 123, 90, 15);
		Rating1.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("星際大戰外傳");
		lblNewLabel_3.setBounds(115, 167, 90, 15);
		Rating1.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("評分");
		btnNewButton.setBounds(215, 37, 87, 23);
		Rating1.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Rating2.setVisible(true);
				Rating1.setVisible(false);
				op = 0;
			}
		});
		
		JButton btnNewButton_1 = new JButton("評分");
		btnNewButton_1.setBounds(215, 79, 87, 23);
		Rating1.getContentPane().add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Rating2.setVisible(true);
				Rating1.setVisible(false);
				op = 1;
			}
		});
		
		JButton btnNewButton_2 = new JButton("評分");
		btnNewButton_2.setBounds(215, 119, 87, 23);
		Rating1.getContentPane().add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Rating2.setVisible(true);
				Rating1.setVisible(false);
				op = 2;
			}
		});
		
		JButton btnNewButton_3 = new JButton("評分");
		btnNewButton_3.setBounds(215, 163, 87, 23);
		Rating1.getContentPane().add(btnNewButton_3);
		
		btnNewButton_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Rating2.setVisible(true);
				Rating1.setVisible(false);
				op = 3;
			}
		});
			
		btnsubmit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int p = 0;
				String point = getPoints.getText();
			    //System.out.println(point);
				if(point.equals(""))
				{
					JOptionPane.showMessageDialog(Rating2, "分數必須介於1~10");
				}
				else
				{
					p = Integer.parseInt(point);
					if(p > 10 || p < 1)
					{
						JOptionPane.showMessageDialog(Rating2, "分數必須介於1~10");
						getPoints.setText("");
					}
					else
					{
						 
						switch(op)
						{
							case 0:
								
								A.countP++;
								A.sum += p;
								System.out.println("人數 "+ A.countP + "總分 " +A.sum);
								frontPage.setVisible(true);
								Rating2.setVisible(false);
								getPoints.setText("");
								break;
							case 1:
								
								B.countP++;
								B.sum += p;
								//System.out.println("人數 "+ countP[1] + "總分 " +sum[1]);
								frontPage.setVisible(true);
								Rating2.setVisible(false);
								getPoints.setText("");
								break;
							case 2:
								
								C.countP++;
								C.sum += p;
								//System.out.println("人數 "+ countP[2] + "總分 " +sum[2]);
								frontPage.setVisible(true);
								Rating2.setVisible(false);
								getPoints.setText("");
								break;
							case 3:
								
								D.countP++;
								D.sum += p;
								//System.out.println("人數 "+ countP[3] + "總分 " + sum[3]);
								frontPage.setVisible(true);
								Rating2.setVisible(false);
								getPoints.setText("");
								break;
						}
					}
				}
				
			}
		});
		frontPage.setVisible(true);
	}
}

class Rank
{
	public String name;
	public int countP;
	public int sum;
	public Rank(String name, int countP, int sum) 
	{
		// TODO Auto-generated constructor stub
		this.name = name;
		this.countP = countP;
		this.sum = sum;
	}
	
}
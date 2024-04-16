package unitConverter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UnitConverter extends JFrame{

	JComboBox<String> converterUnit = new JComboBox<String>(); 
	JComboBox<String> converterFrom = new JComboBox<String>();
	JComboBox<String> converterTo = new JComboBox<String>();
	
	JTextField txtFrom = new JTextField();
	JTextField txtTo = new JTextField();
	
	JButton convert = new JButton();
	
	JLabel header = new JLabel();
	JLabel fromlbl = new JLabel();
	JLabel tolbl = new JLabel();
	
	JPanel panel = new JPanel();
	ImageIcon icon = new ImageIcon("bg3.png");
	ImageIcon BgImage = new ImageIcon(new ImageIcon("bg3.png").getImage().getScaledInstance(450, 500, Image.SCALE_SMOOTH) );
	
	UnitConverter(){
		/*this.add(panel);
		panel.setBounds(10, 10, 400, 400);
		panel.setLayout(null);
		panel.setBackground(Color.decode("#16a9fc"));
		*/
		this.setSize(450, 500);
		this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Unit Converter");
        this.setResizable(false);
        //this.getContentPane().setBackground(Color.blue); 
        this.setIconImage(icon.getImage());
 		this.setContentPane(new JLabel(BgImage));
        	
        this.setLayout(null);
        this.setVisible(true);

        //combo box unit
        this.add(converterUnit);
        converterUnit.setBounds(130, 110, 170, 30);
        converterUnit.addItem("Length");
        converterUnit.addItem("Weight");
        converterUnit.addItem("Temperature");
        converterUnit.addItem("Time");
        converterUnit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			converterFrom.removeAllItems();
			converterTo.removeAllItems();	
			if(converterUnit.getSelectedItem().equals("Length")) {
			
			converterFrom.addItem("Millimeter");
			converterFrom.addItem("Centimeter");
			converterFrom.addItem("Meter(s)");
			converterFrom.addItem("Kilometer(s)");
			converterFrom.addItem("Mile(s)");
			converterFrom.addItem("Yard(s)");
			converterFrom.addItem("Foot(ft)");
			converterFrom.addItem("Inch(s)");
			
			converterTo.addItem("Millimeter");
			converterTo.addItem("Centimeter");
			converterTo.addItem("Meter(s)");
			converterTo.addItem("Kilometer(s)");
			converterTo.addItem("Mile(s)");
			converterTo.addItem("Yard(s)");
			converterTo.addItem("Foot(ft)");
			converterTo.addItem("Inch(s)");
			
			}
			else if(converterUnit.getSelectedItem().equals("Weight")) {
			converterFrom.addItem("Gram(s)");
			converterFrom.addItem("Milligram(s)");
			converterFrom.addItem("Kilogram(s)");
			converterFrom.addItem("Pound(s)");
			converterFrom.addItem("Ounce(s)");
			
			converterTo.addItem("Gram(s)");
			converterTo.addItem("Milligram(s)");
			converterTo.addItem("Kilogram(s)");
			converterTo.addItem("Pound(s)");
			converterTo.addItem("Ounce(s)");
			}
			 
			else if(converterUnit.getSelectedItem().equals("Temperature")) {
			converterFrom.addItem("Celsius");
			converterFrom.addItem("Fahrenheit");
			converterFrom.addItem("Kelvin");
			
			converterTo.addItem("Celsius");
			converterTo.addItem("Fahrenheit");
			converterTo.addItem("Kelvin");
			
			}
			
			else if(converterUnit.getSelectedItem().equals("Time")) {
				converterFrom.addItem("Millisecond(s)");
				converterFrom.addItem("Second(s)");
				converterFrom.addItem("Minute(s)");
				converterFrom.addItem("Hour(s)");
				converterFrom.addItem("Day(s)");
				converterFrom.addItem("Week(s)");
				converterFrom.addItem("Month(s)");
				converterFrom.addItem("Year(s)");
				
				converterTo.addItem("Millisecond(s)");
				converterTo.addItem("Second(s)");
				converterTo.addItem("Minute(s)");
				converterTo.addItem("Hour(s)");
				converterTo.addItem("Day(s)");
				converterTo.addItem("Week(s)");
				converterTo.addItem("Month(s)");
				converterTo.addItem("Year(s)");
				}
			}});
        
        
        //header
        this.add(header);
        header.setBounds(55, 30, 325, 60);
        header.setText("Unit Converter");
        header.setFont(new Font("Segoe UI Variable Text Semibold", Font.BOLD,45));
        header.setForeground(Color.WHITE);
      //  header.setBorder(BorderFactory.createLineBorder(Color.decode("#f90400"), 5));
        
        //combo box from
        this.add(converterFrom);
        converterFrom.setBounds(20, 220, 150, 30);
        
        //label from
        this.add(fromlbl);	
        fromlbl.setBounds(60, 190, 150, 30);
        fromlbl.setText("FROM");
        fromlbl.setFont(new Font("Yu Mincho Demibold", Font.BOLD, 20));
        fromlbl.setForeground(Color.WHITE);
        
        //text field from
        this.add(txtFrom);
        txtFrom.setBounds(20, 275, 150, 30);
        
        
        //combo box to
        this.add(converterTo);
        converterTo.setBounds(250, 220, 150, 30);
        
        //label to
        this.add(tolbl);
        tolbl.setBounds(310, 190, 150, 30);
        tolbl.setText("TO");
        tolbl.setFont(new Font("Yu Mincho Demibold", Font.BOLD, 20));
        tolbl.setForeground(Color.WHITE);
        
        //text field to
        this.add(txtTo);
        txtTo.setBounds(250, 275, 150, 30);
        
        //convert button 
        this.add(convert);
        convert.setBounds(110, 350, 200, 40);
        convert.setText("Convert");
        convert.setFocusable(false);
        convert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String unitFrom = (String) converterFrom.getSelectedItem();
				String unitTo = (String) converterTo.getSelectedItem();
				double val = Double.parseDouble(txtFrom.getText());
				double conversion = 0;

				//millimeter
				if(unitFrom.equals("Millimeter") && unitTo.equals("Millimeter")) {
					conversion = val;
				}else if(unitFrom.equals("Millimeter") && unitTo.equals("Centimeter")) {
					conversion = val / 10;
				}else if(unitFrom.equals("Millimeter") && unitTo.equals("Meter(s)")) {
					conversion = val / 1000;
				}else if(unitFrom.equals("Millimeter") && unitTo.equals( "Kilometer(s)")) {
					conversion = val / 1e+6;
				}else if(unitFrom.equals("Millimeter") && unitTo.equals( "Mile(s)")) {
					conversion = val * 1.609e+6;
				}else if(unitFrom.equals("Millimeter") && unitTo.equals( "Yard(s)")) {
					conversion = val * 914.4;
				}else if(unitFrom.equals("Millimeter") && unitTo.equals( "Foot(ft)")) {
					conversion = val * 304.8;
				}else if(unitFrom.equals("Millimeter") && unitTo.equals( "Inch(s)")) {
					conversion = val * 25.4;
				}
					
				
				//Centimeter
				if (unitFrom.equals("Centimeter") && unitTo.equals("Millimeter")) {
				    conversion = val * 10;
				} else if (unitFrom.equals("Centimeter") && unitTo.equals("Centimeter")) {
				    conversion = val;
				} else if (unitFrom.equals("Centimeter") && unitTo.equals("Meter(s)")) {
				    conversion = val / 100;
				} else if (unitFrom.equals("Centimeter") && unitTo.equals("Kilometer(s)")) {
				    conversion = val / 100_000;
				} else if (unitFrom.equals("Centimeter") && unitTo.equals("Mile(s)")) {
				    conversion = val / 160900;
				} else if (unitFrom.equals("Centimeter") && unitTo.equals("Yard(s)")) {
				    conversion = val / 91.44;
				} else if (unitFrom.equals("Centimeter") && unitTo.equals("Foot(ft)")) {
				    conversion = val / 30.48;
				} else if (unitFrom.equals("Centimeter") && unitTo.equals("Inch(s)")) {
				    conversion = val / 2.54;
				}

				//meter
				else if (unitFrom.equals("Meter(s)") && unitTo.equals("Millimeter")) {
			    conversion = val * 1000;
				} else if (unitFrom.equals("Meter(s)") && unitTo.equals("Centimeter")) {
			    conversion = val * 100;
				} else if (unitFrom.equals("Meter(s)") && unitTo.equals("Meter(s)")) {
			    conversion = val;
				} else if (unitFrom.equals("Meter(s)") && unitTo.equals("Kilometer(s)")) {
			    conversion = val / 1000;
				} else if (unitFrom.equals("Meter(s)") && unitTo.equals("Mile(s)")) {
			    conversion = val / 1609;
				} else if (unitFrom.equals("Meter(s)") && unitTo.equals("Yard(s)")) {
			    conversion = val * 1.094;
				} else if (unitFrom.equals("Meter(s)") && unitTo.equals("Foot(ft)")) {
			    conversion = val * 3.281;
				} else if (unitFrom.equals("Meter(s)") && unitTo.equals("Inch(s)")) {
			    conversion = val * 39.37;
				}

					//kilometer
				else if (unitFrom.equals("Kilometer(s)") && unitTo.equals("Millimeter")) {
				    conversion = val * 1e+6;
				} else if (unitFrom.equals("Kilometer(s)") && unitTo.equals("Centimeter")) {
				    conversion = val * 100_000;
				} else if (unitFrom.equals("Kilometer(s)") && unitTo.equals("Meter(s)")) {
				    conversion = val * 1000;
				} else if (unitFrom.equals("Kilometer(s)") && unitTo.equals("Kilometer(s)")) {
				    conversion = val;
				} else if (unitFrom.equals("Kilometer(s)") && unitTo.equals("Mile(s)")) {
				    conversion = val / 1.609;
				} else if (unitFrom.equals("Kilometer(s)") && unitTo.equals("Yard(s)")) {
				    conversion = val * 1094;
				} else if (unitFrom.equals("Kilometer(s)") && unitTo.equals("Foot(ft)")) {
				    conversion = val * 3281;
				} else if (unitFrom.equals("Kilometer(s)") && unitTo.equals("Inch(s)")) {
				    conversion = val * 39370;
				}
				
				//miles
				else if (unitFrom.equals("Mile(s)") && unitTo.equals("Millimeter")) {
				    conversion = val * 1.609e+6;
				} else if (unitFrom.equals("Mile(s)") && unitTo.equals("Centimeter")) {
				    conversion = val * 160900;
				} else if (unitFrom.equals("Mile(s)") && unitTo.equals("Meter(s)")) {
				    conversion = val * 1609;
				} else if (unitFrom.equals("Mile(s)") && unitTo.equals("Kilometer(s)")) {
				    conversion = val * 1.609;
				} else if (unitFrom.equals("Mile(s)") && unitTo.equals("Mile(s)")) {
				    conversion = val;
				} else if (unitFrom.equals("Mile(s)") && unitTo.equals("Yard(s)")) {
				    conversion = val * 1760;
				} else if (unitFrom.equals("Mile(s)") && unitTo.equals("Foot(ft)")) {
				    conversion = val * 5280;
				} else if (unitFrom.equals("Mile(s)") && unitTo.equals("Inch(s)")) {
				    conversion = val * 63360;
				}
				
				//yards
				else if (unitFrom.equals("Yard(s)") && unitTo.equals("Millimeter")) {
				    conversion = val * 914.4;
				} else if (unitFrom.equals("Yard(s)") && unitTo.equals("Centimeter")) {
				    conversion = val * 91.44;
				} else if (unitFrom.equals("Yard(s)") && unitTo.equals("Meter(s)")) {
				    conversion = val / 1.094;
				} else if (unitFrom.equals("Yard(s)") && unitTo.equals("Kilometer(s)")) {
				    conversion = val / 1094;
				} else if (unitFrom.equals("Yard(s)") && unitTo.equals("Mile(s)")) {
				    conversion = val / 1760;
				} else if (unitFrom.equals("Yard(s)") && unitTo.equals("Yard(s)")) {
				    conversion = val;
				} else if (unitFrom.equals("Yard(s)") && unitTo.equals("Foot(ft)")) {
				    conversion = val * 3;
				} else if (unitFrom.equals("Yard(s)") && unitTo.equals("Inch(s)")) {
				    conversion = val * 36;
				}
				
				//foot
				else if (unitFrom.equals("Foot(ft)") && unitTo.equals("Millimeter")) {
				    conversion = val * 304.8;
				} else if (unitFrom.equals("Foot(ft)") && unitTo.equals("Centimeter")) {
				    conversion = val * 30.48;
				} else if (unitFrom.equals("Foot(ft)") && unitTo.equals("Meter(s)")) {
				    conversion = val / 3.281;
				} else if (unitFrom.equals("Foot(ft)") && unitTo.equals("Kilometer(s)")) {
				    conversion = val / 3281;
				} else if (unitFrom.equals("Foot(ft)") && unitTo.equals("Mile(s)")) {
				    conversion = val / 5280;
				} else if (unitFrom.equals("Foot(ft)") && unitTo.equals("Yard(s)")) {
				    conversion = val / 3;
				} else if (unitFrom.equals("Foot(ft)") && unitTo.equals("Foot(ft)")) {
				    conversion = val;
				} else if (unitFrom.equals("Foot(ft)") && unitTo.equals("Inch(s)")) {
				    conversion = val * 12;
				}
				//inch
				else if (unitFrom.equals("Inch(s)") && unitTo.equals("Millimeter")) {
				    conversion = val * 25.4;
				} else if (unitFrom.equals("Inch(s)") && unitTo.equals("Centimeter")) {
				    conversion = val * 2.54;
				} else if (unitFrom.equals("Inch(s)") && unitTo.equals("Meter(s)")) {
				    conversion = val / 39.37;
				} else if (unitFrom.equals("Inch(s)") && unitTo.equals("Kilometer(s)")) {
				    conversion = val / 39370;
				} else if (unitFrom.equals("Inch(s)") && unitTo.equals("Mile(s)")) {
				    conversion = val / 63360;
				} else if (unitFrom.equals("Inch(s)") && unitTo.equals("Yard(s)")) {
				    conversion = val / 36;
				} else if (unitFrom.equals("Inch(s)") && unitTo.equals("Foot(ft)")) {
				    conversion = val / 12;
				} else if (unitFrom.equals("Inch(s)") && unitTo.equals("Inch(s)")) {
				    conversion = val;
				}
				
				
				//weight
				//grams
				if (unitFrom.equals("Gram(s)") && unitTo.equals("Milligram(s)")) {
				    conversion = val * 1000;
				} else if (unitFrom.equals("Gram(s)") && unitTo.equals("Gram(s)")) {
				    conversion = val;
				} else if (unitFrom.equals("Gram(s)") && unitTo.equals("Kilogram(s)")) {
				    conversion = val / 1000;
				} else if (unitFrom.equals("Gram(s)") && unitTo.equals("Pound(s)")) {
				    conversion = val / 453.6;
				} else if (unitFrom.equals("Gram(s)") && unitTo.equals("Ounce(s)")) {
				    conversion = val / 28.35;
				}
				//milligrams
				else if (unitFrom.equals("Milligram(s)") && unitTo.equals("Milligram(s)")) {
				    conversion = val;
				} else if (unitFrom.equals("Milligram(s)") && unitTo.equals("Gram(s)")) {
				    conversion = val / 1000;
				} else if (unitFrom.equals("Milligram(s)") && unitTo.equals("Kilogram(s)")) {
				    conversion = val / 1e+6;
				} else if (unitFrom.equals("Milligram(s)") && unitTo.equals("Pound(s)")) {
				    conversion = val / 453600;
				} else if (unitFrom.equals("Milligram(s)") && unitTo.equals("Ounce(s)")) {
				    conversion = val / 28350;
				}
				//Kilogram
				else if (unitFrom.equals("Kilogram(s)") && unitTo.equals("Milligram(s)")) {
				    conversion = val * 1e+6;
				} else if (unitFrom.equals("Kilogram(s)") && unitTo.equals("Gram(s)")) {
				    conversion = val * 1000;
				} else if (unitFrom.equals("Kilogram(s)") && unitTo.equals("Kilogram(s)")) {
				    conversion = val;
				} else if (unitFrom.equals("Kilogram(s)") && unitTo.equals("Pound(s)")) {
				    conversion = val * 2.205;
				} else if (unitFrom.equals("Kilogram(s)") && unitTo.equals("Ounce(s)")) {
				    conversion = val * 35.274;
				}
				// Pounds
				else if (unitFrom.equals("Pound(s)") && unitTo.equals("Milligram(s)")) {
				    conversion = val * 453600;
				} else if (unitFrom.equals("Pound(s)") && unitTo.equals("Gram(s)")) {
				    conversion = val * 453.6;
				} else if (unitFrom.equals("Pound(s)") && unitTo.equals("Kilogram(s)")) {
				    conversion = val / 2.205;
				} else if (unitFrom.equals("Pound(s)") && unitTo.equals("Pound(s)")) {
				    conversion = val;
				} else if (unitFrom.equals("Pound(s)") && unitTo.equals("Ounce(s)")) {
				    conversion = val * 16;
				}
				//ounce
				else if (unitFrom.equals("Ounce(s)") && unitTo.equals("Milligram(s)")) {
				    conversion = val * 28350;
				} else if (unitFrom.equals("Ounce(s)") && unitTo.equals("Gram(s)")) {
				    conversion = val * 28.35;
				} else if (unitFrom.equals("Ounce(s)") && unitTo.equals("Kilogram(s)")) {
				    conversion = val / 35.274;
				} else if (unitFrom.equals("Ounce(s)") && unitTo.equals("Pound(s)")) {
				    conversion = val / 16;
				} else if (unitFrom.equals("Ounce(s)") && unitTo.equals("Ounce(s)")) {
				    conversion = val;
				}

				
				//temperature
				//celcius
				if (unitFrom.equals("Celsius") && unitTo.equals("Fahrenheit")) {
				    conversion = (val * 9/5) + 32;
				} else if (unitFrom.equals("Celsius") && unitTo.equals("Celsius")) {
				    conversion = val;
				} else if (unitFrom.equals("Celsius") && unitTo.equals("Kelvin")) {
				    conversion = val + 273.15;
				//farenheit
				} else if (unitFrom.equals("Fahrenheit") && unitTo.equals("Celsius")) {
				    conversion = (val - 32) * 5/9;
				} else if (unitFrom.equals("Fahrenheit") && unitTo.equals("Fahrenheit")) {
				    conversion = val;
				} else if (unitFrom.equals("Fahrenheit") && unitTo.equals("Kelvin")) {
				    conversion = (val - 32) * 5/9 +273.15;
				//kelvin
				} else if (unitFrom.equals("Kelvin") && unitTo.equals("Celsius")) {
				    conversion = val - 273.15;
				} else if (unitFrom.equals("Kelvin") && unitTo.equals("Fahrenheit")) {
				    conversion = (val - 273.15) * 9/5 + 32;
				} else if (unitFrom.equals("Kelvin") && unitTo.equals("Kelvin")) {
				    conversion = val;
				}
				
				//time
				//milliseconds
				if (unitFrom.equals("Millisecond(s)") && unitTo.equals("Second(s)")) {
				    conversion = val / 1000;
				} else if (unitFrom.equals("Millisecond(s)") && unitTo.equals("Millisecond(s)")) {
				    conversion = val;
				} else if (unitFrom.equals("Millisecond(s)") && unitTo.equals("Minute(s)")) {
				    conversion = val / 60000;
				} else if (unitFrom.equals("Millisecond(s)") && unitTo.equals("Hour(s)")) {
				    conversion = val / 3.6e+6;
				} else if (unitFrom.equals("Millisecond(s)") && unitTo.equals("Day(s)")) {
				    conversion = val / 8.64e+7;
				} else if (unitFrom.equals("Millisecond(s)") && unitTo.equals("Week(s)")) {
				    conversion = val / 6.048e+8;
				} else if (unitFrom.equals("Millisecond(s)") && unitTo.equals("Month(s)")) {
				    conversion = val / 2.628e+9;
				} else if (unitFrom.equals("Millisecond(s)") && unitTo.equals("Year(s)")) {
				    conversion = val / 3.154e+10;
				}
				// seconds
				if (unitFrom.equals("Second(s)") && unitTo.equals("Second(s)")) {
				    conversion = val;
				} else if (unitFrom.equals("Second(s)") && unitTo.equals("Millisecond(s)")) {
				    conversion = val * 1000;
				} else if (unitFrom.equals("Second(s)") && unitTo.equals("Minute(s)")) {
				    conversion = val / 60;
				} else if (unitFrom.equals("Second(s)") && unitTo.equals("Hour(s)")) {
				    conversion = val / 3600;
				} else if (unitFrom.equals("Second(s)") && unitTo.equals("Day(s)")) {
				    conversion = val / 86400;
				} else if (unitFrom.equals("Second(s)") && unitTo.equals("Week(s)")) {
				    conversion = val / 604800;
				} else if (unitFrom.equals("Second(s)") && unitTo.equals("Month(s)")) {
				    conversion = val / 2.628e+6;
				} else if (unitFrom.equals("Second(s)") && unitTo.equals("Year(s)")) {
				    conversion = val / 3.154e+7;
				}
				// minutes
				if (unitFrom.equals("Minute(s)") && unitTo.equals("Minute(s)")) {
				    conversion = val;
				} else if (unitFrom.equals("Minute(s)") && unitTo.equals("Millisecond(s)")) {
				    conversion = val * 60000;
				} else if (unitFrom.equals("Minute(s)") && unitTo.equals("Second(s)")) {
				    conversion = val * 60;
				} else if (unitFrom.equals("Minute(s)") && unitTo.equals("Hour(s)")) {
				    conversion = val / 60;
				} else if (unitFrom.equals("Minute(s)") && unitTo.equals("Day(s)")) {
				    conversion = val / 1440;
				} else if (unitFrom.equals("Minute(s)") && unitTo.equals("Week(s)")) {
				    conversion = val / 10080;
				} else if (unitFrom.equals("Minute(s)") && unitTo.equals("Month(s)")) {
				    conversion = val / 43800;
				} else if (unitFrom.equals("Minute(s)") && unitTo.equals("Year(s)")) {
				    conversion = val / 525600;
				}
				//hours
				if (unitFrom.equals("Hour(s)") && unitTo.equals("Hour(s)")) {
				    conversion = val;
				} else if (unitFrom.equals("Hour(s)") && unitTo.equals("Millisecond(s)")) {
				    conversion = val * 3.6e+6;
				} else if (unitFrom.equals("Hour(s)") && unitTo.equals("Second(s)")) {
				    conversion = val * 3600;
				} else if (unitFrom.equals("Hour(s)") && unitTo.equals("Minute(s)")) {
				    conversion = val * 60;
				} else if (unitFrom.equals("Hour(s)") && unitTo.equals("Day(s)")) {
				    conversion = val / 24;
				} else if (unitFrom.equals("Hour(s)") && unitTo.equals("Week(s)")) {
				    conversion = val / 168;
				} else if (unitFrom.equals("Hour(s)") && unitTo.equals("Month(s)")) {
				    conversion = val / 730;
				} else if (unitFrom.equals("Hour(s)") && unitTo.equals("Year(s)")) {
				    conversion = val / 8760;
				}
				//days
				if (unitFrom.equals("Day(s)") && unitTo.equals("Day(s)")) {
				    conversion = val;
				} else if (unitFrom.equals("Day(s)") && unitTo.equals("Millisecond(s)")) {
				    conversion = val * 8.64e+7;
				} else if (unitFrom.equals("Day(s)") && unitTo.equals("Second(s)")) {
				    conversion = val * 86400;
				} else if (unitFrom.equals("Day(s)") && unitTo.equals("Minute(s)")) {
				    conversion = val * 1440;
				} else if (unitFrom.equals("Day(s)") && unitTo.equals("Hour(s)")) {
				    conversion = val * 24;
				} else if (unitFrom.equals("Day(s)") && unitTo.equals("Week(s)")) {
				    conversion = val / 7;
				} else if (unitFrom.equals("Day(s)") && unitTo.equals("Month(s)")) {
				    conversion = val / 30.417;
				} else if (unitFrom.equals("Day(s)") && unitTo.equals("Year(s)")) {
				    conversion = val / 365;
				}
				//week
				if (unitFrom.equals("Week(s)") && unitTo.equals("Week(s)")) {
				    conversion = val;
				} else if (unitFrom.equals("Week(s)") && unitTo.equals("Millisecond(s)")) {
				    conversion = val * 6.048e+8;
				} else if (unitFrom.equals("Week(s)") && unitTo.equals("Second(s)")) {
				    conversion = val * 604800;
				} else if (unitFrom.equals("Week(s)") && unitTo.equals("Minute(s)")) {
				    conversion = val * 10080;
				} else if (unitFrom.equals("Week(s)") && unitTo.equals("Hour(s)")) {
				    conversion = val * 168;
				} else if (unitFrom.equals("Week(s)") && unitTo.equals("Day(s)")) {
				    conversion = val * 7;
				} else if (unitFrom.equals("Week(s)") && unitTo.equals("Month(s)")) {
				    conversion = val / 4.345;
				} else if (unitFrom.equals("Week(s)") && unitTo.equals("Year(s)")) {
				    conversion = val / 52.143;
				}
				//months
				if (unitFrom.equals("Month(s)") && unitTo.equals("Month(s)")) {
				    conversion = val;
				} else if (unitFrom.equals("Month(s)") && unitTo.equals("Millisecond(s)")) {
				    conversion = val * 2.628e+9;
				} else if (unitFrom.equals("Month(s)") && unitTo.equals("Second(s)")) {
				    conversion = val * 2.628e+6;
				} else if (unitFrom.equals("Month(s)") && unitTo.equals("Minute(s)")) {
				    conversion = val * 43800;
				} else if (unitFrom.equals("Month(s)") && unitTo.equals("Hour(s)")) {
				    conversion = val * 730;
				} else if (unitFrom.equals("Month(s)") && unitTo.equals("Day(s)")) {
				    conversion = val * 30.417;
				} else if (unitFrom.equals("Month(s)") && unitTo.equals("Week(s)")) {
				    conversion = val * 4.34524;
				} else if (unitFrom.equals("Month(s)") && unitTo.equals("Year(s)")) {
				    conversion = val / 12;
				}
				//year 
				if (unitFrom.equals("Year(s)") && unitTo.equals("Year(s)")) {
				    conversion = val;
				} else if (unitFrom.equals("Year(s)") && unitTo.equals("Millisecond(s)")) {
				    conversion = val * 3.154e+10;
				} else if (unitFrom.equals("Year(s)") && unitTo.equals("Second(s)")) {
				    conversion = val * 3.154e+7;
				} else if (unitFrom.equals("Year(s)") && unitTo.equals("Minute(s)")) {
				    conversion = val * 525600;
				} else if (unitFrom.equals("Year(s)") && unitTo.equals("Hour(s)")) {
				    conversion = val * 8760;
				} else if (unitFrom.equals("Year(s)") && unitTo.equals("Day(s)")) {
				    conversion = val * 365;
				} else if (unitFrom.equals("Year(s)") && unitTo.equals("Week(s)")) {
				    conversion = val * 52.143;
				} else if (unitFrom.equals("Year(s)") && unitTo.equals("Month(s)")) {
				    conversion = val * 12;
				}
				
				txtTo.setText(String.valueOf(conversion));	
				
			}});
	}
}

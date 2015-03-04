package view.ReturnValue.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.JButton;

import view.ReturnValue.ReturnValueAlgorithm2;
import view.ReturnValue.ReturnValueView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AlgorithmButton extends JPanel {


	private static final long serialVersionUID = 6390141844240166488L;
	private ReturnValueView r;
	private JButton btnAdvance;
	private ReturnValueAlgorithm2 alg2;

	/**
	 * Create the panel.
	 */
	public AlgorithmButton(ReturnValueView rvv,ReturnValueAlgorithm2 alg) {
		
		r = rvv;
		alg2 = alg;
		
		btnAdvance = new JButton("Advance");
		btnAdvance.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAdvance.setBounds(55, 85, 127, 35);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Depending on the parameter, the necessary text fields in ReturnValueAlgorithm2
				 * will be set visible for use
				 */
				
				/*
				 * If the parameter is 2 then set all up to line 3 visible
				 */
				if(alg2.getParameter() == 2)
					alg2.setLine2Vis();
				/*
				 * If the parameter is 3 then set all up to line 3 visible
				 */
				if(alg2.getParameter() == 3){
					alg2.setLine2Vis();
					alg2.setLine3Vis();
				}
				
				/*
				 * If the parameter is 4 then set all up to line 4 visible
				 */
				if(alg2.getParameter() == 4){
					alg2.setLine2Vis();
					alg2.setLine3Vis();
					alg2.setLine4Vis();
					
				}
				/*
				 * If the parameter is 5 then set all up to line 5 visible
				 */
				if(alg2.getParameter() == 5){
					alg2.setLine2Vis();
					alg2.setLine3Vis();
					alg2.setLine4Vis();
					alg2.setLine5Vis();
					
				}
				/*
				 * If the parameter is 6 then set all up to line 6 visible
				 */
				if(alg2.getParameter() == 6){
					alg2.setLine2Vis();
					alg2.setLine3Vis();
					alg2.setLine4Vis();
					alg2.setLine5Vis();
					alg2.setLine6Vis();
					
				}
				/*
				 * If the parameter is 7 then set all up to line 7 visible
				 */
				if(alg2.getParameter() == 7){
					alg2.setLine2Vis();
					alg2.setLine3Vis();
					alg2.setLine4Vis();
					alg2.setLine5Vis();
					alg2.setLine6Vis();
					alg2.setLine7Vis();
					
				}
				/*
				 * If the parameter is 8 then set all up to line 8 visible
				 */
				if(alg2.getParameter() == 8){
					alg2.setLine2Vis();
					alg2.setLine3Vis();
					alg2.setLine4Vis();
					alg2.setLine5Vis();
					alg2.setLine6Vis();
					alg2.setLine7Vis();
					alg2.setLine8Vis();
					
				}
				/*
				 * If the parameter is 9 then set all up to line 9 visible
				 */
				if(alg2.getParameter() == 9){
					alg2.setLine2Vis();
					alg2.setLine3Vis();
					alg2.setLine4Vis();
					alg2.setLine5Vis();
					alg2.setLine6Vis();
					alg2.setLine7Vis();
					alg2.setLine8Vis();
					alg2.setLine9Vis();
					
				}
				/*
				 * If the parameter is 10 then set all to visible
				 */
				if(alg2.getParameter() == 10){
					alg2.setLine2Vis();
					alg2.setLine3Vis();
					alg2.setLine4Vis();
					alg2.setLine5Vis();
					alg2.setLine6Vis();
					alg2.setLine7Vis();
					alg2.setLine8Vis();
					alg2.setLine9Vis();
					alg2.setLine10Vis();
					
				}

				
				//Switches card panels
				r.switchCards2();
				
			}
		});
		setLayout(null);
		add(btnAdvance);

	}
	
	public void setNotVis(){
		btnAdvance.setVisible(false);
	}
	
	public void setVis(){
		btnAdvance.setVisible(true);
	}
}

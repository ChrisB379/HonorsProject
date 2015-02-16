package view.ReturnValue.AdvanceButtons;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import model.ReturnValue;
import view.ReturnValue.ReturnValueView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExampleButton extends JPanel {


	private static final long serialVersionUID = -6156974517525499165L;
	private ReturnValueView r;

	/**
	 * Create the panel.
	 */
	public ExampleButton(ReturnValueView rvv) {
		
		r = rvv;
		
		JButton btnAdvance = new JButton("Advance");
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				r.switchCards1();
			}
		});
		
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(37)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(53, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(51)
					.addComponent(btnAdvance, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(61, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}

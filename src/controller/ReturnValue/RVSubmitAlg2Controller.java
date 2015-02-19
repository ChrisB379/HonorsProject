package controller.ReturnValue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.IReturnValue;
import view.ReturnValue.ReturnValueAlgorithm;
import view.ReturnValue.ReturnValueAlgorithm2;


public class RVSubmitAlg2Controller implements ActionListener {
	
	private IReturnValue model;
	
	private ReturnValueAlgorithm2 view;
	
	public RVSubmitAlg2Controller(IReturnValue m, ReturnValueAlgorithm2 v){
	
	model = m;
	
	view = v;
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

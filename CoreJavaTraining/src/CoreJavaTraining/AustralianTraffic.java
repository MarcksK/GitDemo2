package CoreJavaTraining;

import demopack.CentralTraffic;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.FlashYello();
		a.greenGo();
		
		AustralianTraffic at = new AustralianTraffic();
		
		
		ContinentalTraffic ct = new AustralianTraffic();
		ct.TrainSymbol();
		

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green stop implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red stop implementation");
		
	}

	@Override
	public void FlashYello() {
		// TODO Auto-generated method stub
		System.out.println("Flash Yellow implementation");
		
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		
	}

}

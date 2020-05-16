package org.practice.state.products;

import org.practice.state.states.State;

//Context Interface
public interface Mobile {
	public void setMobileState(State aState);
	public void ChargeMobile();
	public void USBConnect();
	public void AdbAccess();
	public State getCharging() ;
	public State getUsb() ;
	public State getAdb() ;
}

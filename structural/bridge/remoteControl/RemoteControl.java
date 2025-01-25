package structural.bridge.remoteControl;

import structural.bridge.devices.DeviceImplementation;
import structural.bridge.devices.Radio;


public class RemoteControl {
  private DeviceImplementation device;

 public RemoteControl(DeviceImplementation device){
  this.device = device;
 }

 public RemoteControl(Radio radio) {
  //TODO Auto-generated constructor stub
}

public void togllePower(){ // ligar e desligar dispositivo
  device.setPower(!device.getPower());
  System.out.println(device.getName() + " power status: " + device.getPower());
 }
}

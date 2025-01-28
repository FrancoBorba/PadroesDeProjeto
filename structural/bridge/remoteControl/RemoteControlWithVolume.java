package structural.bridge.remoteControl;

import structural.bridge.devices.DeviceImplementation;


public class RemoteControlWithVolume extends RemoteControl {

  private DeviceImplementation device;

  public RemoteControlWithVolume(DeviceImplementation device){
    super(device);
    
  }

 


  public void volumeUP(){
    int oldVolume = device.getVolume();
    device.setVolume(device.getVolume() + 5);
    System.out.println("Volume antigo: " + oldVolume);
     System.out.println("Volume novo: " + device.getVolume());
  }

  public void volumeDOWN(){
    int oldVolume = device.getVolume();
    device.setVolume(device.getVolume() - 5);
    System.out.println("Volume antigo: " + oldVolume);
    System.out.println("Volume novo: " + device.getVolume());
  }


  
}

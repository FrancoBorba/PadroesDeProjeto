package structural.bridge;

import structural.bridge.devices.DeviceImplementation;
import structural.bridge.devices.Radio;
import structural.bridge.devices.Tv;
import structural.bridge.remoteControl.RemoteControl;
import structural.bridge.remoteControl.RemoteControlWithVolume;

public class ClientCode {
    public static void clientCode(RemoteControl abstraction) {
        abstraction.togllePower(); // true

        // Type Guard
        if (!(abstraction instanceof RemoteControlWithVolume)) return;

        RemoteControlWithVolume remoteWithVolume = (RemoteControlWithVolume) abstraction;
        remoteWithVolume.volumeUP(); // 20
        remoteWithVolume.volumeUP(); // 30
        remoteWithVolume.volumeDOWN(); // 20
    }

    public static void main(String[] args) {
        Tv tv = new Tv();
        Radio radio = new Radio();

        RemoteControl radioRemoteControl = new RemoteControl(radio);
        clientCode(radioRemoteControl);

        RemoteControlWithVolume tvRemoteControl = new RemoteControlWithVolume((DeviceImplementation) tv);
        clientCode(tvRemoteControl);
    }
}
package org.envirocar.obd.adapter;

public class UniCarScanAdapter extends AposW3Adapter{

    @Override
    public boolean supportsDevice(String deviceName) {
        return deviceName.contains("OBDII") || deviceName.contains("ELM327");
    }

}

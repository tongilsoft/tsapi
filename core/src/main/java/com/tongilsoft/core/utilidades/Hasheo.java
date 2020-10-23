package com.tongilsoft.core.utilidades;

import java.util.UUID;

public class Hasheo {
    private static final String TAG = "Hasheo";
    private static final TSLogging mLog=new TSLogging(false,false,false);
    public static String generarUUID(){
        String uuidHash = "";
        try {
            UUID uuid = UUID.randomUUID();
            uuidHash = String.valueOf(uuid);
            mLog.d(TAG, String.format("generarUUID() -> %s [ %d ]", uuidHash, uuidHash.length()));
        }catch (Exception e) {
            uuidHash = "Exception";
            mLog.e(TAG,"generarUUID() -> Exception",e);
        }
        return uuidHash;
    }
}

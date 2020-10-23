package com.tongilsoft.core.interfaces.sync;

public interface ServerSyncCallbacks {
    void reloadOnSyncReady(boolean detachFirst, String action);
}
package com.roman;

public class ProfilingController implements ProfilingControllerMBean {
    private boolean enabled = true;

    public ProfilingController() {

    }

    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}

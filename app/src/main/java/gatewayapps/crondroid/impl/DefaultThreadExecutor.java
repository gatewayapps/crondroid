package gatewayapps.crondroid.impl;

import gatewayapps.crondroid.spi.ThreadExecutor;

/**
 * Schedules work on a newly spawned thread. This is the default Quartz
 * behavior.
 *
 * @author matt.accola
 * @version $Revision$ $Date$
 */
public class DefaultThreadExecutor implements ThreadExecutor {

    public void initialize() {
    }

    public void execute(Thread thread) {
        thread.start();
    }

}

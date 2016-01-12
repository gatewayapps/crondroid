package gatewayapps.crondroid.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import gatewayapps.crondroid.SchedulerException;

/**
 * This utility calls methods reflectively on the given objects even though the
 * methods are likely on a proper interface (ThreadPool, JobStore, etc). The
 * motivation is to be tolerant of older implementations that have not been
 * updated for the changes in the interfaces (eg. LocalTaskExecutorThreadPool in
 * spring quartz helpers)
 *
 * @author teck
 */
class SchedulerDetailsSetter {

    private SchedulerDetailsSetter() {
        //
    }

    static void setDetails(Object target, String schedulerName,
            String schedulerId) throws SchedulerException {
        set(target, "setInstanceName", schedulerName);
        set(target, "setInstanceId", schedulerId);
    }

    private static void set(Object target, String method, String value)
            throws SchedulerException {
        final Method setter;

        try {
            setter = target.getClass().getMethod(method, String.class);
        } catch (SecurityException e) {
            return;
        } catch (NoSuchMethodException e) {
            // This probably won't happen since the interface has the method
            return;
        }

        if (Modifier.isAbstract(setter.getModifiers())) {
            // expected if method not implemented (but is present on
            // interface)
            return;
        }

        try {
            setter.invoke(target, value);
        } catch (InvocationTargetException ite) {
            throw new SchedulerException(ite.getTargetException());
        } catch (Exception e) {
            throw new SchedulerException(e);
        }
    }

}

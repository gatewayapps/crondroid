/* 
 * Copyright 2001-2009 Terracotta, Inc. 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not 
 * use this file except in compliance with the License. You may obtain a copy 
 * of the License at 
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0 
 *   
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations 
 * under the License.
 */
package gatewayapps.crondroid.listeners;

import gatewayapps.crondroid.JobDetail;
import gatewayapps.crondroid.JobKey;
import gatewayapps.crondroid.SchedulerException;
import gatewayapps.crondroid.SchedulerListener;
import gatewayapps.crondroid.Trigger;
import gatewayapps.crondroid.TriggerKey;

/**
 * A helpful abstract base class for implementors of 
 * <code>{@link gatewayapps.crondroid.SchedulerListener}</code>.
 * 
 * <p>
 * The methods in this class are empty so you only need to override the  
 * subset for the <code>{@link gatewayapps.crondroid.SchedulerListener}</code> events
 * you care about.
 * </p>
 * 
 * @see gatewayapps.crondroid.SchedulerListener
 */
public abstract class SchedulerListenerSupport implements SchedulerListener {

    public void jobAdded(JobDetail jobDetail) {
    }

    public void jobDeleted(JobKey jobKey) {
    }

    public void jobPaused(JobKey jobKey) {
    }

    public void jobResumed(JobKey jobKey) {
    }

    public void jobScheduled(Trigger trigger) {
    }

    public void jobsPaused(String jobGroup) {
    }

    public void jobsResumed(String jobGroup) {
    }

    public void jobUnscheduled(TriggerKey triggerKey) {
    }

    public void schedulerError(String msg, SchedulerException cause) {
    }

    public void schedulerInStandbyMode() {
    }

    public void schedulerShutdown() {
    }

    public void schedulerShuttingdown() {
    }

    public void schedulerStarted() {
    }

    public void schedulerStarting() {
    }

    public void triggerFinalized(Trigger trigger) {
    }

    public void triggerPaused(TriggerKey triggerKey) {
    }

    public void triggerResumed(TriggerKey triggerKey) {
    }

    public void triggersPaused(String triggerGroup) {
    }

    public void triggersResumed(String triggerGroup) {
    }
    
    public void schedulingDataCleared() {
    }

}

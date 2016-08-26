package com.skype.jenkins.notifiers.types;

import com.offbytwo.jenkins.model.BuildResult;
import com.skype.jenkins.dto.ConfigJobDTO;
import com.skype.jenkins.notifiers.NotifierCompleted;

public class NotifierFailure extends NotifierCompleted {

    private static final BuildResult NOTIFIED_BUILD_RESULT = BuildResult.FAILURE;

    public NotifierFailure(final String jenkinsUrl, final ConfigJobDTO jobConfig) {
        super(jenkinsUrl, jobConfig);
    }

    @Override
    public void composeSendNotifications() {
        sendNotifications(prepareMessages(NOTIFIED_BUILD_RESULT));
    }

}

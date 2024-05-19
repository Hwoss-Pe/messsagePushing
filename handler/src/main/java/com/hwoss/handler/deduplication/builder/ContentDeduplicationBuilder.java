package com.hwoss.handler.deduplication.builder;

import com.common.domain.TaskInfo;
import com.common.enums.AnchorState;
import com.common.enums.DeduplicationType;
import com.hwoss.handler.deduplication.DeduplicationParam;

import java.util.Objects;

/**
 * @author Hwoss
 * @date 2024/05/19
 * 内容去重：就是把
 */
public class ContentDeduplicationBuilder extends AbstractDeduplicationBuilder {

    /**
     * 构造方法对抽象类进行赋值
     */
    public ContentDeduplicationBuilder() {
        deduplicationType = DeduplicationType.CONTENT.getCode();
    }

    @Override
    public DeduplicationParam buildDeduplicationParam(String deduplication, TaskInfo taskInfo) {
        DeduplicationParam deduplicationParam = getParamsFromConfig(deduplicationType, deduplication, taskInfo);
        if (Objects.isNull(deduplicationParam)) {
            return null;
        }
        deduplicationParam.setAnchorState(AnchorState.CONTENT_DEDUPLICATION);
        return deduplicationParam;
    }
}

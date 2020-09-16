package com.nepxion.discovery.contrib.database.shardingsphere.processor;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import org.apache.commons.lang3.StringUtils;

import com.nepxion.discovery.contrib.core.processor.ContribProcessor;
import com.nepxion.discovery.contrib.database.shardingsphere.constant.ShardingSphereContribConstant;

public class ShardingSphereContribProcessor implements ContribProcessor {
    @Override
    public void process(String key, String value) {
        if (!StringUtils.equals(key, ShardingSphereContribConstant.SHARDING_SPHERE)) {
            return;
        }

        System.out.println("实现灰度发布切换逻辑 : " + key + "-" + value);
    }
}
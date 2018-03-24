package com.example.jc.myapplication.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jc
 * @time 2018/3/24 下午12:05
 * @desc 容器实现
 */

public class SingleTonManager {
  private static Map<String, Object> sObjectMap = new HashMap<>();

  private SingleTonManager() {
  }

  public static void registerService(String key, Object o) {
    if (!sObjectMap.containsKey(key)) {
      sObjectMap.put(key, o);
    }
  }

  public static Object getService(String key) {
    return sObjectMap.get(key);
  }
}

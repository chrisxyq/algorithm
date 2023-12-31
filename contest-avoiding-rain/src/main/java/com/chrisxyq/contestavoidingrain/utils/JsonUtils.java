package com.chrisxyq.contestavoidingrain.utils;

import com.google.gson.Gson;
import org.springframework.util.StringUtils;

import java.util.HashMap;

public class JsonUtils {

    private static final Gson GSON = new Gson();

    public static <T> String serialize(T object) {
        return  GSON.toJson(object);
    }

    public static <T> T deSerialize(String jsonStr, Class<T> objClass) {
        return GSON.fromJson(jsonStr, objClass);
    }

    public static String toJson(Object obj) {
        try {
            return null == obj ? "" : GSON.toJson(obj);
        } catch (Exception e) {
            return "";
        }
    }
    public static <T> HashMap<Long, T> getMap(String jsonStr, Class<HashMap<Long, T>> clazz) {
        String json = serialize(jsonStr);
        if (!StringUtils.isEmpty(json)) {
            return deSerialize(json, clazz);
        }
        return null;
    }
}

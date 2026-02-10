package com.hackercola.af;

import org.json.JSONObject;

public class JsonCommandParser {
    public static String parse(String json) {
        try {
            JSONObject o = new JSONObject(json);
            return o.getString("action");
        } catch (Exception e) {
            return "error";
        }
    }
}

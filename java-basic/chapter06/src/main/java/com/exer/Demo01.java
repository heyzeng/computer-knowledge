package com.exer;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {

        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("javascript");

        String expression = "Math.abs(${yesterday}-${dayBeforeyesterday})/${dayBeforeyesterday} < 0.1";
        Map<String,String> values = new HashMap<String,String>();
        values.put("dayBeforeyesterday","1");
        values.put("yesterday","1");


        Set<String> strings = values.keySet();
        for(String k:strings){
            expression = expression.replaceAll("\\$\\{"+k+"}",values.get(k));
        }

        System.out.println("表达式："+expression);

        try {
            String result = String.valueOf(scriptEngine.eval(expression));
            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}

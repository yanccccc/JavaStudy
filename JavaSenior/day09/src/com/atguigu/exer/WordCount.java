package com.atguigu.exer;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//统计文本上每个字符出现的个数
public class WordCount {
    //遍历文本的每一个字符；字符及出现的次数保存在Map中；将Map中数据写入文件
    public static void main(String[] args){
        //1.创建Map集合
        Map<Character,Integer> map = new HashMap<>();

        FileReader fr = null;
        FileWriter fw = null;
        try {
            File srcFile = new File("day09\\dbcp.txt");
            fr = new FileReader(srcFile);

            //2.遍历每一个字符,每一个字符出现的次数放到map中
            int c;
            while ((c = fr.read()) != -1){
                //将遍历出来的ASCII码传换成字符
                char ch = (char) c;
                //如果map中不存在该字符
                if(map.get(ch) == null){
                    map.put(ch,1);
                }else {
                    map.put(ch,map.get(ch) + 1);
                }
            }

            //将统计好的字符个数写入新文件中
            File destFile = new File("day09\\wordCount.txt");
            fw = new FileWriter(destFile);

            //统计好的字符序列
            Set<Map.Entry<Character, Integer>> entries = map.entrySet();
            Iterator<Map.Entry<Character, Integer>> iterator = entries.iterator();
            while (iterator.hasNext()){
                Map.Entry<Character, Integer> entry = iterator.next();
                switch (entry.getKey()){
                    case ' ':
                        fw.write("空格 = ：" + entry.getValue());
                        break;
                    case '\t':
                        fw.write("tab建 = ：" + entry.getValue());
                        break;
                    case '\n':
                        fw.write("换行 = ：" + entry.getValue());
                        break;
                    case '\r':
                        fw.write("回车 = ：" + entry.getValue());
                        break;
                    default:
                        fw.write(entry.getKey() + " = :" + entry.getValue());
                }
                fw.write("\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}

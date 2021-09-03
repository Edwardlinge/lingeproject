package com.test;

import java.io.File;

public class DelFiles {

    public static void main(String[] args) {

        File fromfile = new File("G:\\就业班视频");// 源文件夹
        delAllFile(fromfile);
    }


    public static void delAllFile(File path) {
        if (!path.exists() || !path.isDirectory()) { //不是目录
            return ;
        }
        String[] tmpList = path.list();
        if (tmpList != null) {
            for (String aTempList : tmpList) {
                File tmpFile = new File(path, aTempList);
                if (tmpFile.isFile() && tmpFile.getName().endsWith(".itcast")) {
                    tmpFile.delete();
                } else if (tmpFile.isDirectory()) {
                    delAllFile(tmpFile);
                }
            }
        }
        System.out.println("完成了");
    }
}

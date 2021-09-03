package com.test;

/**
 * Created by lin on 2019/3/9.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyTest {

    /*private static final String fromPath = "C:/Users/Administrator/.m2/repository/org/springframework";
    private static final String toPath = "C:/Users/Administrator/Desktop/jpg";*/

    private static final String fromPath = "E:\\Gugoole\\图片助手(ImageAssistant)_批量图片下载器";
    private static final String toPath = "E:\\复制目标";

    public static void main(String[] args) throws Exception {
        File fromFile = new File(fromPath);
        filter(fromFile);
        System.out.println("复制成功！");
    }

    /**
     * 筛选.jpg文件
     *
     * @param fromFile
     * @throws Exception
     */
    private static void filter(File fromFile) throws Exception {
        if (fromFile.isDirectory()) {
            File[] listFiles = fromFile.listFiles();
            for (File subFile : listFiles) {
                filter(subFile);
            }
        } else {
            String name = fromFile.getName();
            // 判断文件后缀是否为.jpg
            int length = name.length();
            /*if (".jpg".equals(name.substring(length - 4))) {
                System.out.print("正在复制" + name + "...");
                copyFile(fromFile, new File(toPath, name));
                System.out.println("√");
            }*/
            //改动改动改动改动改动改动改动改动改动改动
                System.out.print("正在复制" + name + "...");
                copyFile(fromFile, new File(toPath, name));
                System.out.println("√");
        }
    }

    /**
     * 复制文件的方法
     *
     * @param fromFile
     * @param toFile
     * @throws Exception
     */
    private static void copyFile(File fromFile, File toFile) throws Exception {
        FileInputStream is = new FileInputStream(fromFile);
        FileOutputStream os = new FileOutputStream(toFile);
        byte[] b = new byte[1024];
        int temp = 0;
        while ((temp = is.read(b)) != -1) {
            os.write(b, 0, temp);
        }
        is.close();
        os.close();
    }
}

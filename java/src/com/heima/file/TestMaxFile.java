package com.heima.file;

import java.io.File;

public class TestMaxFile {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		File file = new File("E:\\JAVA\\java重要文档");
		System.out.println(file.length());
		int maxSize = 0;
		int minSize = Integer.MAX_VALUE;
		File miniFile = null;
		File maxFile = null;
		File[] files = file.listFiles();
		if (files == null) {
			return;
		}
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory())
				continue;
			if (files[i].length() > maxSize) {
				maxSize = (int) files[i].length();
				maxFile = files[i];
			}

		}
		System.out.println("最大的文件是%s最长是"+maxFile.getAbsoluteFile());
		System.out.println(maxSize);
		//System.out.println("%s,%","hhh",100);
		// TODO Auto-generated method stub

	}

}

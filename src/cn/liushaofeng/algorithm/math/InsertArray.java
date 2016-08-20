package cn.liushaofeng.algorithm.math;

import java.util.ArrayList;
import java.util.List;

/**
 * array algorithm with insert way
 * 
 * @author algorithm.liushaofeng.cn
 * @date 2016年8月20日
 * @version 1.0.0
 */
public class InsertArray
{
	private static List<String> result = null;

	/**
	 * main method
	 * 
	 * @param args
	 *            the string need to array
	 */
	public static void main(String[] args)
	{
		for (String str : args)
		{
			long startTime = System.currentTimeMillis();
			char[] charArray = str.toCharArray();
			for (char c : charArray)
			{
				insert(c);
			}
			System.out.println(str + ":" + result.size() + "(" + (System.currentTimeMillis() - startTime) + ")");
		}
	}

	private static void insert(char c)
	{
		List<String> tempList = new ArrayList<String>();
		if (null == result)
		{
			tempList.add(String.valueOf(c));
		}
		else
		{
			for (String str : result)
			{
				tempList.addAll(update(str, c));
			}
		}
		result = tempList;
	}

	private static List<String> update(String str, char c)
	{
		List<String> dataList = new ArrayList<String>();
		char[] charArray = str.toCharArray();
		for (int j = 0; j <= charArray.length; j++)
		{
			StringBuilder sb = new StringBuilder(str);
			sb.insert(j, c);
			dataList.add(sb.toString());
		}
		return dataList;
	}
}

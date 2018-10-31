package com.utils.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetWorkUtils {
	
	/**
	 * �жϵ�ǰ����״̬�Ƿ�ͨ��
	 * ʹ��  isNetworkAvailable("192.168.60.65")  ���в���
	 * @param ipAddress ip��ַ 
	 * @return
	 */
	public static boolean isNetworkAvailable(String ipAddress) {
		boolean returnBoolean = false;
		try {
			InetAddress ad = InetAddress.getByName(ipAddress);
			try {
				boolean state = ad.isReachable(5000);
				if (state) {
					// System.out.println("���ӳɹ�" + ad.getHostAddress());
					returnBoolean = true;
				} else {
					// System.err.println("����ʧ��");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// �����Ƿ���Դﵽ�õ�ַ
		} catch (UnknownHostException e) {
			// System.err.println("����ʧ��");
		}
		return returnBoolean;
	}

	public static void main(String[] args) {
		System.out.println(isNetworkAvailable("192.168.60.65"));
	}
}

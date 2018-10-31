package com.utils.image;

import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImageUtils {
	
	/**
     * �ȱ�ѹ��ͼ��
     *
     * @param src
     *            Դͼ���ļ�
     * @param target
     *            ѹ����Ҫ��ŵ�Ŀ���ļ�
     * @param maxWidth
     *            ѹ��������������
     * @param maxHeight
     *            ѹ������������߶�
     * @param formatName
     * 			  ͼƬ����
     * @throws java.io.IOException
     */
    public  void transform(String src, String target, int maxWidth, int maxHeight, String formatName) throws Exception {
        String dirStr = target.substring(0, target.lastIndexOf("/") + 1);
        File dir = new File(dirStr);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File srcFile = new File(src);
        File targetFile = new File(target);
        AffineTransform transform = new AffineTransform();
        BufferedImage biSrc = ImageIO.read(srcFile);
        int width = biSrc.getWidth();
        int height = biSrc.getHeight();
        int newWidth = maxWidth;
        int newHeight = (int) (((double) newWidth / width) * height);
        if (newHeight > maxHeight) {
            newHeight = maxHeight;
            newWidth = (int) (((double) newHeight / height) * width);
        }
        double scaleX = (double) newWidth / width;
        double scaleY = (double) newHeight / height;
        transform.setToScale(scaleX, scaleY);
        AffineTransformOp ato = new AffineTransformOp(transform, null);
        BufferedImage biTarget = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_3BYTE_BGR);
        biTarget.getGraphics().drawImage( biSrc.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH), 0, 0, null);
        ato.filter(biSrc, biTarget);
        ImageIO.write(biTarget, formatName, targetFile);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

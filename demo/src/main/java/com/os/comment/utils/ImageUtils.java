package com.os.comment.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.image.*;
import java.io.File;


/**
 * 图片处理工具类
 * @author Administrator
 * 2015-5-18
 */
public class ImageUtils {

	public static void main(String[] args) {
		//放大缩小图片
		scaler("e:/1.jpg","e:/2.jpg",2,false,"jpg");//true放大  false缩小
		//裁剪图片
		cut("e:/1.jpg","e:/3.jpg",100,100,500,500,"jpg");
		//格式转换
		convert("e:/1.jpg", "gif", "e:/4.jpg");
		//转换成黑白图片
		gray("e:/1.jpg","e:/5.jpg","jpg");
		//添加水印文字
		pressText("我是水印文字","e:/1.jpg","e:/1.jpg","宋体",Font.BOLD,Color.white,50, 100, 100, 0.5f,"jpg");
		//添加水印图片
		pressImage("e:/添加水印.jpg", "e:/1.jpg","e:/7.jpg", 0, 0, 0.5f,"jpg");
		//固定图片宽高
		fixed("e:/添加水印.jpg","e:/添加水印.jpg",100,100,"jpg");
	}

	/**
	 * 图片放大缩小
	 * @param oldPath 源图片路径
	 * @param newPath 处理后图片的路径
	 * @param scale 倍数
	 * @param flag true放大  false缩小
	 */
	public static void scaler(String oldPath,String newPath,int scale,boolean flag,String imgType){
		try { 
			BufferedImage img=ImageIO.read(new File(oldPath));
			int width=img.getWidth();
			int height=img.getHeight();
			if(flag==true){//放大
				width=width*scale;
				height=height*scale;
			}else{//缩小
				 width=width/scale;
	             height=height/scale;
			}
			Image image = img.getScaledInstance(width, height,Image.SCALE_SMOOTH);
			BufferedImage outputImage = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);  
            Graphics graphics = outputImage.getGraphics();  
            graphics.drawImage(image, 0, 0, null);// 绘制处理后的图  
            graphics.dispose();
            ImageIO.write(outputImage, imgType, new File(newPath)); 
            System.out.println("处理成功");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * 图片固定宽高
	 * @param oldPath 源文件
	 * @param newPath 处理后的文件
	 * @param width 宽
	 * @param height 高
	 * @param imgType 图片类型
	 */
	public static void fixed(String oldPath,String newPath,int width,int height,String imgType){
		try { 
			BufferedImage img=ImageIO.read(new File(oldPath));
			Image image = img.getScaledInstance(width, height,Image.SCALE_SMOOTH);
			BufferedImage outputImage = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);  
            Graphics graphics = outputImage.getGraphics();  
            graphics.drawImage(image, 0, 0, null);// 绘制处理后的图  
            graphics.dispose();
            ImageIO.write(outputImage, imgType, new File(newPath)); 
            System.out.println("处理成功");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * 图像裁剪
	 * @param oldPath 源图片路径
	 * @param newPath 处理后图片路径
	 * @param x 切片x坐标起点
	 * @param y 切片y坐标起点
	 * @param width 切片宽度
	 * @param height 切片高度
	 */
	public static void cut(String oldPath, String newPath,int x, int y, int width, int height,String imgType) {
        try {
            // 读取源图像
            BufferedImage bi = ImageIO.read(new File(oldPath));
            int srcWidth = bi.getHeight(); // 源图宽度
            int srcHeight = bi.getWidth(); // 源图高度
            if (srcWidth > 0 && srcHeight > 0) {
                Image image = bi.getScaledInstance(srcWidth, srcHeight,Image.SCALE_SMOOTH);
                // 四个参数分别为图像起点坐标和宽高
                // 即: CropImageFilter(int x,int y,int width,int height)
                ImageFilter cropFilter = new CropImageFilter(x, y, width, height);
                Image img = Toolkit.getDefaultToolkit().createImage(new FilteredImageSource(image.getSource(),cropFilter));
                BufferedImage tag = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
                Graphics g = tag.getGraphics();
                g.drawImage(img, 0, 0, width, height, null); // 绘制切割后的图
                g.dispose();
                // 输出为文件
                ImageIO.write(tag,imgType, new File(newPath));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	/**
	 * 添加水印
	 * @param pressText 水印文字
	 * @param oldPath 源图片路径
	 * @param newPath 处理后的图片路径
	 * @param fontName 水印的字体名称
	 * @param fontStyle 水印的字体样式
	 * @param color 水印的字体颜色
	 * @param fontSize 水印的字体大小
	 * @param x 修正值
	 * @param y 修正值
	 * @param alpha 透明度：alpha 必须是范围 [0.0, 1.0] 之内（包含边界值）的一个浮点数字
	 */
	public static void pressText(String pressText,String oldPath, String newPath, String fontName,int fontStyle, Color color,
		int fontSize,int x,int y, float alpha,String imgType) {
		try {
			File img = new File(oldPath);
			Image src = ImageIO.read(img);
			int width = src.getWidth(null);
			int height = src.getHeight(null);
			BufferedImage image = new BufferedImage(width, height,
					BufferedImage.TYPE_INT_RGB);
			Graphics2D g = image.createGraphics();
			g.drawImage(src, 0, 0, width, height, null);
			g.setColor(color);
			g.setFont(new Font(fontName, fontStyle, fontSize));
			g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP,alpha));
			// 在指定坐标绘制水印文字
			g.drawString(pressText, (width - (getLength(pressText) * fontSize))
					/ 2 + x, (height - fontSize) / 2 + y);
			g.dispose();
			ImageIO.write((BufferedImage) image, imgType, new File(newPath));// 输出到文件流
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	 /**
     * 计算text的长度（一个中文算两个字符）
     * @param text
     * @return
     */
    public static int getLength(String text) {
        int length = 0;
        for (int i = 0; i < text.length(); i++) {
            if (new String(text.charAt(i) + "").getBytes().length > 1) {
                length += 2;
            } else {
                length += 1;
            }
        }
        return length / 2;
    }

    /**
     * 给图片添加图片水印
     * @param pressImg 水印图片
     * @param oldPath 源图像地址
     * @param newPath 目标图像地址
     * @param x 修正值。 默认在中间
     * @param y 修正值。 默认在中间
     * @param alpha 透明度：alpha 必须是范围 [0.0, 1.0] 之内（包含边界值）的一个浮点数字
     */
    public static void pressImage(String pressImg, String oldPath,String newPath,int x, int y, float alpha,String imgType) {
        try {
            File img = new File(oldPath);
            Image src = ImageIO.read(img);
            int wideth = src.getWidth(null);
            int height = src.getHeight(null);
            BufferedImage image = new BufferedImage(wideth, height,
                    BufferedImage.TYPE_INT_RGB);
            Graphics2D g = image.createGraphics();
            g.drawImage(src, 0, 0, wideth, height, null);
            // 水印文件
            Image src_biao = ImageIO.read(new File(pressImg));
            int wideth_biao = src_biao.getWidth(null);
            int height_biao = src_biao.getHeight(null);
            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP,
                    alpha));
            g.drawImage(src_biao, (wideth - wideth_biao) / 2,
                    (height - height_biao) / 2, wideth_biao, height_biao, null);
            // 水印文件结束
            g.dispose();
            ImageIO.write((BufferedImage) image,  imgType, new File(newPath));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	/**
	 * 图像类型转换
	 * @param oldPath 源图片路径
	 * @param formatName 要转换的格式
	 * @param newPath 处理后的图片路径
	 */
	public static void convert(String oldPath, String formatName, String newPath) {
        try {
            File f = new File(oldPath);
            f.canRead();
            f.canWrite();
            BufferedImage src = ImageIO.read(f);
            ImageIO.write(src, formatName, new File(newPath));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	/**
	 * 图片转换成黑白
	 * @param oldPath
	 * @param newPath
	 */
	public static void gray(String oldPath, String newPath,String imgType) {
		try {
			BufferedImage src = ImageIO.read(new File(oldPath));
			ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
			ColorConvertOp op = new ColorConvertOp(cs, null);
			src = op.filter(src, null);
			ImageIO.write(src, imgType, new File(newPath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

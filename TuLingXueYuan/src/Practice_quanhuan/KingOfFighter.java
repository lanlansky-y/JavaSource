package Practice_quanhuan;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Scanner;

public class KingOfFighter {
	public static void main(String[] args) throws MalformedURLException {
		Scanner input=new Scanner(System.in);
		//播放音乐代码
		File sound1=new File("sounds/林俊杰 - 可惜没如果.wav");
		AudioClip sound_choose=Applet.newAudioClip(sound1.toURL());
		//播放音乐
		sound_choose.play();
		
		//开始游戏
		//双方选角色
		System.out.println("请选择角色");
		
		String username1=input.next();
		String username2=input.next();
		System.out.println(username1+" VS "+username2);
		//音乐停止
		sound_choose.stop();
		//初始化双方的数据(体力值默认100)
		int hp1=100,hp2=100;
		int attack1=0,attack2=0;
		//使用循环模拟对战过程
		while(hp1>0 && hp2>0){
			attack1=(int)(Math.random()*12345) % 11+5;
			attack2=(int)(Math.random()*12345) % 11+5;
			hp2 -= attack1;
			if (hp2<0) {
				break;
			}
			hp1 -= attack2;
		}
		//打印最终结果
		System.out.println("KO!");
		if (hp1>0) {
			System.out.println(username1+"获胜！");
			System.out.println(username1+" "+hp1);
			System.out.println(username2+" "+hp2);
		}
		else{
			System.out.println(username2+"获胜！\n血量为"+hp2);
			System.out.println(username1+" "+hp1);
			System.out.println(username2+" "+hp2);
		}
	}
}

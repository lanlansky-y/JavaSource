package Practice_quanhuan;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Scanner;

public class KingOfFighter {
	public static void main(String[] args) throws MalformedURLException {
		Scanner input=new Scanner(System.in);
		//�������ִ���
		File sound1=new File("sounds/�ֿ��� - ��ϧû���.wav");
		AudioClip sound_choose=Applet.newAudioClip(sound1.toURL());
		//��������
		sound_choose.play();
		
		//��ʼ��Ϸ
		//˫��ѡ��ɫ
		System.out.println("��ѡ���ɫ");
		
		String username1=input.next();
		String username2=input.next();
		System.out.println(username1+" VS "+username2);
		//����ֹͣ
		sound_choose.stop();
		//��ʼ��˫��������(����ֵĬ��100)
		int hp1=100,hp2=100;
		int attack1=0,attack2=0;
		//ʹ��ѭ��ģ���ս����
		while(hp1>0 && hp2>0){
			attack1=(int)(Math.random()*12345) % 11+5;
			attack2=(int)(Math.random()*12345) % 11+5;
			hp2 -= attack1;
			if (hp2<0) {
				break;
			}
			hp1 -= attack2;
		}
		//��ӡ���ս��
		System.out.println("KO!");
		if (hp1>0) {
			System.out.println(username1+"��ʤ��");
			System.out.println(username1+" "+hp1);
			System.out.println(username2+" "+hp2);
		}
		else{
			System.out.println(username2+"��ʤ��\nѪ��Ϊ"+hp2);
			System.out.println(username1+" "+hp1);
			System.out.println(username2+" "+hp2);
		}
	}
}

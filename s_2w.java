package s_2w;
import java.util.Scanner;

public class s_2w {
	/*ʹ�ö�ά���飬ͨ����������10��ͬѧ��3�ſγɼ�������ɼ���
	 * �ɼ������:ÿ��ͬѧ�ĳɼ����ܷ֡�ƽ���ּ��������������
	 * ����༶ÿ1�ſε�ƽ���֡���߷ֺ���ͷ֡�
*/
	public static void main(String[] args) {
		System.out.println("������������ʮλͬѧ�ĳɼ�");
		Scanner sc=new Scanner(System.in);
		double [][] gra=new double[10][3];
		double sum[]=new double[10];
		double ave[]=new double[10];
		int fail[]=new int[10];
		double ksum[]=new double[3];
		double kave[]=new double[3];
		double kmax[]=new double[3];
		double kmin[]=new double[3];
		//����
		for(int i=0;i<10;i++) {
			System.out.println("�������"+(i+1)+"λͬѧ�ĳɼ�");
			for(int j=0;j<3;j++) {
				System.out.print("��"+(j+1)+"��ѧ�Ƶĳɼ���");
				gra[i][j]=sc.nextDouble();
			}
		}
		//ÿλͬѧ�����ݴ���
		for(int i=0;i<10;i++) {
			for(int j=0;j<3;j++) {
				sum[i]+=gra[i][j];
				if(gra[i][j]<60) {
					fail[i]++;
				}
			}
			ave[i]=sum[i]/3.0;
		}
		//����ѧ�����ֵ����Сֵ
		for(int i=0;i<3;i++) {
			kmax[i]=gra[0][i];
			kmin[i]=gra[0][i];
		}
		//ÿ��ѧ�����ݴ���
		for(int i=0;i<10;i++) {
			for(int j=0;j<3;j++) {
				ksum[j]+=gra[i][j];
				if(gra[i][j]>kmax[j]) {
					kmax[j]=gra[i][j];
				}
				if(gra[i][j]<kmin[j]) {
					kmin[j]=gra[i][j];
				}
			}
		}
		//ÿ��ѧ��ƽ��������	
		for(int i=0;i<3;i++) {
			kave[i]=ksum[i]/10.0;
		}
		//��ӡÿλͬѧ����
		for(int i=0;i<10;i++) {
			System.out.print("��"+(i+1)+"λͬѧ���Ƴɼ�Ϊ��");
			for(int j=0;j<3;j++) {
				System.out.print(gra[i][j]+" ");
			}
			System.out.print("�ܷ�Ϊ��"+sum[i]+" ƽ����Ϊ��"+ave[i]+" �����������Ϊ"+fail[i]+"\n");
		}
		//��ӡÿ��ѧ������
		for(int i=0;i<3;i++) {
			System.out.print("��"+(i+1)+"��ѧ��ƽ���ɼ�Ϊ��"+kave[i]+" ��߷֣�"+kmax[i]+" ��ͷ֣�"+kmin[i]+"\n");
		}
	}
}

package s_2w;
import java.util.Scanner;

public class s_2w {
	/*使用二维数组，通过键盘输入10个同学的3门课成绩，输出成绩表，
	 * 成绩表包括:每个同学的成绩、总分、平均分及不及格的门数。
	 * 输出班级每1门课的平均分、最高分和最低分。
*/
	public static void main(String[] args) {
		System.out.println("请在下面输入十位同学的成绩");
		Scanner sc=new Scanner(System.in);
		double [][] gra=new double[10][3];
		double sum[]=new double[10];
		double ave[]=new double[10];
		int fail[]=new int[10];
		double ksum[]=new double[3];
		double kave[]=new double[3];
		double kmax[]=new double[3];
		double kmin[]=new double[3];
		//输入
		for(int i=0;i<10;i++) {
			System.out.println("请输入第"+(i+1)+"位同学的成绩");
			for(int j=0;j<3;j++) {
				System.out.print("第"+(j+1)+"门学科的成绩：");
				gra[i][j]=sc.nextDouble();
			}
		}
		//每位同学的数据处理
		for(int i=0;i<10;i++) {
			for(int j=0;j<3;j++) {
				sum[i]+=gra[i][j];
				if(gra[i][j]<60) {
					fail[i]++;
				}
			}
			ave[i]=sum[i]/3.0;
		}
		//假设学科最大值、最小值
		for(int i=0;i<3;i++) {
			kmax[i]=gra[0][i];
			kmin[i]=gra[0][i];
		}
		//每个学科数据处理
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
		//每个学科平均数处理	
		for(int i=0;i<3;i++) {
			kave[i]=ksum[i]/10.0;
		}
		//打印每位同学数据
		for(int i=0;i<10;i++) {
			System.out.print("第"+(i+1)+"位同学各科成绩为：");
			for(int j=0;j<3;j++) {
				System.out.print(gra[i][j]+" ");
			}
			System.out.print("总分为："+sum[i]+" 平均分为："+ave[i]+" 不及格的门数为"+fail[i]+"\n");
		}
		//打印每个学科数据
		for(int i=0;i<3;i++) {
			System.out.print("第"+(i+1)+"门学科平均成绩为："+kave[i]+" 最高分："+kmax[i]+" 最低分："+kmin[i]+"\n");
		}
	}
}

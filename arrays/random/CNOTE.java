import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CNOTE{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());

		while(test-- > 0){

			String[] xykn = br.readLine().split(" ");

			int xPagesTotal = Integer.parseInt(xykn[0]);
			int yPagesLeft = Integer.parseInt(xykn[1]);
			int kMoney = Integer.parseInt(xykn[2]);
			int nSize = Integer.parseInt(xykn[3]);
			
			String[] array = new String[nSize];
			for(int i = 0; i < nSize; i++){
				array[i] = br.readLine();
			}
			boolean check = false;
			for(int i = 0; i < nSize; i++){
				String[] curr = array[i].split(" ");

				int p1 = Integer.parseInt(curr[0]);
				int c1 = Integer.parseInt(curr[1]);
				int pagesToWrite = Math.abs(xPagesTotal - yPagesLeft);
				if(p1 >= pagesToWrite && c1 <= kMoney){
					check = true;
					break;
				}
			}

			if(check)
				System.out.println("LuckyChef");

			else 
				System.out.println("UnluckyCHEf");
		}
	}
}



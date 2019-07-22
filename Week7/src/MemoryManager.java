import java.util.Scanner;
public class MemoryManager{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int time = in.nextInt();
		int total = in.nextInt();
		int arr[] = new int[total];
		String opera = "";
		int count =0;
		int index=0;
		in.nextLine();
		while ( time-->0)			
		{      
			    int memory=0;
			    String str = in.nextLine();
				String Arr[]= str.split(" ");
				if ( str.contains(" "))
				{
				   opera = Arr[0];
				   memory = Integer.parseInt(Arr[1]);
				}
				else 
				{
					opera = str;
				}				
				if(opera.equals("alloc"))
				{   int Tem =0; //记录是否执行操作
				    count= count +1;
				    if ( memory>total)
				    {
				    	Tem =0;
				    	//count =count -1;
				    }
				    else
				    {
				    	if ( count == 1)
						{
							for ( int i =0; i < memory; i ++)
							{
								arr[i] = count;
								Tem =1;
							}				
						}
						else
						{   int count_2=0;//判断是否有充足的待分配空间
							for (int i =0; i < total; i ++ )
							{								
								if (arr[i]==0)
								{
									index=i;
									for( int k =0; k < memory; k ++)
									{
										if( arr[i+k]==0)
										{
											count_2++;
										}									
									}
									if ( count_2==memory)//表示当前有剩余充足的空间
									{  
										for (int j =index; j <memory+index ; j ++ )
										{
											arr[j] = count;
											Tem =1;
										}
										break;
									}
									else//表示当前位置的剩余存储空间不足
									{
										Tem =0;
										
									}	
									break;
								}																
							}				
						}
				    }				    					
					if( Tem!=0)
					{
						System.out.println(count);
					}
					else
					{
						count = count -1;
						System.out.println("NULL");
					}
				}
				else if ( opera.equals("erase"))
				{
					int flag = 0;
					for( int i =0; i < total;i ++)
					{
						if (arr[i] == memory)
						{
							arr[i] =0;
							flag =1;
						}
					}
					if( flag==0)
					{
						System.out.println("ILLEGAL_ERASE_ARGUMENT");
					}
				}			
			else if ( opera.equals("defragment"))
			{ 
				int flag_2=0;//判断内存条是否为空
				int index_2=0;
				for ( int i=0; i < total; i ++)
				{
					if( i< total -1)
					{
						if (arr[i]!=0)
						{
							index_2 =i;
							flag_2 =1;
							break;
						}						
					}
					else
					{
						break;
					}					
				}
				if( flag_2!=0)
				{
					for ( int i=0; i < total; i ++)
					{
						arr[i]= arr[index_2];
						arr[index_2] =0;
						index_2 ++;
						if ( arr[index_2]==0)
						{
							break;
						}
					}
				}					         			
			}
		}			
		in.close();
	}
}
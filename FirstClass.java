public class bankAccount {
	
		private long accountNumber = 0;
		private int accountOpen = 0;
		private int accountClose = 0;
		private double accountBalance = 0;
		private short accountType = 0;
		private char accountStatus = 0;
		private long clientCode = 0;
		
			
		static long getAccountNumber(){
			
			return accountNumber;
		}
	
		static void setAccountNumber(long accountNumber){
				if (accountNumber > 0){
					this.accountNumber = accountNumber;
				}
			return;
		}
		
		static int getAccountOpen(){
			
			return accountOpen;
		}
	
		static void setAccountOpen(int accountOpen){
				if (accountOpen > 0){
					this.accountOpen = accountOpen;
				}
			return;
		}
		
		static int getAccountClose(){
			
			return accountClose;
		}
	
		static void setAccountClose(int accountClose){
				if (accountClose > 0){
					this.accountClose = accountClose;
				}
			return;
		}
	
		static double getAccountBalance(){
			
			return accountBalance;
		}
	
		static void setAccountBalance(double accountBalance){
				if (accountBalance > 0){
					this.accountBalance = accountBalance;
				}
			return;
		}
		
		static short getAccountType(){
			
			return accountType;
		}
	
		static void setAccountType(short accountType){
				if (accountType > 0){
					this.accountType = accountType;
				}
			return;
		}
	
		static char getAccountStatus(){
			
			return accountStatus;
		}
	
		static void setAccountStatus(char accountStatus){
				if (accountStatus > 0){
					this.accountStatus = accountStatus;
				}
			return;
		}
	
		static long getClientCode(){
			
			return clientCode;
		}
	
		static void setClientCode(long clientCode){
				if (clientCode > 0){
					this.clientCode = clientCode;
				}
			return;
		}
}
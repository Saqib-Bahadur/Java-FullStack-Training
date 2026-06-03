package com.dayThree;

class Admin {
	String AdminAccess(String readPermission,String writePermission,String executePermission) {
		String rolls = readPermission+writePermission+executePermission;
		return rolls;
	}
	int AdminAccess(int readPermission,int writePermission) {
		int rolls = readPermission+writePermission;
		return rolls;
	}
	int AdminAccess(int permission) {
		int rolls = permission;
		return rolls;
	}
}
public class OverLoading {
	public static void main(String args[]) {
		
		Admin admin = new Admin();
		String res = admin.AdminAccess(" r "," w "," e ");
		int temp = admin.AdminAccess(0, 1);
		System.out.println("String method Permissions : "+res);
		System.out.println("int method Permissions : "+temp);
		System.out.println("Admin Mode : "+admin.AdminAccess(1));
	}

}

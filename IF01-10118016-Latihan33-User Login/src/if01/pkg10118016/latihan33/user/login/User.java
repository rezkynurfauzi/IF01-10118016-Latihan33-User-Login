package if01.pkg10118016.latihan33.user.login;

/**
 *
 * @author Rezky
 */
public class User {

	private final String username = "RezkyNurFauzi";
	private final String password = "suksesgan";
	private boolean statusAkun;

	
	private boolean cekAkun(String parusername, String parpassword) {
                            if((parusername.equals(this.username)) && (parpassword.equals(this.password))){
                                this.statusAkun = true;
                            }
                            else{
                                this.statusAkun = false;
                            }
	       return this.statusAkun;
	}

	private void hasilLogin(boolean status, String parusername) {
                                status = this.statusAkun;
                                
                                if(status == true){
                                    System.out.println("********Hallo " + parusername + "********");
                                    System.out.println("Selamat Datang Di Aplikasi Sederhana ini");
                                }
                                else{
                                    System.out.println("Oooops, Username atau Password anda salah ");
                                }
                                
                                
	}

	public void pengecekanLogin(String parusername, String parpassword) {
                            cekAkun(parusername, parpassword);
                            hasilLogin(statusAkun, parusername);
	}
}
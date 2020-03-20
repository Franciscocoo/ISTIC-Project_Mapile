					
import java.io.*;

public class TPileRep {

    // pile pour gerer les reprises de code (branchements en avant et chaines de reprise)
    // ----------------------------------------------------------------------------------

    
    	private final int MAXPILEREP=50;
    	private int ip; // sommet de pile
    	private int [] T = new int [MAXPILEREP+1];
    	
    	public void empiler(int x) {
    		if (ip==MAXPILEREP) 
    		UtilLex.messErr("debordement de la pile de gestion des reprises");
    		ip=ip+1;T[ip]=x;
    	}
    	
		public int depiler() {
		    if (ip==0) 
			UtilLex.messErr("action depiler sur chaine de reprise vide ");
		    ip=ip-1;return T[ip+1];
		}
		// constructeur
		public TPileRep() {ip=0;}
		
		public void affiche() {
			String res = "{";
			int var =  ip;
			while(var!=0) {
				res = res + " " + T[var] + "  ;";
				var--;
			}
			res = res +  "}";
			System.out.println(res);
		}
		
		public String isEmpty() {
			if (ip == 0) {
				return "Pile vide";
			} else {
				return "Pile non vide";
			}		
		}
    } // TpileRep
   

    
    
    
    
    
    
    
    
    
    
    
    
    
 
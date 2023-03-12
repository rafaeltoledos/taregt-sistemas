import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;

import org.json.simple.JSONObject;

import entities.Faturamento;


public class Program {
	
	public static void main(String[] args) {
		
		JSONObject jSONObject;
		JSONParser parser = new JSONParser();
		
		Faturamento faturamento = new Faturamento();
		
		try {
			jSONObject = (JSONObject) parser.parse(new FileReader("dados (1).json"));
			
			faturamento.setDia((String) jSONObject.get("dia"));
			faturamento.setValor((String) jSONObject.get("valor"));
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch (ParseException ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
	
}

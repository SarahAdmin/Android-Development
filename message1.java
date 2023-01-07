import android.content.Context; 
import android.widget.Toast; 


public class message1 { 
  public static void message(Context contextOne, String message) { 
    Toast.makeText(contextOne, message, Toast.LENGTH_LONG).show();
  }
}

import java.util.* ;
import org.apache.thrift.TException;

public class MultipicationHandler implements MultipicationService{
	
	@Override
	public int multiply(int i, int j)
	{
		System.out.println("Multipication of "+i+" and "+j+" : ");
		return (i*j);
	}
}

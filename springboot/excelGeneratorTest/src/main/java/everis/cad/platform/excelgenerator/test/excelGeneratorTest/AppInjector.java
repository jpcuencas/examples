package everis.cad.platform.excelgenerator.test.excelGeneratorTest;

import com.everis.utils.excel.CadImplementation;
import com.google.inject.AbstractModule;

public class AppInjector
		extends AbstractModule
{

	@Override
	protected void configure ( )
	{
		// bind the service to implementation class
		// bind(MessageService.class).to(EmailService.class);

		// bind MessageService to Facebook Message implementation
		bind ( CadImplementation.class ).to ( CadImplementation.class );

	}

}
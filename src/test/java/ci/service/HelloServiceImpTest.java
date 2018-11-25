package ci.service;

import static org.mockito.Mockito.spy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class HelloServiceImpTest {

	@InjectMocks
	private HelloServiceImp service;
	
	@Test
	public void testSayHello(){
		HelloServiceImp spyService = spy(service);
		
		String world = spyService.sayHello();
		
		assertThat("hello from spring RESTful web server!", equalTo(world));
	}
}
